package com.bridgelabz.oopspart2;
interface vehicals{
        double engver= 1.2;
        String engName = "R8";
        void EngDetails();
    }
        class ShowEngDetails implements vehicals{
            public void EngDetails(){
                System.out.println("Engine Version is " + engver + "\nEngine NAme is "+ engName);
            }
        }


public class Vehicals {
    public static void main(String[] args) {
        ShowEngDetails sed = new ShowEngDetails();
        sed.EngDetails();

    }
}