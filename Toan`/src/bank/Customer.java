/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author toanl
 */
public class Customer extends User{
    public String Account;

    public Customer() {
    }

    public Customer(String ID, String name) {
        super(ID, name);
    }

    public String getAccount() {
        return Account;
    }

    public void setAccount(String Account) {
        this.Account = Account;
    }

    @Override
    public String toString() {
        return super.toString() +Account;
    }
    
    
}
