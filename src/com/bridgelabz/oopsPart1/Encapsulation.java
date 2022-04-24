package com.bridgelabz.oopsPart1;

 class Encp2 {
    private String empName = "Ashish";
    public String empAdd= "Solapur";
    //Getter Method
    public String getName(){

        return empName;
    }

    //Setter Method
    public void setEmpAdd(String addr){
        this.empAdd = addr;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Encp2 d1 = new Encp2();
        String Name = d1.getName();
        System.out.println(Name);
        d1.setEmpAdd("Pune");
        String Addres = d1.empAdd;
        System.out.println(Addres);
    }
}
