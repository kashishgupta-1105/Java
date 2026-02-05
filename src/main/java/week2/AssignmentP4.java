package week2;

class BankAccount{
    private  double balance = 9000;

     class Transaction{
        public  void deposit(double amount){
            balance += amount;
        }

        public void withdraw(double amount){
            if(amount <= balance) {
                balance -= amount;
            }else{
                System.out.println("Insufficient Balance");
            }
        }

        void showBalance(){
            System.out.println("Balance is: " + balance);
        }
    }

}
public class AssignmentP4 {
    public static void main(String[] args){
        BankAccount account = new BankAccount();
        BankAccount.Transaction transaction = account.new Transaction();

        transaction.deposit(6000);
        transaction.showBalance();

        transaction.withdraw(9000);
        transaction.showBalance();

    }
}

// we can access the private variable of outer class in inner class because inner classes have access to
// all members of outer class even if it is private.