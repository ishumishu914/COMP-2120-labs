public class SavingsAccount extends BankAccount
{
    private double rate = 0.025;
    private int savingsNumber = 0;
    private String accountNumber = super.getAccountNumber();

    //constructor
    public SavingsAccount(String name, int initialAmount)
    {
        super(name, initialAmount);
        accountNumber = accountNumber + "-" + Integer.toString(savingsNumber);
    }

    //copy constructor
    public SavingsAccount(SavingsAccount oldAccount, double initialAmount)
    {
        super(oldAccount, initialAmount);
        savingsNumber++;
        accountNumber = oldAccount.accountNumber + "-" +Integer.toString(savingsNumber);
    }

    public void postInterest() 
    {
        double amount = getBalance() + (getBalance()*rate/12); //old balance + balance with monthly interes
        setBalance(amount);
    }

    @Override
    public String getAccountNumber()
    {
        return accountNumber;
    }
}
