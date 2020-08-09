public class AccountDetails {
    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    //ဒါက default constructor လို့ခေါ်တယ်
    //empty constructor ကိုခေါ်တဲ့အချိန်မှာ သုံးတယ်
    public AccountDetails(){
        //this keyword က ဒီ constructor ကနေ တခြား constructor ကိုယူသုံးတာ
        //this keyword စာကြောင်းက ဒီ code block ထဲမှာ အားလုံးထက် ပထမဦးဆုံးစာကြောင်းမှာရှိရမယ်
        //မဟုတ်ရင် error ပြလိမ့်မယ်
        this ("5678", 300, "Default Name", "Default Email", "Default Phone Number");
        System.out.println("Empty constructor called");
    }

    //constructor က access modifier နဲ့ class name ပဲနာမည်ပေးရတယ်
    public AccountDetails (String accountNumber, double balance, String name, String email, String phoneNumber){
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit (double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawal (double withdrawalAmount){
        if ((this.balance - withdrawalAmount) < 0){
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + balance);
        }
    }

    public String getAccountNumber() {
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

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
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

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
