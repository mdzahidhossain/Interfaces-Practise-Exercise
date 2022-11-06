package ExerciseTenFive;

public class Data
{
    public static double average(Object[] objects, Measurer m)
    {
        double sum = 0;
        for (Object obj : objects)
        {
            sum = sum + m.measure(obj);
        }

        if (objects.length > 0)
        {
            return sum / objects.length;
        }
        else
        {
            return 0;
        }
    }

    public static double max(Object[] objects, Measurer m)
    {
        double largest = 0;
        for (Object obj : objects)
        {
            if(m.measure(obj) > largest)
            {
                largest = m.measure(obj);
            }
        }
        return largest;
    }
}