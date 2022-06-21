# TheFork Test
0-Get the Project

Get the project from Github https://github.com/harakamohammed/TheFork.git
Tools: Selenium , Appium ,TestNG , Postman ,BrowserStack

1-Mobile Application :
1.1-Get BrowserStack credentials :

Example :
app=bs://464bf10a90fd2a3bfa34b1a7e10dcfe8eb2dc013
username=med_gia5F2
accesskey=TzPHUbLqWriXtzxhAqqX

1.2-Update the file TheFork\src\test\resources\globalmobile.properties , to change variables : 

browserstack_url_app=bs://464bf10a90fd2a3bfa34b1a7e10dcfe8eb2dc013
browserstack_username=med_gia5F2
browserstack_password=TzPHUbLqWriXtzxhAqqX

Run the TestNG file : TheFork\Scenarios\LoginMOBILETestNG.xml with mvn clean test -DsuiteXmlFile=file xml 



1.3 Open the extent report generated :  TheFork\testmobile.html 
Report :

![image](https://user-images.githubusercontent.com/6186417/174911887-db383b10-4d5c-4fcb-86f3-af0b2c610fa0.png)

find the attached video :  https://github.com/harakamohammed/TheFork/blob/main/APPMOBILE%20BROWSERSTACK%20VIDEO.mp4

2-Web Application :

Run the TestNG file : TheFork\Scenarios\LoginWEBTestNG.xml with mvn clean test -DsuiteXmlFile=file xml 

!!!!! But We have a problem with captcha , we cannot run our script!!!!


3-API :

Run The WS from commande line with newnam :
newman run "PokémonAPI.postman_collection.json"

![image](https://user-images.githubusercontent.com/6186417/174909662-08abc82e-747b-4850-b990-8ece4fe74765.png)




