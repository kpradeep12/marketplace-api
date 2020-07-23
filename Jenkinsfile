pipeline {
    agent any
    environment {
        DOCKER_REGISTRY_USER     = credentials('docker-registry-user')
        DOCKER_REGISTRY_PASSWORD = credentials('docker-registry-password')
    }
    stages {
        stage('Build') {
            steps {
                    echo "DOCKER_REGISTRY_USER ${DOCKER_REGISTRY_USER}"
                    echo "DOCKER_REGISTRY_PASSWORD ${DOCKER_REGISTRY_PASSWORD}"
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