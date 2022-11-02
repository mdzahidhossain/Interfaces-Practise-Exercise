package ExerciseTenTwo;

public class Data
{

    public static double average(Measurable[] objects)
    {
        double sum = 0;

        for(int i = 0; i < objects.length; i++)
        {
            sum += objects[i].getMeasure();
        }

        if(objects.length == 0)
        {
            return 0;
        }
        else
        {
            return sum / objects.length;
        }
    }
    public static Object max(Measurable[] objects)
    {
        double largest = objects[0].getMeasure();
        int largestPos = 0;

        for(int i = 0; i < objects.length; i++)
        {
            if(objects[i].getMeasure() > largest)
            {
                largest = objects[i].getMeasure();
                largestPos = i;
            }
        }

        return objects[largestPos];
    }
    public static String letterConvert(double score)
    {
        if(score > 90)
        {
            return "A";
        }
        else if(score > 85)
        {
            return "B+";
        }
        else if(score > 80)
        {
            return "B";
        }
        else if(score > 75)
        {
            return "C+";
        }
        else if(score > 70)
        {
            return "C";
        }
        else if(score >= 65)
        {
            return "F+";
        }
        else
        {
            return "F";
        }
    }
}
