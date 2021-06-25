package com.onayasi;

public class JavaEncapsulation {
    private int acc_no;
    private String name;
    private double balance;


    public void setAcc_no(int acc_no){
        this.acc_no = acc_no;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
        }
    public int getAcc_no() {
        return acc_no;
    }
    public  double getBalance(){
        return balance;
    }
    public  static void main(String [] args){
        JavaEncapsulation c1 = new JavaEncapsulation();
        c1.setAcc_no(36459);
        c1.setBalance(12.56);
        c1.setName("onias sayi");
        System.out.println("The account name is " + c1.getName() + " with account number " + c1.getAcc_no() + " ,having a  balance of " + c1.getBalance() );
        System.out.println(c1.getAcc_no());
        System.out.println(c1.getName());
        System.out.println("and the balance is "+ c1.getBalance());

    }
}
