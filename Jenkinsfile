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
                bat 'mvn -v'
                bat 'mvn clean install'
            }
        }

        stage('Run') {
            steps {
                echo 'Running jar...'
                bat 'dir target'
                bat 'java -jar target\\*.jar'
            }
        }
    }
}