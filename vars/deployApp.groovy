def call(String ImageName, String HubUser){
  sh "docker run -d -p 8081:8080 ${HubUser}/${ImageName}:latest"
}
