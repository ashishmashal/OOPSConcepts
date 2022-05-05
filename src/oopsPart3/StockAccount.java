package oopsPart3;

import java.util.Scanner;

public class StockAccount {
    public static int amount=10000;
    public static int debit,totalamount,credit;
    static Scanner scanner = new Scanner(System.in);
    public static void Sell(){
        System.out.println("How much You Want to sell product");
        int product= 50 ;
        int sellProduct= scanner.nextInt();
        int totalSellProduct = sellProduct - product  ;
        System.out.println("Total Product sell " + sellProduct);
        product = - totalSellProduct ;
        System.out.println("Remaining Products are " + product);
        int debit = amount + sellProduct;
        System.out.println("Remaining Products are " + debit);
    }
    public static void Buy(){
        int product  = 50 ;
        System.out.println("Enter How Much You Want to Buy");
        int buyProduct= scanner.nextInt();
        int totalBuyProduct = product + buyProduct ;
        System.out.println("Total Product buy " + buyProduct);
        product = + totalBuyProduct;
        System.out.println("Remaining Products are " + product );
        int credit = amount - buyProduct  ;
        System.out.println("Total Product buy " + credit);
    }

    public static void main(String[] args) {
        StockAccount stockacount = new StockAccount();
        Sell();
        Buy();

    }
}
