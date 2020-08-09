public class Main {
    public static void main(String[] args) {
        AccountDetails account = new AccountDetails();
        System.out.println(account.depositFunds(100));
        System.out.println(account.withdrawFunds(30));
        System.out.println(account.depositFunds(250));
    }
}
