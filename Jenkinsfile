pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                    sh './mvnw clean package'
            }
        }

        post {
             success {
                    archiveArtifacts artifacts: '**/target/*.jar'
            }
        }
    }
}