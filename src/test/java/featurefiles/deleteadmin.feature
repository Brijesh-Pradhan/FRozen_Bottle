Feature:  delete admin 

@Deletebyadminid

Scenario: user wants to delete the admin id from database

When user is able to delete the id by using an api is "http://localhost:8080/admin/47"
Then user is able to get the stautus code is 415