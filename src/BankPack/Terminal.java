package BankPack;

import DataPack.OPEnum;
import DataPack.Operation;

/**
 * Created by Alvaro on 11/11/2015.
 */
public class Terminal extends Thread
{
    private Bank bank;
    private int taid;

    private Client client;
    private Account account;

    boolean inUse;

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
     *this method is used to test if client use write credentias, in case of sucess
     * the Terminal Client will be seted to the client credentials
     * @param ofid
     * @param card
     * @param pass
     * @return sucess of the operation
     */
    public synchronized boolean doLogin(int ofid, String card, int pass)
    {
        Office office = bank.getOffice(ofid);
        if(office != null)
        {
            //this method already check the validate of the card and the password
            account = office.getAccount(card, pass);

            if(account != null)
            {
                client = account.getClientByCard(card, pass);

                //check if client is not already logged
                if(! bank.getInstance().checkUnderAttendance(client))
                {
                    bank.getInstance().addUnderAttendance(client);
                    inUse = true;
                    return inUse;
                }
            }
        }

        logout();
        return inUse;
    }

    /*todo*/
    public boolean withdraw(float amount)
    {

        return false;
    }

    /*todo*/
    public boolean deposit(float amount)
    {
        return false;
    }

    /*todo*/
    //public Operation(OPEnum op, String taid, String ofid, String acid, String card, float amount, String acidOther, String bank)
    public boolean transfer(OPEnum op, float amount )
    {
        return false;
    }


    private void logout()
    {
        inUse = false;
        client = null;
        account = null;
    }
}
