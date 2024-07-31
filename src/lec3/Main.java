package lec3;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        System.out.println(person);
        
        person.setAge(31);
        System.out.println("person.getAge() = " + person.getAge());
    }
}
