Feature: To check login functionality

  Scenario: To check login page
    Given User launches flipkart page
    
    When User enters username and password and clicks login button
    
    Then if user credentials are incorrect, user should not be login to home page
