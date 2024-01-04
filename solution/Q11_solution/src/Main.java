/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
public class Main {
    
   public static void main(String args[]) throws Exception {
       
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter Person name: ");
       String name = in.readLine();
       System.out.print("Enter Person age: ");
       int  age = Integer.parseInt(in.readLine());
       System.out.printf("1. TC = 1 - test getName()"
               + "\n3. TC = 2 - test setAge()"
               + "\n3. TC = 3 - test toString()\n");       
       System.out.print("Enter TC: ");
       int tc = Integer.parseInt(in.readLine());
       Person t = new Person(name, age);
       if(tc == 2) {
           System.out.print("Enter new age: ");
           age = Integer.parseInt(in.readLine());
           t.setAge(age);
       }
       System.out.println("OUTPUT:");
       switch (tc) {
           case 1:
               System.out.println(t.getName());
               break;
           
           case 2:
                System.out.println(t.getAge());
                break;
           case 3:
               System.out.println(t);
               break;
           default:
               break;
       }
       
   }
 }