package DataPack;

/**
 * Created by Alvaro on 16/11/2015.
 */
public class TransferedAccOther extends TransferedAcc
{
    String bank;

    public TransferedAccOther(String acid, String bank)
    {
        super(acid);
        this.bank = bank;
    }
}
