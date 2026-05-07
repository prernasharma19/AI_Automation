pipeline {
    agent any

    tools {
        maven 'Maven3'
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