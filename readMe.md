# Selenium Test Automation
This will guide you on how to run some simple tests in the paysera website https://bank.paysera.com/en/login.
Technology stack used:
 - Selenium 
 - Java
 - Maven
 - TestNG

Framework used : Page-Object Model.
# Requirements
 - Maven installed
 - Java installed
 - Eclipse installed
 - JAVA_HOME pointed to the correct library
 - Chromedriver is available and should match your current version of google chrome.

# Run through for files

This will explain how the files were used in the current implementation

## Page Objects

Page object classes are under "pages" package. The current implementation uses a base page which contains usual commands or steps implemented in a page object.

 - base.java
	 - contains actions like : waitUntil , clicking, and sendKeys.
	 - this class may contain more methods depending on your usage. 
 - loginPage.java
	 - contains the page objects in the login page
	 - this also contains the methods (types of actions) that can be done in the current page which can then be called in the test.
 - add more pages as  needed..

## Test Package

In this portion, we have an initilization class and test class.

 - initialize.java
	 - this contains the before and after annotations which is inherited by our test classes.
	 - contains the config we need depending on the test we want to execute. In this case, it contains the base URL and the location of our chromedriver
 - test_login.java
	 - this basically contains all the tests that we want to run.

## Maven

This project uses maven which basically helps us in dependency management and build management. We can just add more plugins and dependencies as we scale up our tests.

## TestNG

The TestNG.xml basically contains the test class name that we want to run which is then called by our maven pom.xml
