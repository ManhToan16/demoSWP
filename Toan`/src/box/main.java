/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package box;

/**
 *
 * @author toanl
 */
public class main {
    public static void main(String[] args) {
        rectangle rec =new rectangle(40,34);
        box b=new box(10,20,30);
        rec.display();
        rec.diplayArea();
        rec.diplayPerimeter();
        b.display();
        b.diplayArea();
        b.diplayPerimeter();
        
    }
    
}
