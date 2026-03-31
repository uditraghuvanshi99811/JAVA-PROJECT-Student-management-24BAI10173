#  Student Management System (Java)

##  About the Project
This is a console-based Student Management System developed using Java.  
The main idea of this project is to manage student records in a simple and organized way.

It allows users to store personal and academic details of students and perform operations like adding, viewing, searching, and deleting records.

---

##  Features
- Add student details (Reg No, Name, Age, Email, Course)
- Store parent details (Name and Contact)
- Enter marks of 5 subjects
- Automatically calculate:
  - Percentage
  - Grade (A/B/C/Fail)
- Store previous semester CGPA
- View all students
- Search student by registration number
- Delete student record
- Display topper (highest percentage)

---

##  Concepts Used
- Object-Oriented Programming (OOP)
- Inheritance (Person → Student)
- Encapsulation
- Arrays (for marks)
- HashMap (for storing student records)
- Loops and Conditional Statements
- Exception Handling

---

## ▶ How to Run (Using VS Code)

Follow these steps to run the project in Visual Studio Code:

### Step 1: Install Requirements
- Install Java JDK (version 8 or above)
- Install Visual Studio Code
- Install Java Extension Pack in VS Code

### Step 2: Open Project
1. Open VS Code
2. Click on File → Open Folder
3. Select your project folder (StudentManagement)

### Step 3: Check Files
Make sure all files are present:
- Main.java
- Student.java
- Person.java
- StudentService.java

### Step 4: Compile the Code
Open terminal in VS Code:
- Click Terminal → New Terminal

Run the following command:
javac Main.java

### Step 5: Run the Program
In the same terminal, run:
java Main

### Step 6: Use the Program
- The menu will be displayed on screen
- Enter your choice (1–6)
- Provide input as asked
- The system will display results accordingly

### Example Input
1
101 Aman 20 aman@gmail.com BTech Rajesh 9876543210
80 85 90 75 88
8.5

### Note
- Make sure Java is installed properly (javac -version should work)
- If any error occurs, restart VS Code and try again
---

##  Sample Input
Use the following input while running the program:

1  
101 Aman 20 aman@gmail.com BTech Rajesh 9876543210  
80 85 90 75 88  
8.5  

---

##  Screenshots

### Menu
![Menu](images/menu.png)

### Add Student
![Add](images/add.png)

### View Students
![View](images/view.png)

### Search Student
![Search](images/search.png)

### Topper
![Topper](images/topper.png)

##  What I Learned
- How to apply Java concepts in a real-world project  
- How to manage data using HashMap  
- How to structure a Java program using multiple classes  
- How to handle user input and exceptions  

---

##  Future Improvements
- Add file handling to store data permanently  
- Add GUI using Java Swing  
- Add update/edit student feature  
- Improve user interface  

---

##  Author
Udit Raghuvanshi 
24BAI10173
