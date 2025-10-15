pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out code...'
                git branch: 'main', url: 'https://github.com/koyal30/devops-lab.git'
            }
        }
        stage('Compile Java Card Applet') {
            steps {
                echo 'Compiling HelloWorld.java with Java Card API...'
                bat 'javac -cp "C:\\JavaCardSDK\\lib\\api_classic-3.2.0.jar" HelloWorld.java'
            }
        }
        stage('Convert to CAP') {
            steps {
                echo 'Converting .class to .cap file...'
                bat 'C:\\JavaCardSDK\\bin\\converter.bat -classdir "%WORKSPACE%" -out "%WORKSPACE%\\CAP" -applet A000000062010101:HelloWorld HelloWorld'
            }
        }
        stage('Finish') {
            steps {
                echo 'CAP file should now be in %WORKSPACE%\\CAP'
            }
        }
    }
}