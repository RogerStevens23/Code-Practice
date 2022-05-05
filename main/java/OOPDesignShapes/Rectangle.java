package OOPDesignShapes;

import java.util.Objects;

public class Rectangle extends Shape
{
    // Fields
    protected double lengthA, lengthB, widthA, widthB;

    // Getters
    public double getLengthA(){return lengthA;}
    public double getLengthB(){return lengthB;}
    public double getWidthA(){return widthA;}
    public double getWidthB(){return widthB;}

    // Constructors
    public Rectangle(double lengthA, double lengthB, double widthA, double widthB)
    {
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.widthA = widthA;
        this.widthB = widthB;
    }
    public Rectangle(double length, double width)
    {
        this.lengthA = length; this.lengthB = length;
        this.widthA = width; this.widthB = width;
    }

    // Methods
    public double getArea()
    {
        return lengthA*widthA;
    }
    public double getPerimeter()
    {
        return lengthA+lengthB+widthA+widthB;
    }
    public double getDiagonal()
    {
        return Math.sqrt(Math.pow(lengthA, 2)+Math.pow(widthA, 2));
    }
    public boolean isRectangle()
    {
        return Objects.equals(df.format(lengthA), df.format(lengthB)) && Objects.equals(df.format(widthA), df.format(widthB))
                && Objects.equals(df.format(Math.sqrt(Math.pow(lengthB, 2)+Math.pow(widthB, 2))), df.format(getDiagonal()));
    }

    @Override
    public String toString()
    {
        return "A rectangle with width = "+widthA+" and length = "+lengthA+" which is a subclass of "+super.toString();
    }
}