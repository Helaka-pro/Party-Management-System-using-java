🎉 Party Management System – Java OOP Console App

🧾 1. Intro
The Party Management System is a menu driven console application built using Java and Object Oriented Programming (OOP) principles.
It allows users to create, store, display, and search different types of parties such as Birthday, Wedding, and Christmas events.
The system demonstrates core OOP concepts like inheritance, encapsulation, and polymorphism while using a simple ArrayList-based in memory storage.
Tags:
java oop console-app student-project arraylist scanner party-management

🛠️ 2. Technologies I Used
Java (Core Java)
OOP Principles
ArrayList
Scanner (User Input Handling)

✨ 3. Features – What Users Can Do
➕ Add new parties
🎂 Create Birthday parties with cake budget and auto total cost
💍 Create Wedding parties with guest based cost calculation
🎄 Create Christmas parties with gift cost tracking
📋 View all saved parties
🔍 Search parties by name (case insensitive)
🧾 Display formatted party details

⌨️ 4. Keyboard Shortcuts
Since this is a console application, users interact using number inputs:
Key	Action
1	Add Party
2	Display All Parties
3	Search Party by Name
4	Exit Program

🏗️ 5. Process – How I Built It
Created a base class Party to store common attributes (name, location, date)
Used inheritance to create:
BirthdayParty
WeddingParty
CristmasParty
Implemented method overriding for toString() to display custom details
Added cost calculation methods for Birthday and Wedding parties
Used an ArrayList to store all party objects dynamically
Built a menu driven loop using Scanner for user interaction
Implemented a search function using equalsIgnoreCase()

📚 6. What I Learnt From This
How to design a program using OOP class hierarchy
The importance of code reusability through inheritance
How polymorphism works with a parent reference (ArrayList<Party>)
Handling user input safely with Scanner
Building menu driven console applications
Writing cleaner toString() methods for better output formatting

🚀 7. How It Could Be Improved
Fix spelling issue in CristmasParty → ChristmasParty
Add input validation for numbers and dates
Add update and delete party options
Store data in a file or database instead of memory
Improve UI formatting
Convert into a GUI application using JavaFX or Swing

▶️ 8. How to Run the Project
Step 1 – Compile
javac Project.java
Step 2 – Run java Project

👨‍💻 Author
Helaka De Silva
Cybersecurity Student | Frontend Developer | Graphic Designer
