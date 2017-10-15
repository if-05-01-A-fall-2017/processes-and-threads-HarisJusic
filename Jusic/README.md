### if.05.01 TINF Operting Systems

# Assignment 4: Processes and Threads
## Objective
The goal of this week's assignment is to make you familiar with processes in C and threads in Java.

## Required Tasks
Write the following programs

### Simple Shell
You are to implement a simple shell (command interpreter) that behaves similarly (but not identically) to the UNIX shell. When you type in a command (in response to its prompt), it will create a thread that will execute the command you entered. Multiple commands can be entered on a single line, separated by '&' (ampersand) characters. Your shell will run them all concurrently and prompt for more user input when they have all finished.

You do not need to implement pipes or re-direction of standard input and standard output, and & at the end of a command has no special meaning (it does not mean to run the command in the "background"). You must be able to handle an arbitrary number of commands per line -- each with an arbitrary number of arguments separated by arbitrary amounts of white space (blanks or tabs). Your program should recover gracefully from such errors as unknown commands by printing an error message and continuing.

- Implement this shell in C
- Implement this shell in Java

### Fibonacci Sequence
Write a Java program computing the Fibonacci Numbers. Use the NetBeans Project `FibonacciParallel` as a basis. This project already contains a single threaded Java solution (`Fibonacci.getNumberSingle(n)`). Extend this project by implementing the method `getNumberMulti(n)`. This method should use two worker threads. One for the calculation of fib(*n* - 1) and the second for calculating fib(*n*-2).

- Extend the Java Project such that it uses two worker threads.
- Try and examine the run time performance of both solutions. Which is more efficient.
- Can you explain why which version is more efficient?
