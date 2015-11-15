package BankPack;

import java.util.ArrayList;

/**
 * Created by Alvaro on 11/11/2015.
 */
public class Office implements Observer
{
    Bank bank;
    int ofid;
    ArrayList<Terminal> terminals;
    ArrayList<Account> accounts;

    public Office(int ofidt, Bank bank)
    {
        this.bank = bank;
        this.ofid = ofid;
        this.terminals = new ArrayList<Terminal>();
    }

    /*
    *todo
    *
    */
    @Override
    public void update()
    {

    }

    public int getofid()
    {
        return this.ofid;
    }

    public int addTerminal()
    {
        int taid = terminals.size();
        terminals.add(new Terminal(taid, bank));
        return taid;
    }

    public int addAccount()
    {
        int acid = terminals.size();
        terminals.add(new Terminal(acid, bank));
        return acid;
    }

    /*
    *todo
    *
    */
    public Account getAccount(int card)
    {

        return null;
    }

    /*
    *todo
    *
    */
    public int addClient()
    {
        bank.getInstance().getClient();
        int ctid = clients.size();
        offices.add(new Office(ofid, this));
        return ofid;
    }
}
