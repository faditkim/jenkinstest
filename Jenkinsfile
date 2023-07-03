pipeline {
    // don't use 'agent any'
    // 'agent none' allows the job to continue on the same node with the same files
    agent any

    stages {
        stage('Greetings') {
            steps {
                script {
                    sh "echo Hello World!!"
                }
            }
        }

        stage ('load') {
            steps {
                load './test2/jenkinstest/jenkins/sub1.groovy'
            }
        }
    }
}