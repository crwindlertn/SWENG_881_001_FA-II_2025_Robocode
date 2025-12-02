SWENG 881 Robocode Software Testing Project
Robocode Software Testing Project – SWENG 881

This repository contains the implementation and testing assets for the Software Testing (SWENG 881) course project.
The purpose of this project is to evaluate selected functionality from the open-source Robocode system using formal software testing methodologies, including Input Domain Modeling, Graph-Based Testing, Behavior-Driven Development (BDD), and automated unit testing with JUnit.

Project Overview

Robocode is a Java-based programming game in which users create AI-controlled robot tanks that battle in a virtual arena.
Robocode was selected for this project because:

It is a reputable open-source project with an active community.

It provides a well-defined decision-making flow suitable for systematic testing.

It aligns with prior experience in Java development.

It offers meaningful testing challenges beyond trivial examples.

This project focuses on two key robot behaviors:

Enemy detection using radar scanning.

Firing decision logic based on detection output and robot state.

Testing Methodologies Used
Input Domain Modeling

The robot’s behavior depends on several input and state variables:

enemyDetected

enemyDistance

enemyBearing

energyLevel

gunHeat

firePower

Each variable was partitioned into meaningful equivalence classes.
Pairwise Coverage was selected as the coverage criterion to efficiently explore interactions between variables.
A representative test set was generated and executed using JUnit and Cucumber.

Graph-Based Testing

A decision-flow graph was created to represent the firing logic of the robot.
Edge Coverage was chosen to ensure every transition in the decision structure was exercised.

Test cases derived from the graph included:

Continue scanning

Adjust position

Wait for gun cooldown

Fire at target

All test cases were executed, and results were documented in the final report.

Behavior-Driven Development (BDD)

Cucumber feature files describe robot behavior in human-readable form.
These scenarios cover:

Radar detection behavior

Firing logic behavior

Edge cases when no enemy is detected

Cucumber step definitions integrate with JUnit to provide automated execution.


How to Run the Tests

Open the project in IntelliJ.

Ensure JDK 11 or later is configured.

Run tests using one of the following methods:

Using Maven
mvn test

Using IntelliJ

Right-click the test directory

Select Run All Tests

Running Cucumber Tests

Execute the Cucumber JUnit runner located in the test directory.

