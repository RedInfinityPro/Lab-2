public class App {
    public static void main(String[] args) {
        Person Alice = new Person();
        Alice.setName("Alice");
        Alice.setAge(30);
        System.out.println(Alice.introduce());
        
        Person Bob = new Person();
        Bob.setName("Bob");
        Bob.setAge(20);
        System.out.println(Bob.introduce());
        System.out.println(Bob.student("Computer Science", 4.0));
    }
}

// 1. What advantage does inheritance give us compared to rewriting the same code in multiple classes?
    // This process allows the transfer of information across multiple files to be easier and faster; in addition, it demonstrates the importance of categorizing objects and what they inherently are.
// 2. Could you imagine other subclasses of Person that would make sense (e.g., Teacher)? What attributes or methods might they have?
    // Other subclasses that may be beneficial for determining the person may include employment status, career status of the individual, or educational background/history. For example, the person's career status might return values such as employment status, employment type, yearly wage, job description, and quite possibly skills obtained in the job.