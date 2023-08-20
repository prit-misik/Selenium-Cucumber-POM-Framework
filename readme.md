

Test automation framework using Selenium WebDriver with Cucumber,Java, TestNG and Maven, with Page Object Model Design Pattern
====================================================================================================================================


1. This project demonstrates POM framework and how it can be used 
  in Selenium to automate any application. Maven is used as test framework.

2. For passing test data, and for separating test types Regression, Smoke Cucumber is utilized.

3. For reporting cucumber reports are used and reports can be found in folder "target/cucumber-reports/advanced-reports.html/cucumber-html-reports/feature-overview.html".
   Also, there are different styles of report inside "target" folder

4. For failed cases, screenshots can be found in folder "screenShots" folder.

5. Prerequisite: JDK 8 or above, and Maven 3.6 or above

6. To run the all the tests use the following command:

     mvn clean install

   Tests are divided and in Smoke and Regression, and tagged with @Regression and @Smoke in feature files.

   If a user wants to run only Smoke tests the command for that is :

     mvn test -Dcucumber.options="--tags @Smoke" 

   If a user wants to run only Regression tests the command for that is :

     mvn test -Dcucumber.options="--tags @Regression" 

7. A user can also directly run "src/test/java/runner/TestRunner.java" file to execute tests

8. Logs can be found as application.log inside the project

9. The repo will be updated continuously. 





