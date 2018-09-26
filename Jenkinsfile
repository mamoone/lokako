pipeline {
  agent any
  stages {
    stage('init') {
      steps {
        echo 'c\'est une initialisation '
      }
    }
    stage('clone git') {
      steps {
        git(url: 'https://github.com/mamoone/lokako', branch: 'master', poll: true)
      }
    }
    stage('mvn build') {
      steps {
        sh 'mvn install'
      }
    }
  }
}