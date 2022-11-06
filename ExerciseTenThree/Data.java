package ExerciseTenThree;

public class Data
{
    public static double average(Measurable[] objects)
    {
        double sum = 0;
        for(Measurable obj : objects)
        {
            sum = sum + obj.getMeasure();
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

    public static Object max(Measurable[] objects)
    {
        double largest = objects[0].getMeasure();
        int largestPosition = 0;

        for(int i = 0; i < objects.length; i++)
        {
            if(objects[i].getMeasure() > largest)
            {
                largest = objects[i].getMeasure();
                largestPosition = i;
            }
        }

        Object result = objects[largestPosition];

        return result;
    }
}
