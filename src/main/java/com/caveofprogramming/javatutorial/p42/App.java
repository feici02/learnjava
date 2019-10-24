// equals

package com.caveofprogramming.javatutorial.p42;

import java.util.Objects;

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class App {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Jason");
        Person person2 = new Person(1, "Jason");

        System.out.println(person1 == person2); // false
        System.out.println(person1.equals(person2)); // false
    }
}
