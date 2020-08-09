public class Main {
    public static void main(String[] args) {
//        AccountDetails bobsAccount = new AccountDetails("12345", 0.00, "Bob Brown",
//                "myemail@bob.com","(087) 123-4567" );

        AccountDetails bobsAccount = new AccountDetails();

        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getBalance());

//        bobsAccount.setAccountNumber("12345");
//        bobsAccount.setBalance(0);
//        bobsAccount.setName("Bob Brown");
//        bobsAccount.setEmail("myemail@bob.com");
//        bobsAccount.setPhoneNumber("(087) 123-4567");

        bobsAccount.withdrawal(100);

        bobsAccount.deposit(50);
        bobsAccount.withdrawal(100);

        bobsAccount.deposit(51);
        bobsAccount.withdrawal(100);

        VipCustomer nyilay = new VipCustomer("Nyilay",400.00, "nyilay@email.com");
        System.out.println(nyilay.getName());
        System.out.println(nyilay.getCreditLimit());
        System.out.println(nyilay.getEmailAddress());
        
        VipCustomer kaung = new VipCustomer("Kaung", 500.00);
        System.out.println(kaung.getCreditLimit());

        VipCustomer kaungNyilay = new VipCustomer();
        System.out.println(kaungNyilay.getEmailAddress());
        
        
    }
}
