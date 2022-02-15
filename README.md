# 🍿 🎬  Cinnamon Cinemas Movie Theatre Seating Challenge

## Introduction

This is a special task from Cinnamon Cinemas to develop a program to allocate seats to customers 
purchasing tickets for a movie theatre.
Cinnamon Cinemas provided some criteria for how the program should be built:

- Cinnamon Cinemas Business Requirements
- The Cinnamon Cinemas Movie Theatre has 15 seats, arranged in 3 rows of 5
- Rows are assigned a letter from A to C
- Seats are assigned a number from 1 to 5


## Assumptions

- Customers do not mind sitting in rows separately from each other, but they do mind if only some
  of their party have tickets. So a party of 3 people would be happy to sit on different rows but if 
 the cinema only had 2 seats left then the party would not be booked at all. This is similar model to how
 airline tickets work.

- Using an Array because the Cinema does not change size during the execution of the program.

## Approach

1 - Set up a console application project with a testing framework, in order to write code and run tests.

2 - Sketched and planned out design first:
- Modelling what was needed using the Unified Modelling Language (UML).
- Commit into Github repository frequently and with descriptive commit messages.
- Demonstrate a Test-Driven Development approach - RED-GREEN-REFACTOR. Each commit on your Github repository should contain unit tests that match up to the feature you are focusing on for that commit.
- Write a descriptive README to document the key features of solution, assumptions, approaches and future thoughts.
 

## Class Diagram

The UML diagram below shows the Cinema class. 

![](https://github.com/cleides/cinnamon-cinemas/blob/master/docs/Cinnamon-CinemaDiagram.png?raw=true)

The work for allocation seats was split into two parts. 
First a check is done to see if enough seats are available.
Only if that check is successful are the seats then allocated.
This is why there two methods `checkSeatsAvailable` and `allocateSeats`. The method `allocateSeats`
is private because it can only be called after `checkSeatsAvailable` is successful.

## Testing

Testing can be run with `mvn test`.

A Test Driven Development approach was taken as can be seen by Github history below:

![](https://github.com/cleides/cinnamon-cinemas/blob/master/docs/Cinnamon-CinemaGitHubHistory.png?raw=true)


## Future Work

Need to write Main class to allocate a random number of seats until the cinema is full.


