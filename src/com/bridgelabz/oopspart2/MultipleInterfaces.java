package com.bridgelabz.oopspart2;

interface Employee{
    int empid=121;
    String ename="Ashish";
    void empShowDetails();

}
interface Office{
    String Loc="Pune";
    String OName="XYZ";
    void ShowOfficeDetails();
}
 class Details implements Office,Employee {
    public void empShowDetails(){

        System.out.println("Emp ID Is " + empid + " Emp Name is " + ename );
    }
    public void ShowOfficeDetails(){

        System.out.println("Office Location is " + Loc + " Office NAme is " + OName);
    }
}

public class MultipleInterfaces {
    public static void main(String[] args) {
        Details d1= new Details();
        d1.empShowDetails();
        d1.ShowOfficeDetails();
    }
}
