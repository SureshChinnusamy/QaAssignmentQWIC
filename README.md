# QaAssignmentQWIC
QA Assignment for QWIC

# This assignment validate the given form by selecting various fields like drop down and filling text box, also validate Api status and response data. 


# Pre-requisite installation
Java 1.8 or higher
Maven 3.x

# Environment variables to be set - Preferably System Variables
JAVA_HOME = <Path to Java Home>
<M2_HOME> = <Path to Maven Home>
Path = %JAVA_HOME%\bin;%M2_HOME%\bin;%PATH%


# Commands to run the assignment
Please download the project to your computer, go to the root directory of the project and run the following command

run: mvn clean install


# Alternate way to run

Run the FormSubmit.java file in Eclipse/Intellij IDE and test the Functionality



# Important Points:
1.Test data for browser selection and url is placed in "config.properties" file which is available in src/test/resources/config<br/>
2.Application test data such as Brand and Model is placed in "FormSubmit.feature" file which is available in src/test/resources/Feature<br/>
3.Test execution starts at "FormSubmitRunner.java" which is available in src/test/java/com.qwic.assessment.qaAssesment.Runner<br/>
4.Path for browser is provided by OsPath.java class inside com.qwic.assessment.qaAssesment.Util<br/>
5.This script is capable to execute in Image disable mode and Headless mode. However headless mode works only for Firefox Browser.<br/>
6.Browser, Headless mode or image disable mode can be configured using "config.properties"<br/>
7.Browser exe driver files are available in src/test/resources/config<br/>



# Working of Program
1.Open browser

2.Navigate to http://localhost:3000/

3.Select Brand and Model drop down

4.Click on search button

5.Close the browser



6.open a new browser

7.Navigate to http://localhost:3000/

8.Select brand, model and enter keyword.

9.Click on search button

10.Then close the browser



11.send a GET request to http://localhost:3000/

12.validate the response status should be "200"

13.validate the actual JSON from response should be match with expected Json

# About project and Structure
1.src/test/java : contains all main functions PACKAGES, Class and Functions<br/>
	
1.com.qwic.assessment.qaAssesment.Runner: which connect the feature file and step file and execution starts from here
a.FormSubmitRunner.java: which configure path for feature file and step file.<br/>

2.com.qwic.assessment.qaAssesment.StepDefinition: contains class according to localhost page<br/>
a.FormSubmit.java: Contains all element related to form and Methods to perform action on Form.<br/>
b.RestAPIValidate.java: Contain all elements and methods to perform action on API like validate api status code, response , etc<br/>
	
3.com.qwic.assessment.qaAssesment.TestBase: this package contains class files for driver initialization and quit<br/>
a.Base.java: Contain methods to initialize and close driver.<br/>

4.com.qwic.assessment.qaAssesment.Util: this package contains class files for browser launch and configuration<br/>
a.DisableImage.java: This class contains functions to disable browser image loading<br/>
b.Driver: This class contains function to launch browser, also to initialize Eventwebdirver listner and quit browser<br/>
c.HeadlessMode.java: This class will configure the browser to run in headless mode. it will work only with fire fox/<br/>
d.OsPath.java: Determines the OS and provides browser path accordingly.<br/>

5.src/test/resource/config: Contains config.properties file, browser exe files<br/>
6.src/test/resource/Feature: Contain test execution flow/logic<br/>
a.FormSubmit.feature: Which contain scenarios for test execution, written in Ghrekin language<br/>
