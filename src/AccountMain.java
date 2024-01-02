public class AccountMain {
    public static void main(String[] args) {
        Account acc=new Account("Purva",4000);

        System.out.println(acc.getBalance());
        acc.credit(1000);
        System.out.println(acc.getBalance());
        acc.debit(2000);
        System.out.println(acc.getBalance());
    }
}
