
package toan;

import java.util.Scanner;


public class Ifelse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int max=0;
        int a,b,c;
        System.out.println("Nhap a,b,c ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("So lon nhat la "+a);
        } else if(b>=a && b>=c){
            System.out.println("So lon nhat la "+b);
        }else
            System.out.println("So lon nhat la "+c);
           
        
        
    }
    
}
