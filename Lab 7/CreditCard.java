public class CreditCard
{
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money limit)
    {
        owner = newCardHolder;
        creditLimit = new Money(limit);
        balance = new Money(0);
    }

    public Money getBalance()
    {
        return balance;
    }

    public Money getCreditLimit()
    {
        return creditLimit;
    }

    public String getPersonals()
    {
        return owner.toString();
    }

    public void charge(Money amount)
    {
        Money charge = balance.add(amount);
        if (charge.compareTo(creditLimit) > 0) 
        {
            System.out.println("Exceeds credit limit");
        }
        else
        {
            balance = charge;
            System.out.println("Charge: " + amount);
        }
    }

    public void payment(Money amount)
    {
        System.out.println("Payment: " + amount);
        balance = balance.subtract(amount);
    }
}
