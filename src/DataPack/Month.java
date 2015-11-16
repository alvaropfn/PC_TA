package DataPack;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Alvaro on 14/11/2015.
 */
public class Month
{
    Date date;
    SimpleDateFormat sdf = new SimpleDateFormat("MM");
    ArrayList<Day> days;

    public Month(Date date)
    {
        this.date = date;
        days = new ArrayList<Day>();
    }

    public void addDay(Date date)
    {
        days.add(new Day(date));
    }
}
