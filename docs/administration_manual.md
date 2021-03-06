# **Administration Manual**  

We hosted our application on a open repository on github.com *https://github.com/SevenSamurai2017/TicTacToe*.  
We use Travis CI for continious integration and Heroku to run the application on the web.  

You can download a zip from github containing the application.  
You could also clone the the repository using the command below in bash.  

```
git clone https://github.com/SevenSamurai2017/TicTacToe.git  
```

After cloning or downloading the repository and unzipping it you need to install Gradle.  
Go to *https://gradle.org/install/* and follow the instructions to install Gradle depending on your operating system.

Next you need to install Travis CI. See *https://docs.travis-ci.com/user/getting-started/* on how to do that.  

The app is deployed to Heroku: *https://shielded-dawn-85701.herokuapp.com/*  

## **Heroku Deployment**   

To deploy the application to Heroku. You need to clone the repository from github and get the Heroku toolbelt. 
Make an account on Heroku *https://devcenter.heroku.com/start*    
From the root of the project you then need to run the following commands.  
```
Heroku login
Heroku create appname
```

And then you run this command in bash to push everything to heroku.
```
git push heroku master  
```  
## **Generate Javadocs**

To generate javadocs just enter the following command in the root of the project.
    
```
run gradle javadoc  
```

## **Selenium Tests**

We could not get Selenium to run through Travis, but we could  run the tests locally with *https://saucelabs.com/*
