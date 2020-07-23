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
                 withCredentials([usernamePassword(credentialsId: 'docker-credentials', usernameVariable: 'DOCKER_REGISTRY_USER', passwordVariable: 'DOCKER_REGISTRY_PASSWORD')]) {
                   sh './mvnw -DDOCKER_REGISTRY_USER=$DOCKER_REGISTRY_USER -DDOCKER_REGISTRY_PASSWORD=$DOCKER_REGISTRY_PASSWORD jib:build'
                 }
             }
        }
    }
}