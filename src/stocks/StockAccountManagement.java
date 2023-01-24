package stocks;

public class StockAccountManagement {
    // instance variable
    private String stockNames;
    private double numOfShare;
    private double sharePrice;

    public StockAccountManagement() {
        super();
    }

    // Parameterized constructor
    public StockAccountManagement(String stockNames, double numOfShare, double sharePrice) {
        super();
        this.stockNames = stockNames;
        this.numOfShare = numOfShare;
        this.sharePrice = sharePrice;
    }
    // getters and setters

    public String getStockNames() {
        return stockNames;
    }

    public void setStockNames(String stockNames) {
        this.stockNames = stockNames;
    }

    public double getNumOfShare() {
        return numOfShare;
    }

    public void setNumOfShare(double numOfShare) {
        this.numOfShare = numOfShare;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }
}
