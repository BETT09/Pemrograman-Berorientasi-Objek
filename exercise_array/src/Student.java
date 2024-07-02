public class Student {
    private String name;
    private double mark;

    // Constructor to initialize name and mark
    public Student(String inName, double inMark) {
        this.name = inName;
        this.mark = inMark;
    }

    // Method to set the name
    public void setName(String inName) {
        this.name = inName;
    }

    // Method to set the mark
    public void setMark(double inMark) {
        this.mark = inMark;
    }

    // Method to get the name
    public String getName() {
        return this.name;
    }

    // Method to get the mark
    public double getMark() {
        return this.mark;
    }

    // Method to get the grade based on the mark
    public String getGrade() {
        if (mark >= 85) {
            return "HD"; // High Distinction
        } else if (mark >= 75) {
            return "DI"; // Distinction
        } else if (mark >= 65) {
            return "CR"; // Credit
        } else if (mark >= 50) {
            return "PS"; // Pass
        } else {
            return "FL"; // Fail
        }
    }

    // Method to return a string representation of the student
    public String toString() {
        return "Name: " + this.name + ", Mark: " + this.mark + ", Grade: " + getGrade();
    }
}
