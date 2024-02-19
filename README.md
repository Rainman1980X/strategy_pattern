# Strategy Pattern Example Project

This project is an introduction and implementation of the Strategy Pattern using Jakarta EE with jakarta imports, 
Lombok, Java SDK version 21.

# What is the strategy pattern?

The Strategy Pattern, also known as the Policy Pattern, is a behavioral design pattern that enables selecting an algorithm at runtime. Instead of implementing a single algorithm directly within a class's method, it's beneficial to define a set of algorithms separately and make them interchangeable within that method. The object that uses the algorithm has a reference to the interface of the Strategy pattern, but the implementation of this strategy isn't revealed to the object. Thus, the object can switch strategies when required. This promotes open/closed principle as classes can be easily extended to incorporate new behavior without modifying existing code. The Strategy Pattern is beneficial whenever algorithmic behavior needs to be selected dynamically or when there are numerous related classes differing only in behavior.