package OOPDesignShapes;

import java.text.DecimalFormat;

public abstract class Shape
{
    // Fields
    protected final DecimalFormat df = new DecimalFormat("0.00");
    protected String color;
    protected boolean filled;

    // Getters
    public String getColor(){return color;}
    public boolean isFilled() {return filled;}

    // Constructors
    public Shape()
    {
        this.color = "green";
        this.filled = true;
    }
    public Shape(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    // Abstract Methods
    public abstract double getArea();
    public abstract double getPerimeter();

    // ToString Method
    @Override
    public String toString()
    {
        String isFilled;
        if(filled)
            isFilled = isFilled = "filled";
        else
        isFilled = "not filled";
        return "A Shape with color of "+color+" and is "+isFilled;
    }
}