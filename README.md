### Springboot-Sonarqube-Demo 
#### App Functionality
1. When user hits `http://localhost:8080/message` this application return "Hello World" message stored in postgres database

##### Steps to run the application 

1. Run the containers by executing the following from root :- 
    `docker-compose -f DockerCompose/docker-compose.yml up -d`
    
    This will start 3 containers (1 postgres db for the app)
2. Run the springboot application through GUI or commnad :- `./mvnw spring-boot:run`
3. Check App functionality <br>
    Access the url :- http://localhost:8080/message

##### Steps to check code-quality through sonarqube

1. Setup sonarqube by downloading and unzipping https://www.sonarsource.com/products/sonarqube/downloads/success-download-community-edition/
2. Run sonarqube server based on operating system 
    For MacOS :- 
    ```
    cd bin/macosx-universal-64/ 
    ./sonar.sh start
   ```
3. Login to sonarqube @ `http://localhost:9000/` , Default credentials:- admin | admin
4. Add sonar dependency to project's pom.xml
    ```
    <dependency>
			<groupId>org.sonarsource.scanner.maven</groupId>
			<artifactId>sonar-maven-plugin</artifactId>
			<version>3.10.0.2594</version>
    <dependency>
    ```
5. Get Sonarqube token from MyAccounts dashboard @localhost:9000 and use it in next step
6. Run sonarqube analysis on the project by executing following from the root
    `./mvnw clean install sonar:sonar -Dsonar.token=sqa_973d46e93061f05ba8e33b8ade98ae835cf5b6f7`
7. You should be able to access code quality analysis report at localhost:9000
8. If the code analysis fails at Quality Gate then create a more lenient quality check gate at http://localhost:9000/quality_gates/ and run  step #6 again
