package model;

public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter del nombre
    public String getName() {
        return name;
    }

    // Getter de la edad
    public int getAge() {
        return age;
    }

    // Método público para imprimir detalles de la persona
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}