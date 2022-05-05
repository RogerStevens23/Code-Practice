package OOPDesignShapes;

import java.util.Objects;

public class Square extends Rectangle
{
    public Square(double length, double width)
    {
        super(length, width);
    }
    public boolean isSquare()
    {
        return Objects.equals(df.format(lengthA), df.format(widthB));
    }

    @Override
    public String toString()
    {
        return "A square with side = "+lengthA+", which is a subclass of "+super.toString();
    }
}