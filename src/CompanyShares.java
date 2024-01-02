import java.util.Date;

public class CompanyShares {

        String stockSymbol;
        int shareNumber;
        double shareValue;
        Date transactionDate;

        public CompanyShares(String stockSymbol, int shareNumber, double shareValue) {
            this.stockSymbol = stockSymbol;
            this.shareNumber = shareNumber;
            this.shareValue = shareValue;
            this.transactionDate = new Date();
        }
}
