

// ======= DO NOT EDIT THIS FILE ============
import java.io.*;
public class Main {
    
   public static void main(String args[]) throws Exception {
       
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
       System.out.printf("1. TC = 1 - test getPricetoUSD()"
               + "\n2. TC = 2 - test getCode()\n");
       System.out.print("Enter TC: ");
       int tc = Integer.parseInt(in.readLine());
       int price= 0;
       String rc = "";
       if(tc == 1) {
           System.out.print("Enter price in VND: ");
           price = Integer.valueOf(in.readLine());
       }
       if(tc == 2) {
           System.out.print("Enter a address: ");
           rc = (in.readLine());
       }
       System.out.println("OUTPUT:");
       MyHouse c = new MyHouse(price, rc);
       switch (tc) {
           case 1:
               System.out.printf("%.2f\n",c.getPricetoUSD());
               break;
           case 2:
               System.out.printf("%s\n",c.getCode());
               break; 
           default:
               break;
       }
       
   }
 }