package BankPack;

/**
 * Created by Alvaro on 11/11/2015.
 */
public class Terminal implements Runnable
{
    private Bank bank;
    private int taid;
    private Client client;

    public Terminal(int taid, Bank bank)
    {
        this.taid = taid;
        this.bank = bank.getInstance();
        this.client = null;
    }

    /*
    * TODO
    *
    */
    public void run()
    {

    }

    /**
     *this method is used to test if
     * @param ofid
     * @param card
     * @param pass
     * @return sucess of the operation
     */
    public boolean doLogin(int ofid, String card, int pass)
    {
        Office office = bank.getOffice(ofid);
        Account account;

        if(office != null)
        {
            account = office.getAccount(card, pass);

            if(account != null)
            {

            }

        }

        return false;
    }

    /*
    * TODO
    *
    */
    private void checkClientAtendance()
    {

    }

    /*
    * TODO
    *
    */
    private void withdraw(float amount)
    {

    }

    /*
    * TODO
    *
    */
    private void transfer(float amount)
    {

    }

    private void deposit(float amount)
    {

    }

}
