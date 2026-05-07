pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Build & Test') {
            steps {
                bat 'mvn clean test'
            }
        }

        stage('Upload Results to Xray') {
            steps {
                bat 'echo Uploading Results to Xray'
            }
        }
    }
}