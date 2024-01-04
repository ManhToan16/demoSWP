/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ha-PC
 */
public class Brick {
    String place;
    int price;

    public Brick() {
    }

    public Brick(String place, int price) {
        this.place = place;
        this.price = price;
    }
    

    public String getPlace() {
        return place;
    }

    public int getPrice() {
        return price;
    }

    public void setPalce(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return  place + "\t" + price ;
    }
    
    
}
