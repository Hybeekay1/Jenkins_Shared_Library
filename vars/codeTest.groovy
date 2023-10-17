def call(credentialsId){

    withSonarQubeEnv(credentialsId: credentialsId) {
         sh 'clean install sonar:sonar'
    }
}
