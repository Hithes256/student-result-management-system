pipeline {
    agent any

    tools {
        maven 'Maven-3'
        jdk 'Java-17'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }
}
