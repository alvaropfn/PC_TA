package BankPack;

import java.util.ArrayList;

/**
 * Created by Alvaro on 11/11/2015.
 */
public class Client implements Observer
{
    String name;
    String cpf;
    int ctid;

    //these two params is only for simulation porpose
    ArrayList<String> cards;
    ArrayList<Integer> passs;

    public Client(String name, String cpf, int ctid)
    {
        this.name = name;
        this.ctid = ctid;
        this.cpf = cpf;

        cards = new ArrayList<String>();
        passs = new ArrayList<Integer>();
    }

    public String getName(){return this.name;}
    public int getctid(){return this.ctid;}
    public String getcpf(){return this.name;}

    public void addCardPass(String card, int pass)
    {
        cards.add(card);
        passs.add(pass);
    }

    @Override
    public void update()
    {

    }
}
