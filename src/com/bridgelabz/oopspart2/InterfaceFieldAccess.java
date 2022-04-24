package com.bridgelabz.oopspart2;

interface AccessField{
    public static  int rollno= 121;
    String name= "Ashish";
}
class Accessing implements AccessField{

}
public class InterfaceFieldAccess {
    public static void main(String[] args) {
        Accessing as = new Accessing();
        System.out.println("Interface fields is " + as.rollno);
    }
}
