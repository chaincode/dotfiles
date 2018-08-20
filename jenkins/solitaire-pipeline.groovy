stage 'CI'
node {

    git branch: 'jenkins2-course',
        url: 'https://github.com/g0t4/solitaire-systemjs-course'

    // pull dependencies from npm
    // on windows use: bat 'npm install'
    bat 'npm install'

    // stash code & dependencies to expedite subsequent testing
    // and ensure same code & dependencies are used throughout the pipeline
    // stash is a temporary archive
    stash name: 'project-image',
          excludes: 'test-results/**',
          includes: '**'

    // test with PhantomJS for "fast" "generic" results
    // on windows use: bat 'npm run test-single-run -- --browsers PhantomJS'
    bat 'npm run test-single-run -- --browsers PhantomJS'

    // archive karma test results (karma is configured to export junit xml files)
    step([$class: 'JUnitResultArchiver', testResults: 'test-results/**/test-results.xml'])

}

node('win') {
    bat 'dir'
    bat 'del /S /Q *'  //instead of rm -rf * use del /S /Q * to delete all files
    unstash 'project-image'
    bat 'dir'
}

//parallel integration testing
stage 'Browser Testing'
parallel chrome: {
    runTests("Chrome")
}, firefox: {
    //runTests("Firefox")
}, safari: {
    //runTests("Safari")
}


def runTests(browser) {
    node {
        bat 'del /S /Q *'
        unstash 'project-image'
        bat "npm run test-single-run -- --browsers ${browser}"
        step([$class: 'JUnitResultArchiver', testResults: 'test-results/**/test-results.xml'])
    }
}

input 'Deploy to staging?'
stage name: 'Deploy', concurrency: 1
node {
    bat "echo '<h1>${env.BUILD_DISPLAY_NAME}</h1>' >> app/index.html"
}










