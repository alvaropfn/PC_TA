package MainPack;

import BankPack.Bank;
import BankPack.Client;
import BankPack.Office;

/**
 * Created by Alvaro on 11/11/2015.
 */
public class Main
{

    public static void main(String [] args)
    {
        Bank bank = Bank.getInstance();

        Office of = bank.getOffice(bank.addOffice());
        Client ct = of.getClient(of.addClient());



        System.out.println("acabei!");
    }
}
