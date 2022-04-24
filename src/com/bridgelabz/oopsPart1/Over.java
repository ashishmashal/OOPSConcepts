package com.bridgelabz.oopsPart1;

public class Over {
        int RollNo;
        String Arg,Name,Addr;
    public Over(){
        System.out.println("Inside Default Consct");
    }
    public Over(String arg, int rollNo){
        this.Arg = arg;
        System.out.println("Arg IS " + arg);
        this.RollNo = rollNo;
        System.out.println("RollNO IS " + rollNo);
    }
    public Over(String name, String addr){
        this.Name = name;
        System.out.println("Name IS " + name);
        this.Addr = addr;
        System.out.println("Address IS " + addr);
    }
    public static void main(String[] args) {
        Over d1 = new Over();
        Over d2 = new Over("Hi",123);
        Over d3 = new Over("Ashish","Solapur");
    }
}

