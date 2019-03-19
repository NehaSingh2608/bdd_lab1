#Author Neha Singh
Feature: Reset Functionality on login page of Application
Scenario Outline: Verification of reset button with numbers of credentiaal
Given Open the firefox and lunch the application
When Enter the Username <username> and Password <password>
Then Reset the credential

Examples:
|username |password  |
|"user11" |"password11" |
|"user22" |"password22" |
|"user33" |"password33" |