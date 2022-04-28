package AnimalHierarchy;

public class Eagle extends Bird
{
    public String name = "Eagle";
    public int lifeSpan = 15;

    public void eat()
    {
        System.out.println("Eats reptiles, small mammals, and fish.");
    }
    public void sound()
    {
        System.out.println("Has a high-pitched whistling sound.");
    }
    public void fly()
    {
        System.out.println("Flies up to 10,000 feet.");
    }
}