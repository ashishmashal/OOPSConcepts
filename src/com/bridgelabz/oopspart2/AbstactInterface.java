package com.bridgelabz.oopspart2;

interface AbInterface{
    void PrintName();
}
abstract class AbClass implements AbInterface{
    abstract void PrintSurname();
    public void PrintName(){
        System.out.println("Ashish");
    }
}
public class AbstactInterface extends AbClass{
    public void PrintSurname(){
        System.out.println("Mashal");
    }

    public static void main(String[] args) {
        AbClass a1 = new AbstactInterface();
        a1.PrintSurname();
        a1.PrintName();
    }
}
