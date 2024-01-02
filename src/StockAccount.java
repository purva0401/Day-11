import java.util.ArrayList;
import java.util.List;

public class StockAccount {
        List<CompanyShares> companyShares = new ArrayList<>();
        public StockAccount(String fileName) {
            companyShares.add(new CompanyShares(fileName, 40000, 10));
        }
        public void buy(int amount, String symbol) {
            int shareNumber = (int) (amount/companyShares.get(0).shareValue);
            companyShares.add(new CompanyShares(symbol, shareNumber, 10));
        }

        public void sell(int amount, String symbol) {
            int shareNumber = (int) (amount/companyShares.get(0).shareValue);
            companyShares.add(new CompanyShares(symbol, shareNumber, 10));
        }

        public void printReport() {
            for(CompanyShares companyShare: companyShares) {
                System.out.println(companyShare.stockSymbol +"\t"+ companyShare.shareNumber +"\t"+ companyShare.shareValue +"\t"+ companyShare.transactionDate);
            }
        }
    }

