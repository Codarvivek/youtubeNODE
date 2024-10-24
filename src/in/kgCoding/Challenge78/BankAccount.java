package in.kgCoding.Challenge78;

class BankAccount {
    private String AccountNumber;
    private String AccountHolderName;
    private double balance;

    BankAccount(String accountNumber, String accountHolderName) {
        AccountNumber = accountNumber;
        AccountHolderName = accountHolderName;
    }

    public void depositMoney(double Money){
        if(Money<=0){
            System.out.print("Invalid Money");
        }
        else {
            balance += Money;
        }
    }
    public  double withdrawMoney(double Money){
        if(Money<=0){
            System.out.print("Invalid Transation!");
        }
        else if(Money<=balance){
            balance=balance-Money;
        }   else{
            System.out.print("Invalid Withdraw");
            
        }
        return balance;

    }
}
