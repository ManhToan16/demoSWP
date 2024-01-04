/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author toanl
 */
public class SpecCar extends Car{
    public int type;
    public String data;

    public SpecCar() {
    }

    public SpecCar(int type,String maker, int price) {
        super(maker, price);
        this.type = type;
    }
    public int getValue(){
      int inc = type< 7 ? 10 :15;
      return super.getPrice() +inc;
        
    }
    public String getData(){
        return data;
        
    }
    public void setData(){
        super.setMaker(super.getMaker().substring(0,2)+"XX"+super.getMaker().substring(3));
//super.setMaker("XZ"+super.getMaker());
        super.price+=20;
        }

    @Override
    public String toString() {
        return super.toString() + ", " +type;
    }

    
    
    
    
}
