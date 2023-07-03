pipeline {
    agent none
    stages {
        stage('List Files') {
            steps {
                script {
                    sh "ls -al"
                }
            }
        }
    }
}