package BankPack;

import java.util.ArrayList;

/**
 * Created by Alvaro on 11/11/2015.
 */
public class Bank extends Observable implements Runnable
{
    private String name;
    private float balance;
    private long time;
    private static Bank singleton;
    private ArrayList<Account> accounts;
    private ArrayList<Office> offices;
    private ArrayList<Client> underAttendance;

    private Bank()
    {
        super();
        this.balance = 0;
        offices = new ArrayList<Office>();
        this.addOffice();//matriz
        accounts = new ArrayList<Account>();
        underAttendance = new ArrayList<Client>();
    }

    public static Bank getInstance()
    {
        if (singleton == null)
        {
            singleton = new Bank();
        }
        return singleton;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    /*
    * TODO
    * implementar a execção da thread do banco
    * a thread deve executar uma ação de informar o fim do dia, do mes e do ano para as outras classes
    */
    public  void run()
    {

    }

    public int addOffice()
    {
        int ofid = offices.size();
        offices.add(new Office(ofid, this));
        return ofid;
    }

    public Office getOffice(int ofid)
    {
        for(Office of : offices)
        {
            if(of.getofid() == ofid) return of;
        }

        return null;
    }






}
