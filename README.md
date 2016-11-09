# All you can test
Repository containing an empty Maven project, introduction to parameterized testing and the result of the Workshop

# Introduction

This section is about parameterized testing, the benefits and downfalls and notes about what to take care of.

## Parameterized Testing

Parameterized testing is a way of testing the functionality of a class (or multiple classes) with large, changing and/or external datasets
without blowing up the source code. This can be done by defining the parameters to be tested, and feeding data to them afterwards.



## Benefits

The benefits of using this approach are:

- Adding different sets of arguments is very easy and does not game the code grow

- Concise code by feeding mutltiple test methods by a single data-providing method

- No Copy&Waste coding, No "Global" variables, DRY!

- Clear separation between test logic and test data

## Downfalls

The downfalls of using this approach are:

- Much overhead for small test cases
- Dependent on JUnitParams library


# Setting Up The Maven Project

To get started with parameterized testing, we provided a template maven project that contains multiple test files, as well as a test dataset. The dependencies are already added to the xml file.

Please follow the upcoming steps:

- Download the maven project of this repository
- Open the project in your IDE
- Build the project

## Annotations

Specific annotations for parameterized testing are:

- RunWith ( Specifies the Runner class)
- Parameters ( Specifies the parameters )
- FileParameters ( Specifies parameters read from a file )

## Hints

The annotated parameter method has to be static. This is due to the fact, that the runner is working on class-level.

## Reference and Documentation

- Documentation and Example (https://github.com/junit-team/junit4/wiki/Parameterized-tests)
- Library (https://github.com/Pragmatists/JUnitParams)

# Parameterized Testing 

Steps for testing with parameters:

- Select RunnerClass (By using @RunWith)
- Create testMethod (By using @Parameters or @FileParameters)
  The annotation is depending on whether you are providing parameters in code or from a file.
  The method has to be public!
