package DataPack;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Alvaro on 14/11/2015.
 */
public class Day
{
    Date date;
    SimpleDateFormat sdf = new SimpleDateFormat("dd");
    ArrayList<Operation> operations;

    public Day(Date date)
    {
        this.date = date;
        operations = new ArrayList<Operation>();
    }

    public void addOperation(Operation operation)
    {
        operations.add(operation);
    }
}
