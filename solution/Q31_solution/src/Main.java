
import java.io.*;
import java.util.*;
public class Main {
    
   public static void OutputList(List<Bicycle> c) {
       for(Bicycle x : c) {
           System.out.println(x.getName());
       }
   }  
    
   public static void main(String args[]) throws Exception {
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       List<Bicycle> a = new ArrayList();
       
       System.out.print("Add more how many bicycle: ");
       int n = Integer.parseInt(in.readLine());
       for(int i = 0; i < n; i++){
           System.out.println("");
           System.out.print("Bicycle name: ");
           String name = in.readLine();           
           System.out.print("Bicycle price: ");
           float price = Float.parseFloat(in.readLine());             
           a.add(new Bicycle(name, price));
       }
       a.add(0,new Bicycle("Yamaha 2017A", 110));
       a.add(1,new Bicycle("Audi 2017B",  250));
       a.add(2,new Bicycle("Porche 2017C", 120));
       System.out.println("");
       System.out.print("Enter test function (1-f1;2-f2): ");
       int c = Integer.parseInt(in.readLine());
       IBicycle i = new MyBicycle();
       
       String givenName = "";
       if (c == 2) {
            System.out.print("Enter given bicycle name: ");
            givenName = in.readLine();
       }
       System.out.println("");
       System.out.println("OUTPUT:");    
       if(c == 1) {
           i.f1(a);
           OutputList(a);
       }
       else if(c == 2) {
          System.out.println(i.f2(a,givenName));  
       }
   }
 }
