pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/Hithes256/student-result-management-system.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t student-result-app .'
            }
        }

        stage('Docker Run') {
            steps {
                bat '''
                docker rm -f student-result || echo "No container"
                docker run -d -p 9090:9090 --name student-result student-result-app
                '''
            }
        }
    }
}
