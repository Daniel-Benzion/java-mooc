
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        
        Account matthewAccount = new Account("Matthews account", 1000.0);
        Account myAccount = new Account("My account", 0.0);
        matthewAccount.withdrawal(100.00);
        myAccount.deposit(100.00);
        
        System.out.println(matthewAccount.toString());
        System.out.println(myAccount.toString());
    }
}
