public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Alice Brown", "S001", "Computer Science");
        Student s2 = new Student("Bob Smith", "S002", "IT");
        Student s3 = new Student("Charlie Green", "S003", "Math");
        Student s4 = new Student("Diana White", "S004", "Physics");
        Student s5 = new Student("Evan Black", "S005", "Engineering");

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

        Student[] students = {s1, s2, s3, s4, s5};

        for (Student s : students) {
            System.out.println(s);
        }

        Course course = new Course("OOP in Java", "Dr. Smith", 5);

        for (int i = 0; i < students.length; i++) {
            course.addStudent(students[i], i);
        }

        System.out.println("\nAverage GPA: " + course.courseAverageGPA());
        System.out.println("Top Credit Student: " + course.highestCreditStudent());

        System.out.println("\nHonors students: " + countHonors(students));
        System.out.println("Total credits: " + totalCredits(students));
        System.out.println("Top GPA student: " + getTopStudent(students));
    }

    static Student getTopStudent(Student[] arr) {
        Student top = arr[0];

        for (Student s : arr) {
            if (s.getGpa() > top.getGpa()) {
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
