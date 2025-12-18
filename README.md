# Assignment 1

## Project
This is my first assignment for OOP course. I created a Java program that manages student information using classes and objects.  It was hard but I have learned a lot!

## What programm Do?
The program stores information about students (name, ID, major, GPA, credits) and courses.  You can: Add students to courses, calculate average GPA for a course, find the student with most credits , check which students have GPA >= 3.5

## Classes

### Student
This is  class that stores student data.  It has:
- **Fields:** name, id, major, gpa, credits
- **Methods:**
    - `updateGPA()` - update the student's GPA
    - `addCredits()` - add credits to total
    - `isHonors()` - return true if GPA is 3.5 or higher
    - `toString()` - print all student info

**What I learned:** I had to make all fields private (encapsulation

### Course
Class presents a course with multiple students.
- **Fields:** courseName, instructor, students array
- **Methods:**
    - `addStudent()` - add a student at specific index
    - `courseAverageGPA()` - calculate avg GPA of all students
    - `highestCreditStudent()` - find student with most credits

**What I learned:** How to use composition (one class contains objects of another class).

### Main
This has the main() methods:
- `getTopStudent()` - find student with highest GPA
- `countHonors()` - count students who have honors
- `totalCredits()` - sum all credits from all students

## How to Run
1. Cope this code
2. Open it in IntelliJ IDEA
3. Click "Run" button
4. Check output

## Program Output
The program prints:
1. List of all students with their info
2. Average GPA of the course
3. Student with highest credits
4. Number of honors students
5. Total credits of all students

## Problems

### Bug #1: NullPointerException in courseAverageGPA()
**Problem:** My program crashed when I tried to calculate average GPA.

**Error message:**
```
Exception in thread "main" java.lang.NullPointerException
    at Course.courseAverageGPA(Course.java:23)
```

I forgot that arrays in Java are initialized with null values.  When I tried to call `s.getGpa()` on a null object, it crashed.

How I fixed: Added a null check:

/*
java
for (Student s : students) {
    if (s != null) {  // THIS WAS THE FIX!
        sum += s.getGpa();
        count++;
    }
}
*/

### Bug #2: Wrong honors calculation
**Problem:** Student with GPA of exactly 3.5 was not counted as honors student.

I wrote `if (gpa > 3.5)` instead of `if (gpa >= 3.5)`. 

How I fixed: Change `>` to `>=` .

### Bug #3: Division by zero possibility
**Problem:** If all students in array are null, the courseAverageGPA() would divide by zero.

How I fixed: Added check:
/*
java
if (count == 0) return 0;
return sum / count;
*/

### Bug #4: Array index out of bounds
**Problem:** I tried to add 6 students to array of size 5 and got:
```
ArrayIndexOutOfBoundsException:  Index 5 out of bounds for length 5
```
Arrays start at index 0!  So array of size 5 has indices 0,1,2,3,4 (not 1,2,3,4,5).

How I fixed: Made sure to create array with correct size and only add 5 students.

### Concepts that I learn
- **Encapsulation:**
- **Composition:** 
- **Arrays of Objects:**
- **null values:**

### Challenges
1. **Understanding null:** This was the hardest part. I kept forgetting that array elements start as null.
2. **Debugging:** Learning to read error messages and find the line number where error happened.
3. **Thinking in objects:** It was weird at first to think about "objects" instead of just variables.
4. **Method parameters:** Understanding when to pass objects vs primitive types.

## Time Spent
- **Planning & understanding assignment:** ~20 minutes
- **Writing Student class:** ~40 minutes
- **Writing Course class:** ~1 hour (spent time debugging the null error)
- **Writing Main class:** ~45 hour
- **Testing & fixing bugs:**  ~1 hours
- **Writing README:** ~30 minutes

**Total:  About 5 hours with procrastination**

## Reflection
This assignment was not easy but helped me understand OOP. I didn't understand why we need classes. But now I understand that objects make the code more organized and reusable.

The hard part is debugging the NullPointerException.  I spent almost an hour trying to figure out why my program crashed and adding details.  I learned to use the debugger in IntelliJ and chatGPT.


Amirkhan  OOP master
