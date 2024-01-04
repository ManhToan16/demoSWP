/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author toanl
 */
public class Car {
    
    public String maker;
    public int price;
    public int rate;
    public Car(){
    }
    
    Car(String maker,int price){
        this.maker=maker;
        this.price=price;
        
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public Car(String maker, int price, int rate) {
        this.maker = maker;
        this.price = price;
        this.rate = rate;
    }

    @Override
    public String toString() {
//        return "car{" + "maker=" + maker + ", price=" + price + '}';
     return maker+", "+price;
    }
    

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getPrice() {
        return price;
    }

    
}
