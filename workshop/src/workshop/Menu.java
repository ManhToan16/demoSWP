/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author toanl
 */
public class Menu {
    public static int getChoice(ArrayList option){
        for (int i = 0; i < option.size(); i++) {
            System.out.println((i+1)+"-"+option.get(i));
            
        }
        System.out.println("Choose 1.."+option.size()+": ");
        Scanner sc=new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }
    public static int getChoice(Object[] option){
          for (int i = 0; i < option.length; i++) {
            System.out.println((i+1)+"-"+option [i]);
            
        }
        System.out.println("Choose 1.."+option.length+": ");
        Scanner sc=new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());

        }
    }

