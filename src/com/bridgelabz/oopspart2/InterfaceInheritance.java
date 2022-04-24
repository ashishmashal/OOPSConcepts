package com.bridgelabz.oopspart2;

interface employee{
    int empid=121;
    String ename="Ashish";
    void empShowDetails();

}
interface office extends Employee {
    String Loc="Pune";
    String OName="XYZ";
    void ShowOfficeDetails();
}
class DetailsShow implements office {
    public void empShowDetails(){
        System.out.println("Emp ID Is " + Employee.empid + "\nEmp Name is " + Employee.ename );
    }
    public void ShowOfficeDetails(){
        System.out.println("Office Location is " + Loc + "\nOffice NAme is " + OName);
    }
}

public class InterfaceInheritance {
    public static void main(String[] args) {
        DetailsShow d1= new DetailsShow();
        d1.empShowDetails();
        d1.ShowOfficeDetails();
    }
}
