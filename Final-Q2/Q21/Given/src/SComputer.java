/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class SComputer extends Computer {
String series;

    public SComputer() {
    }

    public SComputer(String series) {
        this.series = series;
    }

    public SComputer(String series, String name, String color, double price) {
        super(name, color, price);
        this.series = series;
    }

    public SComputer(String name, String color, double price) {
        super(name, color, price);
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }
    
    public double getSalePrice(){
       if (getSeries().endsWith("A")||getSeries().endsWith("a")) {
           price = price-(price*5/100); 
        }else{
           price = price-(price*1/100);  
       }
       return price;
    }
    @Override
    public String toString() {
        return super.toString()+"\t"+series;
    }  

}
