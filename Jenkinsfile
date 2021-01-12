pipeline {
  agent { docker 'gradle:6.3' }
  stages {
    stage('build') {
      steps {
        sh 'gradle --version'
        sh 'gradle build'
      }
    }
  }
}