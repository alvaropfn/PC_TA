package DataPack;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Alvaro on 14/11/2015.
 */
public class Year
{
    Date date;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
    ArrayList<Month> months;

    public Year(Date date)
    {
        this.date = date;
        months = new ArrayList<Month>();
    }

    public void addMonth(Date date)
    {
        months.add(new Month(date));
    }
}
