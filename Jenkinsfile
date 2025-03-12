pipeline {
    agent any
    stages {
        stage('Checkout Code') {
            steps {
                git 'https://github.com/saiakhil0415/git-maven-simple.git'
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
        stage('Deploy') {
            steps {
                bat 'java -jar target/git-maven-simple-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}
 