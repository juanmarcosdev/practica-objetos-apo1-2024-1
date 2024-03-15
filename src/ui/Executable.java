package ui;

import model.Person;
import model.Car;

import java.util.Scanner;

public class Executable {
    private Scanner reader;

    public void run() {
        // Crear una instancia de Person
        Person person = new Person("John", 30);

        // Crear una instancia de Car
        Car car = new Car("Toyota", "Camry", 2020);

        // Imprimir detalles de la persona y del coche
        person.printDetails();
        System.out.println();
        car.printDetails();
    }

    /**
     * Método principal (main) para iniciar la ejecución del programa.
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Executable y se ejecuta el programa principal.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este
     *             caso).
     */
    public static void main(String[] args) {
        Executable mainApp = new Executable();
        mainApp.run();
    }
}