package lec3;

public class RecordMain {
    public static void main(String[] args) {
        PersonRecord person = new PersonRecord("Alice", 30);
        System.out.println(person);

        // get member attributes
        System.out.println("person.name() = " + person.name());
        System.out.println("person.age() = " + person.age());

        // no setter (default immutable)
        // person.setAge(31);
        // System.out.println("person.age() = " + person.age());
    }
}
