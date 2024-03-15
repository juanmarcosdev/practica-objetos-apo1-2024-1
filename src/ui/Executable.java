package ui;

import model.Person;
import model.Car;

import java.util.Scanner;

public class Executable {
    private Scanner reader;
	

    public void run() {
        // Crear una instancia de Person
        // Person person = new Person("John", 30);
		
		// reader = new Scanner(System.in);
		
		// String marcaUsuario;
		// String modeloUsuario;
		// int anhoUsuario;
		
		// System.out.println("Ingrese marca");
		
		// marcaUsuario = reader.nextLine();
		
		// System.out.println("Ingrese modelo");
	
		
		// modeloUsuario = reader.nextLine();
		
		// System.out.println("Ingrese anho");
		

		// anhoUsuario = reader.nextInt();
		
		
		// Car carroUsuario = new Car(marcaUsuario, modeloUsuario, anhoUsuario);
		
		// carroUsuario.printDetails();
		
		Person musul = new Person("Sebastian Castillo", 18);
		
		System.out.println(musul.getAge());


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