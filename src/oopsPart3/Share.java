package oopsPart3;

public class Share {
    public String StockName;
    public static int NoOfShares;
    public static int SharePrize;

    public String getStockName() {
        return StockName;
    }

    public static int getNoOfShare() {
        return NoOfShares;
    }

    public static int getSharePrize() {
        return SharePrize;
    }

    public void setStockName(String stockname) {
        this.StockName = stockname;
    }

    public void setNoOfShares(int noofshares) {
        this.NoOfShares = noofshares;
    }

    public void setSharePrize(int SharePrize) {
        this.SharePrize = SharePrize;
    }
    public String toString() {
        return ("Stock Name IS " + StockName + " \n NoOfShares Is " + NoOfShares + " \n sharePrize Is " + SharePrize + " \n ");
    }
}
