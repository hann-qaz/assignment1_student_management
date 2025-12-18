# Assignment 1 – Student Management System

## About
This is my first OOP assignment.  I made a Java program that manages student information using classes and objects. It was challenging but I learned a lot!

## What It Does
The program can:
- Store student info (name, ID, major, GPA, credits)
- Add students to a course
- Calculate average GPA
- Find student with most credits
- Check who has honors (GPA >= 3.5)

## Classes

### Student Class
Stores one student's information. 
- Fields: name, id, major, gpa, credits
- Methods:  updateGPA(), addCredits(), isHonors(), toString()

### Course Class
Represents a course with multiple students.
- Fields: courseName, instructor, students[]
- Methods: addStudent(), courseAverageGPA(), highestCreditStudent()

### Main Class
Has the main method and helper methods: 
- getTopStudent() - finds highest GPA
- countHonors() - counts honors students
- totalCredits() - sums all credits

## How to Run
1. Open project in IntelliJ IDEA
2. Run Main. java
3. Check console output

## Output
Program shows:
- All students with their info
- Course average GPA
- Student with most credits
- Number of honors students
- Total credits

## Problems I Had

### Bug 1: NullPointerException
**Problem:** Program crashed when calculating average GPA. 

**Why:** I forgot arrays start with null values. When I called `s.getGpa()` on null, it crashed.

**Fix:** Added null check before using the object. 
```java
if (s != null) {
    sum += s.getGpa();
}
```

### Bug 2: Wrong honors check
**Problem:** Students with exactly 3.5 GPA weren't counted as honors.

**Why:** I wrote `gpa > 3.5` instead of `gpa >= 3.5`

**Fix:** Changed to `>=`

### Bug 3: Array index error
**Problem:** Tried to add 6 students to array of size 5.

**Why:** Forgot arrays start at index 0! 

**Fix:** Made array with correct size. 

## What I Learned
- **Encapsulation** - using private fields with getters/setters
- **Composition** - one class contains objects of another class
- **Null checks** - always check if object is null before using it
- **Arrays** - they start at index 0, not 1

## Challenges
The hardest part was the NullPointerException bug. I spent about an hour debugging it. I learned to use IntelliJ debugger and read error messages better.

Also understanding why we need objects instead of just variables was confusing at first.

## Time Spent
- Writing code: ~3 hours
- Debugging: ~1.5 hours
- README:  ~30 minutes

**Total: about 5 hours**

## Reflection
This assignment helped me understand OOP better. At first I didn't get why we need classes, but now I see they make code more organized. 

Debugging was hard but I learned a lot from fixing my mistakes. Next time I will test each method right after writing it instead of writing everything first.

Amirkhan  OOP  master
