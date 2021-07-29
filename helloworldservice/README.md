# THIS IS THE BACKEND PROJECT STRUCTURE TEMPLATE FOR PRINTING HELLO WORLD

+   THE MAIN CODE IS IN `src/main/java/com/sapient/<api service package name>/`
+   THE TEST CODE IS IN `src/test/java/com/sapient/<api service package name>/`

## PLEASE NOTE:
+ CHANGE REQUIRED IN "src/main/resources/application.properties"
    + line 2 : spring.datasource.username     `DB username`
    + line 3 : spring.datasource.password     `DB password`
    + line 1 : spring.datasource.url -        `jdbc:postgresql://<DB Url>/<DB NAME>`
+ CHANGE FINAL NAME OF JAR FILE IN "pom.xml"
    + line 87 : `<finalName>{_yourservicename_}</finalName>`

## NAMING CONVENTIONS:
+ **API FOLDERS, PACKAGES** - lowercase  
+ **CLASSES, INTERFACES** - NounsInPascalCase *(FirstLetterOfEachWordShouldBeCapital)*
+ **FUNCTIONS** - camelCaseThatDescribesWhatTheMethodDoes *(lowerCaseFirstWordRestAllCamelCase)*
+ **VARIABLES** - camelCaseThatDescribesThePurposeOfTheVariable *(lowerCaseFirstWordRestAllCamelCase)*
+ **CONSTANTS** - UPPERCASE
+ USE README FILES TO DESCRIBE THE API FOLDER PURPOSE
+ USE COMMENTS FOR VARIABLES AND METHODS, WHEREVER NEEDED
+ NO USE OF ACRONYMS
+ ALL NAMES SHOULD CONVEY THE PURPOSE

## FOLDER STRUCTURE:
+ **advice:**       to support cross-cutting concerns, such as logging, profiling, etc
+ **annotation:**   to define custom annotation
+ **controller:**   to process incoming REST API requests
+ **dto:**          to carry data from controller to services (dto: data transfer object)
+ **exception:**    to define custom exception
+ **model:**        to declare objects that define schema and persist in the database
+ **repository:**   to define interfaces for models, with functions to interact with database
+ **service:**      to define classes that provide functionalities to our models
+ **util:**         to define utility classes that can be used by other classes
+ **validator:**    to define classes that will validate the incoming request
+ **vo:**           to define objects that help dto carry data (vo: value object)

## MAVEN AND DOCKER

### 1 Building maven project
+ Commands to build maven jar
```shell
$ mvn clean package
```

### 2 Building Docker Image

+ Commands to build docker image
```shell
$ docker build -t <ImageName:Version> . 
```

+ Command to run the container
```shell
$ docker run --rm --name <ContainerName> -p <HostPort>:80 <ImageName:Version>
```
