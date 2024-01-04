/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

import java.util.Scanner;

/**
 *
 * @author toanl
 */
public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        User user=new User();
        Account acc=new Account();
        Customer cus=new Customer();
        System.out.println("Nhap thong tin khach hang");
        String id =sc.nextLine();
        System.out.println("Name");
        String name =sc.nextLine();
        System.out.println("AccNum");
        String acc1=sc.nextLine();
        System.out.println("Balance");
        double bal=sc.nextDouble();
        
        
        
        
    }
    
}
