package RulesPack;

/**
 * Created by Alvaro on 15/11/2015.
 *
 * class created to store the business rules
 */
public class Rules
{
    private static int maxClients = 3;
    private static int maxWithdraws = 3;
    private static float transferCost = 10;
    private static float maxWithdrawAmount = 2000;
    private static float maxTransferAmount = 5000;
    private static float maxTransferAmountOther = 3000;


    public static boolean lessThemMaxClients(int clients)
    {
        if(clients <= maxClients) return true;
        else return false;
    }

    public static boolean lessThenMaxWithdraws(int withdraws)
    {
        if(withdraws < maxWithdraws)return true;
        else return false;
    }

    public static boolean lessThemMaxWithdrawAmount(float amount, int clients)
    {
        float temp = maxWithdrawAmount;
        if(clients == 2) temp *= 0.8;
        else if(clients == 3)  temp *= 0.7;

        if(amount > temp)return true;
        else return false;
    }

    public static boolean lessThemMaxTransferAmount(float amount)
    {
        if(amount > maxTransferAmount)return true;
        else return false;
    }

    public static boolean lessThemMaxTransferAmountOther(float amount)
    {
        if(amount > maxTransferAmountOther + transferCost)return true;
        else return false;
    }

    public static float getTransferCost()
    {return transferCost;}


}
