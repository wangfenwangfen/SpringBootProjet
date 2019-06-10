pipeline {
  agent any
  stages {
    stage('recuperer_source_git') {
      steps {
        git(url: 'https://github.com/wangfenwangfen/SpringBootProjet.git', branch: 'master')
      }
    }
    stage('build') {
      steps {
        bat 'build.bat'
      }
    }
  }
}