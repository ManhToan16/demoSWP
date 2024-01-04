/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Computer {
 
    private String name;
    private String color;
    private double price;
    
    public Computer() {
    }

    public Computer(String Name, String Color, double Price) {
        this.name = Name;
        this.color = Color;
        this.price = Price;
    }

    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public double getPrice() {
        return price;
    }
        @Override
    public String toString() {
        return name + "\t" + price+"\t"+color;
    }

    
    
    
    
}
