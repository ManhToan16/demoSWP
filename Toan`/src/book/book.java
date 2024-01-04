/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;

import static java.lang.Character.toUpperCase;

/**
 *
 * @author toanl
 */
public class book {
    private String title;
    private int price;

    public book() {
    }

    public book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title.toUpperCase();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "book{" + "title=" + title + ", price=" + price + '}';
    }
    
    
    
}
