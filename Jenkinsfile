pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git 'YOUR_GITHUB_REPO_URL'
            }
        }

        stage('Build & Test') {
            steps {
                bat 'mvn clean test'
            }
        }

        stage('Upload Results to Xray') {
            steps {

                bat '''
                curl -H "Content-Type: multipart/form-data" ^
                -u your_email:your_api_token ^
                -F "file=@target/surefire-reports/TEST-TestSuite.xml" ^
                "https://sharmaprerna1903.atlassian.net/rest/raven/1.0/import/execution/junit?projectKey=AAP"
                '''
            }
        }
    }
}