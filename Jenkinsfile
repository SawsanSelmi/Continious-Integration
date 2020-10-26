pipeline {
  agent any
  stages {
    stage('BUILD') {
      steps {
        echo 'Complie : Started'
        bat 'mvn compile'
        echo 'Unit Tests Started'
        bat 'mvn test'
        echo 'Send Code quality report to SONAR'
        bat 'mvn sonar:sonar -Dsonar.projectKey=test1 -Dsonar.host.url=http://localhost:9000 -Dsonar.login=b6b09c40bd32915322f0184a97b28fd37762981c'
        bat 'mvn clean package deploy:deploy-file -DgroupId=tn.esprit.esponline -DartifactId=tp-spring-Injection2-Java -Dversion=1.0 -DgeneratePom=true -Dpackaging=jar -DrepositoryId=deploymentRepo -Durl=http://localhost:8081/repository/maven-releases/ -Dfile=target/tp-spring-Injection2-Java-1.0.jar'
      }
    }

  }
}