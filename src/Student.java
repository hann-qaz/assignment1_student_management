public class Student {

    // info
    private String name;      // name
    private String id;        //  ID
    private String major;     // op
    private double gpa;       // gpa
    private int credits;      // Total credits

    // constructor
    public Student(String name, String id, String major) {
        this.name = name;
        this.id = id;
        this.major = major;
        this.gpa = 0.0;      //  start with 0 GPA
        this.credits = 0;    // no credits yet
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public int getCredits() {
        return credits;
    }

    // Setter for op
    public void setMajor(String major) {
        this.major = major;
    }

    // Update gps
    public void updateGPA(double newGPA) {
        this.gpa = newGPA;
    }

    // Add credit
    public void addCredits(int c) {
        this.credits += c;
    }

    // Check
    public boolean isHonors() {
        return gpa >= 3.5;
    }

    public String toString() {
        return "Name: " + name +
                ", ID: " + id +
                ", Major: " + major +
                ", GPA: " + gpa +
                ", Credits: " + credits;
    }
}