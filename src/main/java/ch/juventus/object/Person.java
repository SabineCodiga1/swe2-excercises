package ch.juventus.object;

import java.util.Objects;

public class Person {
    String firstName;
    String lastName;
    Address address;
    int age;
    boolean hasPet;

    public Person(String firstName, String lastName, Address address, int age, boolean hasPet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
        this.hasPet = hasPet;
    }


    public String toString() {
        return String.format("Person: {First Name: %s, Last Name: %s, %s, Age: %d, Pet: %b}", firstName, lastName, address, age, hasPet);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && hasPet == person.hasPet && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, address, age, hasPet);
    }
}
