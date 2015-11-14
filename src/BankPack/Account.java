package BankPack;

import java.util.ArrayList;

/**
 * Created by Alvaro on 11/11/2015.
 */
public class Account
{
    Bank bank;
    int acid;
    int ofid;
    int pass;
    ArrayList<String> card;
    ArrayList<Client> clients;

    public Account(Bank bank, Office office, int pass, ArrayList<Client> clients )
    {
        this.bank = bank;
        this.ofid = office.getofid();
        this.pass = pass;
        this.clients = clients;
    }

    public String addCard()
    {

        //to many clients
        if(clients.size() ==3) return  null;

        String temp;

        if(this.acid%10 < 0)
        {
            temp = "0000";
        }
        else if(this.acid%10 >= 0)
        {
            temp = "000";
        }
        else if(this.acid%100 >= 0)
        {
            temp = "00";
        }
        else if(this.acid%1000 >= 0)
        {
            temp = "0";
        }
        else if(this.acid%1000 >= 0)
        {
            temp = "";
        }
        else return null;//to many accounts

        temp += this.acid + clients.size();

        return temp;

    }

}
