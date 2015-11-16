package DataPack;

/**
 * Created by Alvaro on 14/11/2015.
 */
public class Operation
{
    int op;         //cod of operation realized
    String taid;    //terminal operated
    String ofid;    //office of terminal
    String acid;    //account
    String card;    //
    float amount;   //
    Transfered tacc;

    /**
     * this method is a constructor for operations like deposits and withdraws
     * @param op the value of the operation
     * @param taid the terminal where the operations are realized
     * @param ofid the office id of the account
     * @param acid the account id where the amount is transfered
     * @param card the card number of then made the transfer
     * @param amount the amount to be transfered
     */
    public Operation(int op, String taid, String ofid, String acid, String card, float amount)
    {
        this.op = op;
        this.taid = taid;
        this.ofid = ofid;
        this.acid = acid;
        this.card = card;
        this.amount = amount;
    }

    /**
     * this method is a constructor for transferences between accounts in same banks
     * @param op the value of the operation
     * @param taid the terminal where the operations are realized
     * @param ofid the office id of the account
     * @param acid the account id where the amount is transfered
     * @param card the card number of then made the transfer
     * @param amount the amount to be transfered
     * @param acidOther the account id to be transfered
     */
    public Operation(int op, String taid, String ofid, String acid, String card, float amount, String acidOther)
    {
        this.op = op;
        this.taid = taid;
        this.ofid = ofid;
        this.acid = acid;
        this.card = card;
        this.amount = amount;
        tacc = new TransferedAcc(acidOther);
    }

    /**
     * this method is a constructor for transferences between accounts in different banks
     * @param op the value of the operation
     * @param taid the terminal where the operations are realized
     * @param ofid the office id of the account
     * @param acid the account id where the amount is transfered
     * @param card the card number of then made the transfer
     * @param amount the amount to be transfered
     * @param acidOther the account id to be transfered
     * @param bank the name of the other bank
     */
    public Operation(int op, String taid, String ofid, String acid, String card, float amount, String acidOther, String bank)
    {
        this.op = op;
        this.taid = taid;
        this.ofid = ofid;
        this.acid = acid;
        this.card = card;
        this.amount = amount;
        tacc = new TransferedAccOther(acidOther, bank);
    }
}
