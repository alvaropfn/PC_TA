package BankPack;

import java.util.ArrayList;

/**
 * Created by Alvaro on 11/11/2015.
 */
public class Bank
{
    String name;
    float funds;
    ArrayList<Account> accounts;
    ArrayList<Office> offices;
    ArrayList<Client> underAttendance;

    public Bank(String name, float Funds)
    {
        this.name = name;
        this.funds = funds;

        offices = new ArrayList<Office>();
        this.addOffice();//matriz
        accounts = new ArrayList<Account>();
        underAttendance = new ArrayList<Client>();
    }

    public int addOffice()
    {
        int OFID = offices.size();
        offices.add(new Office(OFID));
        return OFID;
    }



}
