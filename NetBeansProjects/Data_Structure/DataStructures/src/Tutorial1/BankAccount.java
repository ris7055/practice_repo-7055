/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial1;

/**
 *
 * @author MD Raffaul Islam
 */
public class BankAccount implements Account {
    private int balance;
    
    public BankAccount(int balance) {
        this.balance = balance;
    }
    
    @Override
    public int deposit(int balance) {
        this.balance += balance;
        return this.balance;
    }
    
    @Override
    public boolean withdraw(int balance) {
        if (balance <= this.balance) {
            this.balance -= balance;
            return true;
        }
        else {
            return false;
        }
    }
}
