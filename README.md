 Tortoise-Vs-Hare-Simulator


A Java-based simulation of the classic Tortoise vs. Hare race, using object-oriented programming concepts such as abstract classes and inheritance. The project implements the race logic for both the tortoise and the hare, simulating their behavior and providing race progress updates.

Tortoise vs Hare - CSE 205 Lab Project

Overview
This project is a simulation of the famous race between a tortoise and a hare, implemented using object-oriented programming principles in Java. The goal is to complete the implementation of abstract and derived classes that model the behavior of the racers based on given specifications.

Class Structure

1. Racer (Abstract Class)
- Fields:
  - name: The name of the racer.
  - distanceCoveredInMeters: The total distance the racer has covered during the race.
  - minSpeedInMetersPerSecond: The minimum speed of the racer.
  - maxSpeedInMetersPerSecond: The maximum speed of the racer.
- Methods:
  - getDistanceCoveredInMeters(): Returns the distance covered so far.
  - toString(): Returns a formatted string with the racer's name.
  - run(): Abstract method that will be implemented by the derived classes.

2. Tortoise (Derived Class)
- Constructor: Initializes the tortoise with a name, a minimum speed of 2 meters/second, and a maximum speed of 3 meters/second.
- run(): Simulates the tortoise running for a time interval by calculating a random speed and updating the distance covered. Prints the status of the race, e.g., "Tom walks 2.73 meters; now at marker 11.51".

 3. Hare (Derived Class)
- Fields:
  - arrogance: A value between 0 and 1 that determines how often the hare takes a nap during the race.
- Constructor: Initializes the hare with a name, a minimum speed of 10 meters/second, a maximum speed of 15 meters/second, and a specified arrogance factor.
- run(): Simulates the hare running (or napping) based on the arrogance factor. If the hare decides to run, it calculates a random speed and updates the distance covered. Prints either a nap message or a race status message, e.g., "Hana hops 2.73 meters; now at marker 11.51" or "Hana takes a nap".

How to Run
To run this project:
1. Compile all the Java files (Racer.java, Tortoise.java, Hare.java, Main.java).
2. Run the Main class to start the simulation.

Example Output

Tom walks 2.73 meters; now at marker 11.51
Hana takes a nap
Tom walks 2.14 meters; now at marker 13.65
Hana hops 11.12 meters; now at marker 11.12

License
This project is part of the CSE 205 curriculum at Arizona State University and follows the university’s academic integrity policies.
