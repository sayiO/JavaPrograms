package com.onayasi;

public class BankExample {
    int acc_no;
    String acc_name;
    float amount;

    void insert(int i, String s, float amt){
        acc_no = i;
        acc_name = s;
        amount = amt;
    }
    void deposit(float amt){
        amount = amount + amt;
        System.out.println("the amount deposited is " + amt);
    }

    void withdraw(float amt){
        amount = amount -amt;
        if(amount < amt){
            System.out.println("Insufficient funds...!");
        }
        else{
            System.out.println("Transaction successful,please take out you cash in the amount " + amt);

        }
        }
    void checkBalance(){
        System.out.println("the balance is " + amount);
    }
    void display(){
        System.out.println("The balance amount of the customer with account number " + acc_no + " having the name " + acc_name + " is " + amount);
    }
        public static void main(String[]args){
        BankExample c1 = new BankExample();
c1.insert(888888888, "Onias Sayi", 2500);
            c1.display();
c1.checkBalance();
c1.deposit(45);
c1.checkBalance();
c1.withdraw(500);
c1.checkBalance();
c1.display();

        }}