package BankPack;

import RulesPack.Rules;

import java.util.ArrayList;

/**
 * Created by Alvaro on 11/11/2015.
 *
 * this class is used to link a client to a office in the bank system
 */
public class Account {
    Bank bank;
    int acid;
    int ofid;
    int pass;

    ArrayList<String> cards;
    ArrayList<Client> clients;

    public Account(Bank bank, Office office, int pass, Client client)
    {
        this.bank = bank.getInstance();
        this.ofid = office.getofid();
        this.pass = pass;               //this password is unic for account
        this.addClient(client);         //number off cards of the first client
    }

    /**
     * this method is used to check if the
     * @param c
     * @return
     */
    public boolean addClient(Client c)
    {
        //to many clients in this account
        if (clients.size() == Rules.getMaxClients()) return false;
        clients.add(c);
        return this.addcard(c);
    }

    /**
     * this method is used to attach a card number to a client on account
     * @param client
     * @return sucess of the operation
     */
    private boolean addcard(Client client)
    {
        boolean sucess = true;
        String temp;

        if (this.acid % 10 < 0) {
            temp = "0000";
        } else if (this.acid % 10 >= 0) {
            temp = "000";
        } else if (this.acid % 100 >= 0) {
            temp = "00";
        } else if (this.acid % 1000 >= 0) {
            temp = "0";
        } else if (this.acid % 10000 >= 0) {
            temp = "";
        } else {
            temp = "";
            sucess = false;
        }

        temp += this.acid + clients.size();

        //attach to the client his cards number and password for remembering
        client.addCardPass(temp, this.pass);

        return sucess;
    }

    /**
     * this methodo check if the card number and password passed
     * below to the account
     * @param card the card number
     * @param pass the password
     * @return true if both match
     */
    public boolean checkcard(String card, int pass)
    {
        if(this.pass == pass)
        {
            for(String c : this.cards)
                if(c.equals(card))return true;
        }

        return false;
    }

    public Client getClientByCard(String card, int pass)
    {
        // Office office = bank.getInstance().getOffice(this.ofid);
        if(checkcard(card, pass))
        {
            for(int i = 0; i < clients.size(); i++)
                if(cards.get(i).equals(card))
                    return bank.getInstance().getClient(clients.get(i).getctid());
        }

        return null;
    }

}
