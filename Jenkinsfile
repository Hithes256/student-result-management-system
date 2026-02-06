pipeline {
    agent any

    tools {
        jdk 'JDK-21'
        maven 'Maven-3'
    }

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/Hithes256/student-result-management-system.git'
            }
        }

        stage('Build & Test') {
            steps {
                bat 'mvn clean test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t student-result-app:latest .'
            }
        }

        stage('Stop Old Container') {
            steps {
                bat '''
                docker stop student-result-container || exit 0
                docker rm student-result-container || exit 0
                '''
            }
        }

        stage('Run Docker Container') {
            steps {
                bat '''
                docker run -d -p 9090:9090 --name student-result-container student-result-app:latest
                '''
            }
        }

        stage('Code Coverage') {
            steps {
                publishHTML(target: [
                    allowMissing: false,
                    alwaysLinkToLastBuild: true,
                    keepAll: true,
                    reportDir: 'target/site/jacoco',
                    reportFiles: 'index.html',
                    reportName: 'JaCoCo Report'
                ])
            }
        }
    }
}
