
package toan;

import java.util.Scanner;


public class NewClass {
    String code;
    String name;
    int year;
    String address;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap code: ");
        code = sc.nextLine();
        System.out.println("Nhap name: ");
        name= sc.nextLine();
        System.out.println("Nhap year: ");
        year= sc.nextInt();
         System.out.println("Nhap address : ");
         
         sc.nextLine();
         address=sc.nextLine();
                }
    void output(){}
    
    
}
