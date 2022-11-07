Feature: Post Request Of Admin
@PostbyAdmin
Scenario: User wants to post the data 
Given : User want to pass the data into database
When : user gives the data by using an api is "http://localhost:8080/admin"
Then : user validates the status code is 201