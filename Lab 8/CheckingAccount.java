public class CheckingAccount extends BankAccount
{
    private static double FEE = 0.15;
    private String accountNumber = getAccountNumber() + "-10";

    public CheckingAccount(String name, int initialAmount)
    {
        super(name, initialAmount);
        setAccountNumber(accountNumber);
    }

    @Override
    public boolean withdraw(double amount)
    {
        super.withdraw(amount + FEE);
        boolean completed = true;

        return completed;
    } 
}
