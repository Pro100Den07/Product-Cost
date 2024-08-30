package models;

public class Product {
    private String name;
    private int quantity;
    private double price;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public double getBaseCost() {
        return quantity * price;
    }

    // Геттери для інших полів
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
}