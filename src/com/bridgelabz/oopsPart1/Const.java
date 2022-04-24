package com.bridgelabz.oopsPart1;

public class Const {
    public String str;
    public Const()
    {
        System.out.println("Inside the default constructor");
    }
    public Const(String strName){
        this.str = strName;
        System.out.println(strName);
    }
    public static void main(String[] args) {
     Const d2c = new Const();
     //String
     Const d2c1 = new Const("Ashish");
        //System.out.println(d2c1.str);

    }
}
