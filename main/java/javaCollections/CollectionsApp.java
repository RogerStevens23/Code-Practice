package javaCollections;

public class CollectionsApp
{
    public static void runMain()
    {
        ArrayListUtils arrayList = new ArrayListUtils();
        HashMapUtils map = new HashMapUtils();

        /*arrayList.addToWords("Bob");
        arrayList.addToWords("John");
        arrayList.addToWords("Joe");
        arrayList.addToWords("Jacob");
        arrayList.addToWords("Jebus");
        arrayList.addToWords("gases");
        arrayList.addToWords("puppies");
        System.out.println(arrayList.getAllWordsAsString());
        System.out.println(arrayList.getAllPluralsWithCaps());
        System.out.println(arrayList.reverseOrderOfWordsString());
        System.out.println("\n");

        arrayList.populateWith100RandomNumbers();
        System.out.println(arrayList.getIntegers());
        System.out.println("The amount of even numbers is: " + arrayList.amountOfEvenNumbers());
        System.out.println("The average of all the numbers is: " + arrayList.getIntegerAverage());
        System.out.println("The highest of all the numbers is: " + arrayList.getHighestNumberOrLowestNumber(true));
        System.out.println("The lowest of all the numbers is: " + arrayList.getHighestNumberOrLowestNumber(false));
        arrayList.removeEvenNumbersFromArrayList();
        System.out.println("\nAll even numbers removed:");
        System.out.println(arrayList.getIntegers());
        System.out.println("The amount of even numbers is: " + arrayList.amountOfEvenNumbers());
        System.out.println("The average of all the numbers is: " + arrayList.getIntegerAverage());
        System.out.println("The highest of all the numbers is: " + arrayList.getHighestNumberOrLowestNumber(true));
        System.out.println("The lowest of all the numbers is: " + arrayList.getHighestNumberOrLowestNumber(false));*/

        map.addWord("now");
        map.addWord("Joe");
        map.addWord("ME");
        map.addWord("Roger");
        System.out.println(map.getMap());
    }
}