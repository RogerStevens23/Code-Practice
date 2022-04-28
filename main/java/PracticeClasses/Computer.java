package PracticeClasses;

public class Computer
{
    // Fields
    String make, model;
    double price;
    int memory;

    // Getters
    public String getMake()
    {
        return make;
    }
    public String getModel()
    {
        return model;
    }
    public double getPrice()
    {
        return price;
    }
    public int getMemory()
    {
        return memory;
    }

    // Constructor
    public Computer(String make, String model, double price, int memory)
    {
        this.make = make;
        this.model = model;
        this.price = price;
        this.memory = memory;
    }

    // Method of behavior
    public void download()
    {
        memory -= 10;
        System.out.println(this.make + " " + this.model + " is downloading...");
    }

    // Override of the base toString method. Prints object information.
    @Override
    public String toString()
    {
        return "Make: " + this.make + " Model: " + this.model + " Price: " + this.price;
    }
}
