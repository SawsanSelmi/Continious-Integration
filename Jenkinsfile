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
        bat 'mvn clean package deploy:deploy-file -DgroupId=tn.esprit.esponline -DartifactId=tp-spring-Injection2-Java -Dversion=1.0 -DgeneratePom=true -Dpackaging=jar -DrepositoryId=deploymentRepo -Durl=http://localhost:8081/repository/maven-releases/ -Dfile=target/tp-spring-Injection2-Java-1.0.jar'
      }
    }

  }
}