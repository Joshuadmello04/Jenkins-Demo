pipeline {
    agent any

    tools {
        jdk 'JAVA_HOME'
        maven 'MAVEN_HOME'
    }

    stages {

        stage('Build') {
            steps {
                echo 'Building project...'
                bat 'mvn clean install'
            }
        }

        stage('Run') {
            steps {
                echo 'Running jar...'
                bat 'java -jar target\\jenkins-calc-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}