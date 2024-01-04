/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ha-PC
 */
public class SpecBrick extends Brick{
    int color;

    public SpecBrick() {
    }

    public SpecBrick( String place, int price,int color) {
        super(place, price);
        this.color = color;
    }
    

    @Override
    public String toString() {
        return place+"\t"+price+"\t" +color ;
    }
    
    void setData(){
   this.place=place.substring(0,2)+"ABC"+place.substring(2);
   }
    
  int getValue(){
  if (color>7) return (price+9);
  else return(price+6);
  }
  
}
