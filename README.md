#User's Social Media Microservice
This microservice provides API endpoints for managing user profiles, user data, privacy settings and notifications for a social media platform. It is built using Java, Spring Boot and MongoDB.

##Installation
1. Clone the repository.
2. Install MongoDB on your local machine or configure a cloud MongoDB database.
3. Configure the application.properties file to connect to your MongoDB instance.
4. Run the application using your IDE or using the command ./mvnw spring-boot:run.

##Endpoints
###User Profile Endpoints
####Get User Profile

GET profiles/{id}

Retrieves the user profile for the given ID.

###Create User Profile

POST /profiles

Creates a new user profile.

###Update User Profile

PUT /profiles/{id}

Updates the user profile for the given ID.

###Delete User Profile

DELETE /profiles/{id}
Deletes the user profile for the given ID.

##Privacy Settings Endpoints
###Get Privacy Settings

GET /privacy/{id} -
Retrieves the privacy settings for the given ID.

###Update Privacy Settings

PUT /privacy/{id} -
Updates the privacy settings for the given ID.


##Notification Settings Endpoints
###Get Notification Settings

GET /notifications/{id} -
Retrieves the notification settings for the given ID.

###Update Notification Settings


PUT /notifications/{id} -
Updates the notification settings for the given ID.

##Authentication Endpoints
###Login

POST /auth/login
Logs in the user and returns a JWT token.

#Contributors
####Yuval Ripkin yuval.ripkin@gmail.com
