public class Student {

    private String name;
    private String id;
    private String major;
    private double gpa;
    private int credits;

    public Student(String name, String id, String major) {
        this.name = name;
        this.id = id;
        this.major = major;
        this.gpa = 0.0;
        this.credits = 0;
    }

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

    public void setMajor(String major) {
        this.major = major;
    }

    public void updateGPA(double newGPA) {
        this.gpa = newGPA;
    }

    public void addCredits(int c) {
        this.credits += c;
    }

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
