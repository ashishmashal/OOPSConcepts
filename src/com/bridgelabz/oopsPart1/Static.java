package com.bridgelabz.oopsPart1;

public class Static {
    public String empName;
    public int empNo;
    static String CompNAme="Bridgelabz"; // Static Variable

    public Static(String eName , int eNo){
        this.empName = eName;
        System.out.println("Employee Name is " + eName );
        this.empNo = eNo;
        System.out.println("Employee Name is " + eNo );

    }
    //Static Block
    static{
        System.out.println("Inside the Static Block");
    }

    public static void main(String[] args) {
        Static d2s= new Static("Ashish",123);
        Static d2s1= new Static("Vikas",112);
        Static d2s2= new Static("Vicky",121);
    }
}
