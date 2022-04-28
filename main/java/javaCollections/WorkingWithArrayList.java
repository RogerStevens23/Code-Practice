package javaCollections;

import java.util.ArrayList;

public class WorkingWithArrayList
{
    public static void runApp()
    {
        System.out.println("\n");

        ArrayList<String> myAnimals = new ArrayList<String>();
        myAnimals.add("Cow");
        myAnimals.add("Pig");
        myAnimals.add("Duck");
        myAnimals.add("Dog");
        myAnimals.add("Cat");

        for (String animal : myAnimals)
        {
            System.out.println(animal);
        }
        System.out.println("\n");

        ArrayList<Boolean> myBooleans = new ArrayList<Boolean>();
        myBooleans.add(true);
        myBooleans.add(false);
        myBooleans.add(false);
        myBooleans.add(true);
        myBooleans.add(false);
        for (Boolean bool : myBooleans)
        {
            if(bool)
                System.out.println("Better bring an umbrella...");
            else
                System.out.println("No rain today, enjoy the sun!");
        }
        System.out.println("\n");

        ArrayList<Integer> myInts = new ArrayList<Integer>();
        myInts.add(1);
        myInts.add(23);
        myInts.add(9);
        myInts.add(77);
        myInts.add(922);
        myInts.add(6);
        myInts.add(32);
        myInts.add(63);
        myInts.add(14);
        myInts.add(5);
        System.out.println(myInts);
        for(Boolean bool : isContained(myInts, new int[]{23, 77, 15}))
        {
            if(bool)
                System.out.println("The number is an element.");
            else
                System.out.println("The number is not an element.");
        }
        Integer i = 23;
        myInts.remove(i);
        i = 922;
        myInts.remove(i);
        i = 32;
        myInts.remove(i);
        i = 6;
        myInts.remove(i);
        System.out.println(myInts);
        for(Boolean bool : isContained(myInts, new int[]{23, 77, 15}))
        {
            if(bool)
                System.out.println("The number is an element.");
            else
                System.out.println("The number is not an element.");
        }
    }
    public static ArrayList<Boolean> isContained(ArrayList<Integer> listToSearch, int[] numbersToFind)
    {
        ArrayList<Boolean> result = new ArrayList<Boolean>();
        for(int number : numbersToFind)
        {
            if(listToSearch.contains(number))
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }
}
