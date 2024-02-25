# Property Evaluation System

The Property Evaluation System is a web application

## Technologies Used

- Angular 16
- Spring Boot 3.1.0
- Camunda 8.4.3
- Camunda Operate 8.4.3
- MySQL
- Elasticsearch 8.9.1
- Visual Studio Code
- Camunda Modeler

## Installation

Before installing the Property Evaluation System, ensure you have the following prerequisites installed:

- Java 21
- Camunda 8.4.3
- Camunda Operate 8.4.3
- Elasticsearch 8.9.1
- MySQL
- Visual Studio Code
- Camunda Modeler

[Instructions on how to install each of these prerequisites can be found on their respective websites.]

Once you have installed the prerequisites, follow these steps to install the Property Evaluation System:

1. **Set Up MySQL Database:**
   - Install MySQL if not already installed.
   - Create a new database schema for the Property Evaluation System.
   - Configure the database connection properties in the microservices' configuration files.
   - run the following script INSERT INTO your_table_name (id, business_unit, contact_number, initiator_name, password, username) VALUES
                              (1, 'Business Unit A', '123-456-7890', 'Initiator A', 'password123', 'userA'),
                              (2, 'Business Unit B', '234-567-8901', 'Initiator B', 'password456', 'userB'),
                              (3, 'Business Unit C', '345-678-9012', 'Initiator C', 'password789', 'userC');


2. **Start Camunda Engine, Operate, and Elasticsearch:**
   - Navigate to the bin folder of the Camunda, Operate, and Elasticsearch installations.
   - Run the following bat files:
     - `broker.bat` for Camunda Engine.
     - `operate.bat` for Camunda Operate.
     - `elasticsearch.bat` for Elasticsearch.

3. **Deploy Workflow:**
   - Deploy the workflow using the Modeler to the Camunda engine.
   - The workflow is located in the resources folder of the gateway application.

4. **Start Microservices:**
   - Load all 5 microservices (Authentication, Gateway, Property Management, Comment Management, File Upload Service).
   - Download Maven packages for the applications.

5. **Start Angular App:**
   - Clone the Angular project from GitHub.
   - Run `npm install` in the CLI to install dependencies.
   - Run `ng serve` to start the application.

[Additional setup or configuration may be required after installation.]

**Note:** Since this application is using Camunda 8, compensation events are not available. These events are responsible for compensating any activity completed before the failed task. For more information, refer to [Camunda Best Practices - Dealing with Problems and Exceptions](https://docs.camunda.io/docs/components/best-practices/development/dealing-with-problems-and-exceptions/).

## Demo Run

Before running the demo of the Property Evaluation System, follow these steps:

1. **Ensure MySQL is Running:**
   - Make sure MySQL is installed and running on your machine.

2. **Start Camunda Engine, Operate, and Elasticsearch:**
   - Navigate to the bin folder of the Camunda, Operate, and Elasticsearch installations.
   - Run the following bat files:
     - `broker.bat` for Camunda Engine.
     - `operate.bat` for Camunda Operate.
     - `elasticsearch.bat` for Elasticsearch.

3. **Set Up the Angular App:**
   - Ensure the Angular app is running on `localhost:4200`.
   - Implement the login page with username and password fields. 
   - Implement the property evaluation form.

4. **Set Up the Backend:**
   - Ensure the microservices (Authentication, Property Management, etc.) are running.
   - Implement the API endpoints for user authentication and property evaluation form submission.
   - Implement the database queries to retrieve user information for authentication and store property evaluation data.

5. **Implement the User Authentication Flow:**
   - When the user submits the login form, send a request to the Authentication microservice to authenticate the user.
   - Upon successful authentication, store the user's information in the frontend (e.g., in local storage or a state management library) and redirect the user to the property evaluation form.

6. **Implement the Property Evaluation Form:**
   - Implement the form with fields for property evaluation details.
   - When the user submits the form, send a request to the Property Management microservice to store the evaluation data.

7. **Display the Data in the PVS Evaluation Request Page:**
   - Implement a page to display the evaluation requests in a grid.
   - Retrieve the evaluation requests from the Property Management microservice and display them in the grid.

8. **Access Camunda Operate:**
   - Go to `localhost:8080` in your web browser.
   - Sign in using the demo credentials: username `demo`, password `demo`.
   - Navigate to the Processes tab and check the Completed checkbox on the left-hand side menu.
   - This will show the completed process instances.
  

## Resources

### Downloads
- [Elasticsearch 8.9.1 Windows x86_64](https://artifacts.elastic.co/downloads/elasticsearch/elasticsearch-8.9.1-windows-x86_64.zip)
- [Camunda Operate 8.4.3](https://github.com/camunda-community-hub/camunda-operate/releases/download/8.4.3/camunda-operate-8.4.3.zip)
- [Camunda Zeebe 8.4.3](https://github.com/camunda-community-hub/zeebe/releases/download/0.26.1/zeebe-broker-0.26.1.tar.gz)
- [Java JDK 21.0.2 Windows x64](https://download.java.net/java/GA/jdk21.0.2/f2283984656d49d69e91c558476027ac/13/GPL/openjdk-21.0.2_windows-x64_bin.zip)

### GitHub Repositories
- [Angular UI](https://github.com/shreyasunhle0110/bank-property-evaluation)
- [File Upload Service](https://github.com/shreyasunhle0110/FileUploadService)
- [Comment Management Service](https://github.com/shreyasunhle0110/CommentManagement)
- [Property Management Service](https://github.com/shreyasunhle0110/PropertyManagement)
- [Camunda Gateway Application Service](https://github.com/shreyasunhle0110/Gateway)
- [Authentication Service](https://github.com/shreyasunhle0110/Authentication)

## Reference Images
Login Page :![image](https://github.com/shreyasunhle0110/bank-property-evaluation/assets/30310896/572f982d-80e9-4f49-9ae0-ecb2a189f2c6)

Form Page : ![image](https://github.com/shreyasunhle0110/bank-property-evaluation/assets/30310896/f8e37e4a-b2cd-458f-90f8-d63692c0020f)
Grid Page : ![image](https://github.com/shreyasunhle0110/bank-property-evaluation/assets/30310896/a78e24a2-dd2c-4b28-b778-624dc82653f4)
Validations : ![image](https://github.com/shreyasunhle0110/bank-property-evaluation/assets/30310896/8c865274-b5cc-4479-a3cf-63861b8a943a)
operate dashboard : ![image](https://github.com/shreyasunhle0110/bank-property-evaluation/assets/30310896/33149063-0e22-41f7-ac2d-d94315b58b55)
Operate page : ![image](https://github.com/shreyasunhle0110/bank-property-evaluation/assets/30310896/1299ebcc-bbba-46cc-8da6-287bb70f4fcf)
Basic Camunda Workflow : ![image](https://github.com/shreyasunhle0110/bank-property-evaluation/assets/30310896/13753539-b714-4f9f-a969-3e31c956d556)
After Process is completed : ![image](https://github.com/shreyasunhle0110/bank-property-evaluation/assets/30310896/deca1f3c-6c0e-4ce2-9a1a-f39b98311b28)




