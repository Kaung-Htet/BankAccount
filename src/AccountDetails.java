public class AccountDetails {
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private int phoneNumber;

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public int getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double depositFunds (double depositMoney){
        System.out.println("Your deposited money = " + depositMoney);
        double balance = getBalance() + depositMoney;
        setBalance(balance);
        System.out.print("Your final balance now = " );
        return getBalance();
    }

    public double withdrawFunds (double withdrawal){
        if (withdrawal > getBalance()){
            System.out.println("Oops your balance ( " + getBalance() + " ) is insufficient");
        } else {
            System.out.println("Your withdrawal = " + withdrawal);
            double balance = getBalance() - withdrawal;
            setBalance(balance);
        }

        System.out.print("Your final balance now = " );
        return getBalance();
    }
}

// Create a new class for bank account
// Create fields for the account number, balance, customer name, email and phone number,
//
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should debut from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working
// Add some System.out.println in the two methods above as well.
