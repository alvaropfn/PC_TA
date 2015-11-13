package BankPack;

import java.util.ArrayList;

/**
 * Created by Alvaro on 11/11/2015.
 */
public class Account
{
    int ACID;
    int OFID;
    int pass;
    ArrayList<Client> clients;

    public Account(Office office, int pass, ArrayList<Client> clients)
    {
        this.OFID = office.getOFID();
        this.pass = pass;
        this.clients = clients;
    }
}
