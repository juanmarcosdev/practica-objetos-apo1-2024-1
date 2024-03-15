package model;

public class Car {
    private String brand;
    private String model;
    private int year;

    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Getter de marca de carro
    public String getBrand() {
        return brand;
    }

    // Getter del modelo
    public String getModel() {
        return model;
    }

    // Getter del año del carro
    public int getYear() {
        return year;
    }

    // Método público para imprimir detalles del coche
    public void printDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}