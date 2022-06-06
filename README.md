# MicroRInterpreter 
###### A practice interpreter made with JFlex, Java and Lisp 
# About
A continuation of a school project, this interpreter is based on a fictional language called MicroR, and the extended BNF grammar is shown here.

![Capture](https://user-images.githubusercontent.com/78707594/172248679-8ee9b172-7b74-43a5-a0b3-9ebd98dd028a.PNG)

JFlex and Java is used to create the lexer, validate the syntax and create the abstract syntax tree. Lisp is used to interpret the abstract syntax tree and execute the code.

# Usage
Java version: **18.0.1.1 2022-04-22**

JFlex version: **1.8.2**

To compile, run `jflex MicroR.jflex && javac *.java` and then to execute use `java MicroRSyn < filename.R` where filename.R is your desired file.
