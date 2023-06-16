# taskManager

## Description
A simple SpringBoot web application to perform certain tasks with an user interface. Login features are implemented as well. This is for Doctoranywhere's software engineer intern technical assessment.

## taskManager features
* GET /tasks : Get a list of all tasks
* POST /tasks : Create a new task
* GET /tasks/{id} : Get a single task by ID
* PUT /tasks/{id} : Update a task by ID
* DELETE /tasks/{id} : Delete a task by ID

![image](https://github.com/Cassianky/taskManager/assets/77654564/c18cbea9-1895-453a-aa56-4e8bb346989c)

## taskManager login details
 
User Name: user
Password: password

![image](https://github.com/Cassianky/taskManager/assets/77654564/954361f9-7ee1-4461-a48a-dea65a14dac3)

## steps to run taskManager

1. Configure a local mysql server with name doctoranywheretest
2. Change the datasource username and password in the application.properties file accordingly
3. Make sure Maven is installed
4. build the project using `mvn package`
5. Run the main program
6. Proceed to `localhost:8080`
7. Login via the login credentials above
