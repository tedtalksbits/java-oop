public class BankAccount {
//   static attributes

//    non-static attributes
    private String owner;
    private double balance;
    private int accountId = (int)(Math.floor(Math.random() * 1000));

//    constructor
    public BankAccount (String owner, double balance){
        this.balance = balance;
        this.owner = owner;

    }

//    getters
    public double getBalance(){
        return this.balance;
    }
    public int getAccountId(){
        return this.accountId;
    }
    public String getOwner() {
        return owner;
    }
//    static methods


//    non-static methods
    public void alertLowBalance(){
        if (this.balance < 100){
            System.out.println("Warning: Your balance is low.");
        }

    }
    public void depositMoney(double deposit, int accountId){
        if (accountId == this.accountId){
            System.out.println("********************************");
            System.out.println("Account found: ... \n");
            System.out.println("Welcome "+ this.owner +" \n");
            System.out.println("Your current balance is "+ getBalance() +" \n");
            this.balance += deposit;
            System.out.println("Deposit completed \n");
            System.out.println("Your new balance is "+ getBalance() +" \n");
            System.out.println("********************************");
        }
        else{
            System.out.println("I'm sorry but I there's no account with id: " + accountId + " found");
        }
    }
    public void withdrawMoney(double withdrawal, int accountId){
        if (accountId == this.accountId && this.balance >= withdrawal){
            System.out.println("********************************");
            System.out.println("Account found: ...\n");
            System.out.println("Welcome "+ this.owner +" \n");
            System.out.println("Your current balance is "+ getBalance() +" \n");
            this.balance -= withdrawal;
            System.out.println("Withdrawal completed \n");
            System.out.println("Your new balance is "+ getBalance() +" \n");
            System.out.println("********************************");
        }
        else{
            System.out.println("I'm sorry but something went wrong. Withdrawal failed. \n Your balance is " + getBalance() + ".");
            System.out.println("Requested Amount: " + withdrawal);
        }
    }

}
