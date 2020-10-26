pipeline {
  agent any
  stages {
    stage('BUILD') {
      steps {
        bat 'mvn compile'
        bat 'mvn test'
        bat 'mvn sonar:sonar -Dsonar.projectKey=test1 -Dsonar.host.url=http://localhost:9000 -Dsonar.login=b6b09c40bd32915322f0184a97b28fd37762981c'
      }
    }

  }
}