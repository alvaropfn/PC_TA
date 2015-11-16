package BankPack;

import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by Alvaro on 11/11/2015.
 */
public class Bank extends Observable implements Runnable
{
    private static Bank instance = new Bank();

    private String name;
    private float balance;
    private long time;
    private ArrayList<Account> accounts;
    private ArrayList<Office> offices;
    private ArrayList<Client> clients;
    private ArrayList<Client> underAttendance;

    private Bank()
    {
        super();
        this.balance = 0;

        offices = new ArrayList<Office>();
        this.addOffice();//matriz

        clients = new ArrayList<Client>();
        accounts = new ArrayList<Account>();
        underAttendance = new ArrayList<Client>();
    }

    public synchronized static Bank getInstance()
    {
        return instance;
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

    /**
     * this method add a client to the bank clients list
     * @param name the name of the client
     * @param cpf the unique identificator of the client (not verified yet)
     * @return client added to the bank
     */
    public Client addClient(String name, String cpf)
    {
        int ctid = this.clients.size();
        clients.add(new Client(name, cpf, ctid));

        return getClient(ctid);
    }

    /**
     * this metodo is used to get client more fast from bank by the client id
     * @param ctid the client it's also the index of them in the bank
     * @return client atached in index id
     */
    public Client getClient(int ctid)
    {
        Client c = clients.get(ctid);
        return  c != null ? c: null;
    }

    /**
     *  this method is used to get client from bank by the cpf
     * @param cpf the client cpf
     * @return client with corresponding cpf
     */
    public Client getClient(String cpf)
    {
        for(Client c : clients)
            if(c.getcpf().equals(cpf))return c;

        return null;
    }

    /**
     * this method is used to check if a client is under attendance
     * @param client client to be checked
     * @return true if client is alrady logged
     */
    public boolean checkUnderAttendance(Client client)
    {
        for(Client c : underAttendance)
            if(c.getcpf().equals(client.getcpf())) return true;

        return false;
    }

    public synchronized void addUnderAttendance(Client client)
    {
        underAttendance.add(client);
    }

    public synchronized void delUnderAttendance(Client client)
    {
        underAttendance.remove(client);
    }

}
