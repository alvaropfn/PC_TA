package BankPack;

/**
 * Created by Alvaro on 11/11/2015.
 */
public class Client implements Observer
{
    private int ctid;
    private String cpf;
    private String name;

    public Client(String name, String cpf, int ctid)
    {
        this.name = name;
        this.ctid = ctid;
        this.cpf = cpf;
    }

    public String getName(){return this.name;}
    public int getctid(){return this.ctid;}
    public String getcpf(){return this.cpf;}

    @Override
    public void update()
    {

    }
}
