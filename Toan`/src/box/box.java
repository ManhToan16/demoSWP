/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package box;

/**
 *
 * @author toanl
 */
public class box extends rectangle {
    private double height;

    public box() {
    }

    public box(double height, double length, double width) {
        super(length, width);
        this.height = (height>0) ?height:0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height>0 ? height:0;
    }

    @Override
    public String toString() {
        return " | "   +"height = "+ height+super.toString();
        
    }

    @Override
    public double Perimeter() {
        return 4*(super.getLength()+super.getWidth()+this.height); 
    }

    @Override
    public double getArea() {
        return 2;
    }

    
    
    }
    

    
    
    
    
    

