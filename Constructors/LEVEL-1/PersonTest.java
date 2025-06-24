class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 30);
        Person p2 = new Person(p1);

        System.out.println("Original: " + p1.name + ", Age: " + p1.age);
        System.out.println("Copy    : " + p2.name + ", Age: " + p2.age);
    }
}
