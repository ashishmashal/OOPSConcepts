package com.bridgelabz.oopsPart1;

public class OverLoading {
    public String empName;
    public int empNo;
    static String CompNAme="Bridgelabz"; // Static Variable

    public OverLoading(String eName , int eNo){
        this.empName = eName;
        System.out.println("Employee Name is " + eName );
        this.empNo = eNo;
        System.out.println("Employee Name is " + eNo );
    }

    public static void main(String[] args) {
        OverLoading d1 = new OverLoading("Ashish",123 );
        OverLoading d2 = new OverLoading("Vikas",1231 );
        OverLoading d3 = new OverLoading("Vicky",121 );
    }

}
