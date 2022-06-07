# MicroRInterpreter 
###### A practice interpreter made with JFlex, Java and Lisp 
# About
A continuation of a school project, this interpreter is based on a fictional language called MicroR, a subset of R, and the extended BNF grammar is shown here.

![Capture](https://user-images.githubusercontent.com/78707594/172248679-8ee9b172-7b74-43a5-a0b3-9ebd98dd028a.PNG)

JFlex and Java is used to create the lexer, validate the syntax and create the abstract syntax tree. Lisp is used to interpret the abstract syntax tree and execute the code.

# Usage
- Java version: **18.0.1.1 2022-04-22**

- JFlex version: **1.8.2**

- Lisp version: **GCL 2.6.12**

To use, run
```
jflex MicroR.jflex && javac *.java

java MicroRSyn < filename.R
```
where filename.R is your desired file.

To use the Lisp interpreter, run 
```
(load "ASTInterpreter") 

(programSem 'AST) 
``` 
where AST is the previously produced abstract syntax tree. For example:

`(programSem '(: (: (: (: (: (: (<- (id x) (readline)) (<- (id y) (readline))) (<- (id q) (integer 0))) (<- (id r) (id x))) (while (>= (id r) (id y)) (: (<- (id q) (+ (id q) (integer 1))) (<- (id r) (- (id r) (id y)))))) (print (id q) )) (print (id r) )))`
