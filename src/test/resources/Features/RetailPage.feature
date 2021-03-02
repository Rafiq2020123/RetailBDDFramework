
Feature: Retail Website Feature 

# Every feature starts with the feature keword
# Every Scenarion starts with the Scenario keword and should include the Test Case we are going to automate
# Given is pre-condition
# When ia an Action taken keword 
# Then is used for the expected result ( we are expectiing from the test case) 
#And is used for repeating actions or  can be used for the following steps 
#Every rrepeated steps has to be put under th eBackground keword


Background:
Given User is on Retail website 

@Test
Scenario: Search functionality Test Case
When User search for 'iphone'
And User click on the seach button 
Then User should see Iphone image 



# Every scenario outline follwors with example kyword 
#Under example keword we place the data inside the pips and we can separate colums with pips
# In Example each row represents on time of execution 

@iphone
Scenario Outline: Test Search Functionaloty with multiple set of data 
When User search for 'itemName'
And User click on the seach button 
Then User should see Iphone image


Examples:
| itemName|
| iphone|
| mac book|
|Canon|



@RegisteringTest
Scenario: Regestring an Account Test Case
When User click  on MyAccount
And User clicks on register option
And User fills out the registration form with the below informathon 

|firstname|lastName|email|telephone|password|confirmPassword|subscribe|

|Rafiq|Noori|202@gmail.com|4012678987|a62021|a62021|no|
And User accepts the privacy and policy 
And user clicks on continue button 
Then User should be registerd in the retail website









