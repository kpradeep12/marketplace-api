pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                    sh './mvnw clean package'
            }
        }
        stage('Build & Publish Image') {
             steps {
                    sh './mvnw jib:build'
             }
        }
    }
}