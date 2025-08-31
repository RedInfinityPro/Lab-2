import java.util.ArrayList;
import java.util.Arrays;

public class Person {
    public String name;
    private Integer age;

    Person() {
        this.name = null;
        this.age = 1;
    }

    Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(Integer newAge) {
        this.age = newAge;
    }

    public String introduce() {
        return String.format("Hi my name is %s and I am %,d years old", getName(), getAge());
    }
    
    public String student(String major, Double gpa) {
        Student student = new Student(this.name, this.age, major, gpa);
        student.setMajor(major);
        student.setGPA(gpa);
        ArrayList<String> returnValue = new ArrayList<String>();
        returnValue.add(student.study());
        returnValue.add(student.getStatus());
        return Arrays.toString(returnValue.toArray());
    }
}