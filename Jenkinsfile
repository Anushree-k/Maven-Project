pipeline {
    agent any
    
    triggers {
        githubPush()
    }

    stages {
        stage('Git checkout') {
            steps {
                git branch: 'main', credentialsId: 'git-cred-jenkins', url: 'https://github.com/Anushree-k/Maven-Project.git'
            }
        }
        stage('Build Maven project') {
            steps {
                bat 'mvn -B clean package'
            }
        }
        stage('Archive Artifact') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }

        stage('Execute the file') {
            steps {
                bat 'java -jar target/my-app-1.0-SNAPSHOT.jar'
            }
        }
    }
     post {
        success {
            echo 'Build completed successfully!'
        }
        failure {
            echo 'Build failed!'
        }
    }
    
}
