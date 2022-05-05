package oopsPart3;

import java.util.ArrayList;
import java.util.Scanner;

public class StockManagement {
    static Scanner scanner = new Scanner(System.in);

    ArrayList<Share> arrayList = new ArrayList();

    public void addStock() {
    Share share=new Share();
        System.out.println("Enter Name For Stocks");
        share.setStockName(scanner.next());
        System.out.println("Enter  NoOfShares");
        share.setNoOfShares(scanner.nextInt());
        System.out.println("Enter sharePrize");
        share.setSharePrize(scanner.nextInt());
        arrayList.add(share);
    }

    public void displayStock() {
            for (Share shareDetails : arrayList) {
                System.out.print(shareDetails + " ");
            }
    }

    void totalValue() {
        int TotalValue = Share.getNoOfShare() * Share.getSharePrize();
        System.out.println("Total Value of shares is " + TotalValue);

    }

    public static void main(String[] args) {
        StockManagement stockmgnt = new StockManagement();
            stockmgnt.addStock();
            stockmgnt.displayStock();
            stockmgnt.totalValue();

    }
}