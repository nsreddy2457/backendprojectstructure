THIS IS THE BACKEND PROJECT STRUCTURE TEMPLATE FOR PRINTING HELLO WORLD

THE MAIN CODE IS IN "src/main/java/com/sapient/helloworldservice/" - CHANGE
THE TEST CODE IS IN "src/test/java/com/sapient/helloworldservice/" - CHANGE
"hellowworldservice" IS SAME AS THE SERVICE API PROJECT NAME, IN WHICH IT IS CONTAINED

PLEASE NOTE:
CHANGE REQUIRED IN "src/main/resources/application.properties"
    line 2 : spring.datasource.username
    line 3 : spring.datasource.password
    UPDATE AS PER YOUR SYSTEM LOGIN DETAILS
CREATE YOUR DATABASE IN POSTGRESQL, AND MENTION IN "src/main/resources/application.properties"
    line 1 : "spring.datasource.url=jdbc:postgresql://localhost:5432/<YOUR DB NAME>"
CHANGE PORT NUMBER IN "src/main/resources/application.properties"
    line 9 : "server.port=<YOUR PORT NO>"
CHANGE FINALNAME OF JAR FILE IN "pom.xml"
    line 87 : "<finalName>{_yourservicename_}</finalName>"

NAMING CONVENTIONS:
API FOLDERS, PACKAGES - lowercase  
CLASSES, INTERFACES -   NounsInPascalCase (FirstLetterOfEachWordShouldBeCapital)
FUNCTIONS -             camelCaseThatDescribesWhatTheMethodDoes (lowerCaseFirstWordRestAllCamelCase)
VARIABLES -             camelCaseThatDescribesThePurposeOfTheVariable (lowerCaseFirstWordRestAllCamelCase)
CONSTANTS -             UPPERCASE
USE README FILES TO DESCRIBE THE API FOLDER PURPOSE
USE COMMENTS FOR VARIABLES AND METHODS, WHEREVER NEEDED
NO USE OF ACRONYMS
ALL NAMES SHOULD CONVEY THE PURPOSE

FOLDER STRUCTURE:
advice:                 to support cross-cutting concerns, such as logging, profiling, etc
annotation:             to define custom annotation
controller:             to process incoming REST API requests
datatransferobject:    to carry data from controller to services
exception:              to define custom exception
model:                  to declare objects that define schema and persist in the database
repository:             to define interfaces for models, with functions to interact with database
service:                to define classes that provide functionalities to our models
util:                   to define utility classes that can be used by other classes
validator:              to define classes that will validate the incoming request
valueobject:            to define objects that help dto carry data
