pipeline {
  agent any
  options {
    buildDiscarder(logRotator(numToKeepStr: '5'))
  }
  stages {
    stage('Scan') {
      steps {
        withSonarQubeEnv(installationName: 'Sonar') {
          sh 'C:\Users\VirtualMachine\Downloads\apache-maven-3.6.2\bin\mvn sonar:sonar'
        }
      }
    }
  }
}
