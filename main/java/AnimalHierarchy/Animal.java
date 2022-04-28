package AnimalHierarchy;

public class Animal
{
    private String name;
    private double averageWeight;
    private int numberOfLegs;

    // Getters
    public String getName()
    {
        return name;
    }
    public double getAverageWeight()
    {
        return averageWeight;
    }
    public int getNumberOfLegs()
    {
        return numberOfLegs;
    }

    // Constructors
    public Animal() {}
    public Animal(String name, double averageWeight, int numberOfLegs)
    {
        this.name = name; this.averageWeight = averageWeight; this.numberOfLegs = numberOfLegs;
    }

    // Methods
    public void eat()
    {
        System.out.println("This animal eats insects.");
    }
}
