public class Student extends Person {
    private String major;
    private Double gpa;

    Student() {
        this.major = "";
        this.gpa = 0.0;
    }

    Student(String name, Integer age, String major, Double gpa) {
        super(name, age);
        this.major = major;
        this.gpa = gpa;
    }

    public String getMajor() {
        return this.major;
    }

    public Double getGPA() {
        return this.gpa;
    }

    public void setMajor(String newMajor) {
        this.major = newMajor;
    }

    public void setGPA(Double newGPA) {
        this.gpa = newGPA;
    }

    public String study() {
        return String.format("%s is studing %s", this.name, getMajor());
    }

    public String getStatus() {
        String returnValue = "";
        if (this.gpa >= 3.5) {
            returnValue = "On Honor Roll";
        } else if (this.gpa >= 2.0 && this.gpa <= 3.49) {
            returnValue = "Good Standing";
        } else if (this.gpa < 2.0) {
            returnValue = "Academic Probation";
        }
        return "Status: " + returnValue;
    }
}