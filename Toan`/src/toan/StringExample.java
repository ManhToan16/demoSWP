
package toan;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;
import static java.lang.Character.toUpperCase;
import java.util.Arrays;
import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a= sc.nextLine();
        //Xuat tung ki tu
//        for(int i=0;i<a.length();i++)
//            System.out.println("a[" +i+ "] = "+a.charAt(i));
        //Kiem tra ki tu
//        for(int i=0;i<a.length();i++)
//            if(a.charAt(i)%2==0) System.out.println("Chan = "+ a.charAt(i));
        //in ra do dai
//        System.out.println(a.length());
//        
        //Doi sang in hoa
//        char[] arr = a.toCharArray();
//        for(int i = 0; i < arr.length; i++) {
//            if(arr[i] >= 65 && arr[i] <= 90){
//                arr[i] += 32;
//            }
//         
//         a = String.valueOf(arr);       
        a= a.toLowerCase();
        System.out.println(a.toLowerCase());
        String arr[]=a.trim().split("\\s+");
        for(int i=0;i<arr.length;i++){
     String firstLetter=arr[i].substring(0,1);
        firstLetter=firstLetter.toUpperCase();
        String remainder= arr[i].substring(1);
        
        firstLetter=firstLetter.toUpperCase();
        arr[i]=firstLetter+remainder;
        }
      for(int i=0;i<arr.length;i++)
        System.out.println("Chuoi sau khi doi:"+ arr[i]);
        
        //kiem tra chuoi kitu//so
//        boolean check=false;
//        for(int i=0;i<a.length();i++)
//            if(isDigit(a.charAt(i))) check=false;
//        
//        if(check==true) System.out.println("Chuoi toan so");
//        else System.out.println("Chuoi khong phai toan so");
        
        
    
    }

    private static void toUpper(char charAt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
}
