/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toan;

import java.util.Scanner;

/**
 *
 * @author toanl
 */
public class songuyento {
     public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
  

        System.out.print("Nhập vào số nguyên n = ");
        int n=sc.nextInt();

        if(isPrime(n)){
            System.out.println(n+" là số nguyên tố!");
        } else {
            System.out.println(n+" không là số nguyên tố!");
        }

        sc.close();
    }
    
}
