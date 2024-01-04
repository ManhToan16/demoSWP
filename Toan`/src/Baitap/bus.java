/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap;

/**
 *
 * @author toanl
 */
        

        
public class bus extends car implements ICar{
    private int number;

    
    bus(){}
    public bus(int number, String maker, int price) {
        super(maker, price);
        this.number = number;
    }
    

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
         return super.getMaker()+ ", " + super.getPrice();
    }
    
    

    @Override
    public int speed() {
        
        if(super.getPrice()>300 && super.getPrice()<500&&getNumber()<20)
            return 3000;
        else 
            return 2500;
    }

    @Override
    public String format() {
        return toUpperCase(super.getMaker());
    }
    
    public void setData(){
           System.out.println("BS"+super.getMaker()+", "+(super.getPrice()+20));
           
    }

    public int  getValue(){
        int inc = (super.getPrice()<500)?10:15;
        return this.getNumber()+inc;
    }

    private String toUpperCase(String maker) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}


