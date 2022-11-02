package ExerciseTenOne;

public class Data {
    public static double average(ExerciseTenOne.Measureable[] objects)
    {
        double sum = 0;
        for(int i = 0; i < objects.length; i++)
        {
            sum = sum + objects[i].getMeasure();
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
    public static double max(ExerciseTenOne.Measureable[] objects)
    {
        double largest = 0;
        for(int i = 0; i < objects.length; i++)
        {
            if(objects[i].getMeasure() > largest)
            {
                largest = objects[i].getMeasure();
            }
        }

        return largest;
    }
}
