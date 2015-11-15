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

    public void addTerminal()
    {
        int taid = terminals.size();
        terminals.add(new Terminal(taid, bank));
    }

    /**
     * this method add to the office one account with one client
     * geted by the bank clients list
     * @param name
     * @param cpf
     * @param pass
     */
    public void createAccount(String name, String cpf, int pass)
    {
        //try get client in bank
        Client client = bank.getInstance().getClient(cpf);
        if(client == null)//if client dont exist create one
            client = bank.getInstance().addClient(name, cpf);

        accounts.add
        (
            new Account
            (
                bank, this, pass, bank.getInstance().
                    addClient(name, cpf)
            )
        );
    }

    /**
     * this method add on client to one preexistent account
     * @param name
     * @param cpf
     * @param card
     * @param pass
     * @return true if added with sucess
     */
    public boolean joinAccount(String name, String cpf, String card, int pass)
    {
        //try get previus account
        Account account = getAccount(card, pass);
        if(account == null)
            return false;

        //try get client in bank
        Client client = bank.getInstance().getClient(cpf);
        if(client == null)//if client dont exist create one
            client = bank.getInstance().addClient(name, cpf);

        account.addClient(client);

        return true;
    }

    /**
     * this metodo is used to get if one card number and password match to any account
     * @param card
     * @param pass
     * @return return matched account
     */
    public Account getAccount(String card, int pass)
    {
        for(Account a : accounts)
            if(a.checkcard(card, pass))return a;

        return null;
    }
}
