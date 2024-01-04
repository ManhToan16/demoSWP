/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class SComputer extends Computer{
    
    private String series;
    
    public SComputer() {
       super();
       series = "";
    }

      

    public SComputer(String series, String Name, String Color, double Price) {
        super(Name, Color, Price);
        this.series = series;
    }
    
    /*Complete the below function for second test case*/
    public double getSalePrice() {
       double discount = 0.01;
       double p = getPrice();
       if(series.charAt(series.length()-1)=='A'||series.charAt(series.length()-1)=='a')
           discount = 0.05;
       return p - p * discount;
    }  
    
    
    
    //add and complete your other methods here (if needed)

    @Override
    public String toString() {
        return super.getName() + "\t" +  super.getPrice()+"\t"+super.getColor()+"\t"+series;
    }

}
