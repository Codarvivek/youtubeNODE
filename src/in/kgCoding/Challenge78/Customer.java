package in.kgCoding.Challenge78;

public class Customer {
    public static void main(String[] args) {
        BankAccount account=new BankAccount("001","Vivek");
        account.depositMoney(5000);
        account.withdrawMoney(6000);
    }
}
