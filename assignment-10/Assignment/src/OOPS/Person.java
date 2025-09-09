package OOPS;

// Create a Person class with a copy constructor that clones another person's attributes
public class Person {
    String name;
    int age;

    public Person() {
        this.name = "";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // this is a copy constructor for copy attributes of another object
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
}
