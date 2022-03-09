public class Main {

    public static void main(String[] args) {
//	new instance of BankAccount
        BankAccount myAcc = new BankAccount("Tedane Blake", 300.00);
        int accNumber = myAcc.getAccountId();
        myAcc.depositMoney(200.00, accNumber);
        myAcc.withdrawMoney(100.00, accNumber);
        myAcc.withdrawMoney(600.00, accNumber);


        
    }
}
