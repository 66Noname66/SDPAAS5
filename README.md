Strategy Pattern — Route Planning
Course: Software Design Patterns


Overview
This project demonstrates the Strategy behavioral design pattern using route planning. The Navigator context delegates route generation to a RouteStrategy interface. Three interchangeable strategies are included: CarStrategy, WalkStrategy, and CycleStrategy.

Project structure
src/main/java/org/example/
├── RouteStrategy.java
├── CarStrategy.java
├── WalkStrategy.java
├── CycleStrategy.java
├── Navigator.java
└── Main.java
Run in IntelliJ IDEA
Open the project folder in IntelliJ IDEA.
Configure a JDK 17 project SDK.
Open src/main/java/org/example/Main.java.
Run Main.main().
Alternatively, from the project directory, compile and run with a JDK 17 terminal:

javac -d out src/main/java/org/example/*.java
java -cp out org.example.Main
Expected behaviour
The program prints a route using the car strategy, switches the same Navigator to walking, then switches it to cycling. Each strategy uses the same interface method.

How to add a strategy
Create a class such as BusStrategy.
Implement RouteStrategy.
Override buildRoute(String start, String destination).
Pass new BusStrategy() to the Navigator constructor or setStrategy().
No changes to Navigator are required. The client chooses which strategy to use.

Design notes
RouteStrategy defines the common algorithm contract.
Concrete strategies encapsulate their route-planning variant.
Navigator stores a reference to the interface and delegates to it.
Main acts as the client and demonstrates runtime strategy switching.
Navigator contains no if/switch statement for selecting a concrete strategy.
Academic integrity
Use this repository as a learning reference. Review the implementation, adapt it in your own words, and make sure you can explain every class during the defence.
