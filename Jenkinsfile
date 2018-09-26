pipeline {
  agent any
  stages {
    stage('init') {
      steps {
        echo 'c\'est une initialisation '
      }
    }
    stage('build maven') {
      steps {
        dockerNode(image: 'maven:3.3.9-jdk-8')
      }
    }
  }
}