package OOPDesignShapes;

import java.util.ArrayList;

public class OOPDesignShapesApp
{
    public static void circleTest()
    {
        ArrayList<Circle> circles = new ArrayList<>();
        circles.add(new Circle(60,20, 11));
        circles.add(new Circle(62.83, 20));
        circles.add(new Circle(10));
        circles.add(new Circle(65,25));
        circles.add(new Circle(78.53,25,12.5));

        for (Circle circle : circles)
        {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println(circle);
            System.out.println("Area of the circle: "+circle.getArea());
            System.out.println("Circumference of the circle: "+circle.getPerimeter());
            System.out.println("Getter of circumference data: "+circle.getCircumference());
            System.out.println("Getter of diameter data: "+circle.getDiameter());
            System.out.println("Getter of radius data: "+circle.getRadius());
            System.out.println("Object is a circle: "+circle.isCircle());
            System.out.println("-----------------------------------------------------------------------");
        }
    }
    public static void rectangleTest()
    {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(20,14,20,50));
        rectangles.add(new Rectangle(30,30,25,25));
        rectangles.add(new Rectangle(30,30,25,24));
        rectangles.add(new Rectangle(20,10));
        rectangles.add(new Rectangle(21,15));

        for (Rectangle rectangle : rectangles)
        {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println(rectangle);
            System.out.println("Area of the rectangle: "+rectangle.getArea());
            System.out.println("Perimeter of the rectangle: "+rectangle.getPerimeter());
            System.out.println("Diagonal of the rectangle: "+rectangle.getDiagonal());
            System.out.println("Getter of lengthA data: "+rectangle.getLengthA());
            System.out.println("Getter of lengthB data: "+rectangle.getLengthB());
            System.out.println("Getter of widthA data: "+rectangle.getWidthA());
            System.out.println("Getter of widthB data: "+rectangle.getWidthB());
            System.out.println("Object is a rectangle: "+rectangle.isRectangle());
            System.out.println("-----------------------------------------------------------------------");
        }
    }
    public static void squareTest()
    {
        ArrayList<Square> squares = new ArrayList<>();
        squares.add(new Square(20,14));
        squares.add(new Square(20,10));
        squares.add(new Square(21,15));
        squares.add(new Square(21,21));

        for (Square square : squares)
        {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println(square);
            System.out.println("Area of the square: "+square.getArea());
            System.out.println("Perimeter of the square: "+square.getPerimeter());
            System.out.println("Diagonal of the square: "+square.getDiagonal());
            System.out.println("Getter of lengthA data: "+square.getLengthA());
            System.out.println("Getter of lengthB data: "+square.getLengthB());
            System.out.println("Getter of widthA data: "+square.getWidthA());
            System.out.println("Getter of widthB data: "+square.getWidthB());
            System.out.println("Object is a square: "+square.isSquare());
            System.out.println("-----------------------------------------------------------------------");
        }
    }
}