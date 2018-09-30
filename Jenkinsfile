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
    stage('build mvn') {
      parallel {
        stage('build mvn') {
          steps {
            readMavenPom(file: 'pom.xml')
          }
        }
        stage('install mvn') {
          steps {
            bat 'mvn install'
          }
        }
      }
    }
  }
}