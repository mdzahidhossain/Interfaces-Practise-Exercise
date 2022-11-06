package ExerciseTenFour;

public class Data
{
    public static double average(Object[] objects, Measurer meas)
    {
        double sum = 0;

        for(int i = 0; i < objects.length; i++)
        {
            sum = sum + meas.measure(objects[i]);
        }

        if(objects.length > 0)
        {
            return sum / objects.length;
        }
        else
        {
            return 0;
        }
    }

    public static Object max(Object[] objects, Measurer meas)
    {
        double largest = meas.measure(objects[0]);
        int largestPos = 0;

        for(int i = 1; i < objects.length; i++)
        {
            if(meas.measure(objects[i]) > largest)
            {
                largest = meas.measure(objects[i]);
                largestPos = i;
            }
        }

        return objects[largestPos];
    }
}