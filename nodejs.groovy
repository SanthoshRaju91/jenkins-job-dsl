job('nodejs-job-dsl') {
    scm {
        git('git://github.com/wardviaene/docker-demo.git') { node ->
            node / gitConfigName('DSL User')
            node / gitConfigEmail('jenkins-dsl@do.com')
        }
    }
    trigger {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs')
    }
    steps {
        shell("npm install")
    }
}
