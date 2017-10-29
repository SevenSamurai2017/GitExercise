# Design Report - TicTacToe

## Team SevenSamurai
### Team members:
* Arnar Pétursson
* Auður Reynisdóttir
* Ármann Pétur Ævarsson
* Darri Rafn Hólmarsson
* Hörður Ingi Kristjánsson
* Jóhann Ingi Bjarnason
* Þorlákur Lyngmo

### Introduction
Here is a design report for the game of TicTacToe that we implemented using Test Driven Development and good coding practices. Our game is playable on Heroku and also by being run locally.

### Initial design
Our first ideas were to begin by designing a game of TicTacToe as a console program to figure out the game logic properly. Once that would be done, we would refactor that code to make it work as a web application on Heroku. We decided to use the programming language Java to develop our game since we are mostly using that language these days. The console game was designed with the programming paradigm of Object-Oriented-Programming in mind. Once the console game had been implemented we turned our attention to changing it to a Web App.

The game includes a board that is a two dimensional array and keeps track of the players. Player X starts and Player O follows and then they take turns until one of them wins or there is a draw. We also have a button to restart the game.

Also, we added an enum class for further development on the webserver, regarding broadcasting on the web who the winner is. We have that logic already developed but did not have time to implement it on the webserver.

### Class diagram
![alt text](https://i.imgur.com/W6j8Mcg.png "Class Diagram")

