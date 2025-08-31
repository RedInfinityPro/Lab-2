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
