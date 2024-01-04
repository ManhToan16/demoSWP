/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author toanl
 */
public class Account implements IAccount{
    public int accNum;
    public int balance;

    public Account() {
    }

    public Account(int accNum, int balance) {
        this.accNum = accNum;
        this.balance = balance;
    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" + "accNum=" + accNum + ", balance=" + balance + '}';
    }

    @Override
    public void withdraw(double x) {
        if(x%10000 ==0 && (balance -x) >=50000)
            this.balance-=x;
        else System.out.println("Fail");
    } 
    
    

    @Override
    public void display(double x) {
        System.out.println("AccNum:"+this.accNum);
        System.out.println("So du ban dau"+ this.balance+x);
        System.out.println("Balance: "+ this.balance);
        System.out.println("So tien rut"+x);
    }
    
    
}
