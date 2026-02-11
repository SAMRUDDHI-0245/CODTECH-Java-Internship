# Task 3 – Client Server Chat Application in Java

This project implements a simple client-server chat application
using Java socket programming and multithreading.

## Objective
To build a real-time chat system where multiple clients can
communicate with each other through a central server.

## Features
- Server accepts multiple client connections
- Each client is handled using a separate thread
- Real-time message broadcasting
- Console-based chat application

## Technologies Used
- Java
- Socket Programming
- Multithreading
- Input/Output Streams

## Files Included
- ChatServer.java : Server-side program
- ChatClient.java : Client-side program
- README.md       : Project documentation

## How to Run

### Step 1: Compile the programs
javac ChatServer.java  
javac ChatClient.java  

### Step 2: Start the server
java ChatServer  

### Step 3: Start clients (in new terminals)
java ChatClient  

You can open multiple terminals to run multiple clients.
Messages sent by one client will be received by all other connected clients.

## Explanation
The server uses ServerSocket to listen for incoming client connections.
Each client connection is handled by a separate thread to allow
multiple users to chat simultaneously.

## Conclusion
This project demonstrates the use of Java sockets and multithreading
to build a basic client-server communication system.
