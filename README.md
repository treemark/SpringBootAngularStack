
# A full stack demonstration of spring boot and angular. 

### This project is an opensource example for anyone wishing to learn about full stack web development

#### Demonstrated features include:
- Swagger and openAPI generated angular stub for back-end communication/orchestration layer
- A containerized unit test framework supplied by docker-compose, Mockito and junit
- A gradle build framework that manages both angular and spring projects in a single repo


### Prerequisites

- Idea IDE https://www.jetbrains.com/idea/download/

#### For Mac
- Home brew -- https://docs.brew.sh/Installation
- Java `brew install openjdk@17`
- Node -- `brew install node`
- AngularCLI -- `npm install -g @angular/cli`
- Docker Desktop -- https://docs.docker.com/desktop/install/mac-install/

#### For Windows
- Open JDK -- https://jdk.java.net/19/
- Node -- https://nodejs.org/en/download
- AngularCLI -- `npm install -g @angular/cli`
- Docker Desktop https://docs.docker.com/desktop/install/windows-install/


### Getting started with Idea and Gradle
 - Open Idea
 - Select file -> New Project from Source Control
 - Paste https://github.com/treemark/SpringBootAngularStack.git into the URL field
 - Click 'terminal' tab at the bottom of Idea IDE.
 - Type: `./gradlew assemble at the command line

### Starting the webserver from inside idea
 - Find the ServiceApplication class 
 - right click and select run ServiceApplcation.main()
 - Open web browser and type http://localhost:8080/sample-api/swagger-ui/index.html to see available endpoints

#### To create a new UI module

`ng  new <ui module name>`

