public class Main {

    public static void main(String[] args) {

        // Create 5 student
        Student s1 = new Student("Assel Sadvakassova", "25001", "Computer Science");
        Student s2 = new Student("Raim Artur", "25002", "Cybersecurity");
        Student s3 = new Student("Zheka Fatbelly", "25003", "Big data");
        Student s4 = new Student("Genadiy Golovkin", "25004", "Smart Things");
        Student s5 = new Student("Cristiano Ronaldo", "25007", "Software Engineering");

        // Set GPA and credits
        s1.updateGPA(3.8);
        s1.addCredits(40);

        s2.updateGPA(3.2);
        s2.addCredits(30);

        s3.updateGPA(3.9);
        s3.addCredits(50);

        s4.updateGPA(2.9);
        s4.addCredits(20);

        s5.updateGPA(3.6);
        s5.addCredits(45);

        // all students in array
        Student[] students = {s1, s2, s3, s4, s5};

        // Print all students
        System.out. println("-------All Students-----");
        for (Student s : students) {
            System.out.println(s);
        }


        // Create a course
        Course course = new Course("OOP in Java", "Dr. Smith", 5);

        // Add all students
        for (int i = 0; i < students.length; i++) {
            course.addStudent(students[i], i);
        }

        // Calculate and print
        System.out.println("\n-------- Course Statistics----------");
        System.out.println("Average GPA: " + course.courseAverageGPA());
        System.out.println("Top Credit Student: " + course.highestCreditStudent());

        // Calculate and print
        System.out.println("\n------- Overall Statistics------");
        System.out.println("Honors students: " + countHonors(students));
        System.out.println("Total credits: " + totalCredits(students));
        System.out.println("Top GPA student: " + getTopStudent(students));
    }


    static Student getTopStudent(Student[] arr) {
        Student top = arr[0];

        // Loop for topstudent
        for (Student s : arr) {
            if (s. getGpa() > top.getGpa()) {
                top = s;
            }
        }

        return top;
    }

    static int countHonors(Student[] arr) {
        int count = 0;

        for (Student s : arr) {
            if (s.isHonors()) {
                count++;
            }
        }

        return count;
    }

    static int totalCredits(Student[] arr) {
        int sum = 0;

        for (Student s : arr) {
            sum += s.getCredits();
        }

        return sum;
    }
}
