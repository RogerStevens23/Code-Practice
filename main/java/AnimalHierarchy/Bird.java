package AnimalHierarchy;

public class Bird
{
    public String reproduction = "egg";
    public String outerCovering = "feathers";

    public void move()
    {
        System.out.println("Moves by flying.");
    }
    public void eat()
    {
        System.out.println("This bird eats seeds.");
    }

    public void fly()
    {
        System.out.println("The bird is flying.");
    }
    public void fly(int height)
    {
        System.out.println("The bird is flying " + height + " feet high.");
    }
    public void fly(String name, int height)
    {
        System.out.println("The " + name + "is flying " + height + " feet high.");
    }

    public void flyUp()
    {
        System.out.println("Flying up...");
    }
    public void flyDown()
    {
        System.out.println("Flying down...");
    }

}
