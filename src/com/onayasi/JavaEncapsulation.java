package com.onayasi;

public class JavaEncapsulation {
    private long acc_no;
    private String name;
    private float balance;


    public void setAcc_no(long acc_no){
        this.acc_no = acc_no;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
        }
    public long getAcc_no() {
        return acc_no;
    }
    public  float getBalance(){
        return balance;
    }
    public  static void main(String [] args){
        JavaEncapsulation c1 = new JavaEncapsulation();
        c1.setAcc_no(36459);
        c1.setBalance(1049825122);
        c1.setName("onias sayi");
        System.out.println("The account name is " + c1.getName() + " with account number " + c1.getAcc_no() + " ,having a  balance of " + c1.getBalance() );
        System.out.println(c1.getAcc_no());
        System.out.println(c1.getName());
        System.out.println("and the balance is "+ c1.getBalance());

    }
}
