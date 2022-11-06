package ExerciseTenFive;

import java.awt.Rectangle;

public class PerimeterMeasurer implements Measurer
{
    public double measure(Object anObject)
    {
        Rectangle aRectangle = (Rectangle) anObject;
        double perimeter = (aRectangle.getWidth() * 2) + (aRectangle.getHeight() * 2);
        return perimeter;
    }
}