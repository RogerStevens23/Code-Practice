package OOPDesignShapes;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Objects;

public class Circle extends Shape
{
    // Fields
    protected double circumference, diameter, radius;

    // Getters
    public double getCircumference() {return circumference;}
    public double getDiameter() {return diameter;}
    public double getRadius() {return radius;}

    // Constructors
    public Circle(double circumference, double diameter, double radius)
    {
        this.circumference = circumference;
        this.diameter = diameter;
        this.radius = radius;
    }
    public Circle(double circumference, double diameter)
    {
        this.circumference = circumference;
        this.diameter = diameter;
        this.radius = diameter/2;
    }
    public Circle(double radius)
    {
        this.radius = radius;
        this.circumference = Math.PI*this.radius*2;
        this.diameter = radius*2;
    }

    // Methods
    public double getArea()
    {
        return Math.PI*Math.pow(radius, 2);
    }
    public double getPerimeter()
    {
        return Math.PI*diameter;
    }
    public boolean isCircle()
    {
        return Objects.equals(df.format(this.diameter / 2), df.format(radius)) && Objects.equals(df.format(this.circumference), df.format(getPerimeter()));
    }

    @Override
    public String toString()
    {
        return "A Circle with radius = "+radius+", which is a subclass of "+super.toString();
    }
}