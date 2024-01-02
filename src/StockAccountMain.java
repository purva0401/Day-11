public class StockAccountMain {
    public static void main(String[] args) {
        StockAccount stockAccount = new StockAccount("Tata");
        stockAccount.buy(8000, "Birla");
        stockAccount.buy(600, "Adani");
        stockAccount.sell(6000, "Tata");
        stockAccount.printReport();
    }
}
