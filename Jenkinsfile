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
        sh 'mvn install'
      }
    }
  }
}