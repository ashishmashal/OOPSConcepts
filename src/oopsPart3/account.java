package oopsPart3;

import java.util.Scanner;

public class account {
    public static void main(String[] args) {
        int amt =8000;
        int dbt ;
        System.out.println("Enter Amount Ypu Want to debit");
        Scanner scanner = new Scanner(System.in);
        dbt= scanner.nextInt();
        if (dbt <= amt)
            System.out.println("Amount Is Withdrwal");
        else
            System.out.println("Insufficient amount in your account");
       // int bal = amt - dbt;
       // System.out.println("Account Balance is " + bal);
    }

}
