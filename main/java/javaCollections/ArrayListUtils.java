package javaCollections;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class ArrayListUtils
{
    // Fields
    private final ArrayList<String> words = new ArrayList<>();
    private final ArrayList<Integer> integers = new ArrayList<>();

    // Words Methods
    public ArrayList<String> getWords(){return words;}
    public void addToWords(String word)
    {
        words.add(word);
    }
    public String getAllWordsAsString()
    {
        StringBuilder result = new StringBuilder();
        for (String word : words)
        {
            result.append(" ").append(word);
        }
        return result.toString().trim();
    }
    public String getAllPluralsWithCaps()
    {
        StringBuilder result = new StringBuilder();
        for (String word : words)
        {
            if(isPluralWord(word))
            {
                result.append(" ").append(word.toUpperCase(Locale.ROOT));
            }
        }
        return result.toString().trim();
    }
    public String reverseOrderOfWordsString()
    {
        StringBuilder result = new StringBuilder();
        for(int i = words.size() - 1; i >= 0; i--)
        {
            result.append(" ").append(words.get(i));
        }
        return result.toString().trim();
    }
    public static boolean isPluralWord(String word)
    {
        boolean result = false;
        char lastInWord = word.charAt(word.length() - 1);
        if(lastInWord == 'S' || lastInWord == 's')
        {
            result = true;
        }
        return result;
    }

    // Integers Methods
    public ArrayList<Integer> getIntegers(){return integers;}
    public void populateWith100RandomNumbers()
    {
        Random random = new Random();
        for(int i = 0; i < 100; i++)
        {
            integers.add(random.nextInt(1000));
        }
    }
    public int getIntegerAverage()
    {
        int result = 0;
        for (int num : integers)
        {
            result += num;
        }
        return result / integers.size();
    }
    public int getHighestNumberOrLowestNumber(boolean high)
    {
        int previous = 0, minPrevious = integers.get(0);
        for(int i = 0; i <= integers.size() - 1; i++)
        {
            if(high)
                previous = Math.max(previous, integers.get(i));
            else
            {
                minPrevious = Math.min(minPrevious, integers.get(i));
                previous = minPrevious;
            }
        }
        return previous;
    }
    public void removeEvenNumbersFromArrayList()
    {
        ArrayList<Integer> indexOfEvens = new ArrayList<>();

        for (Integer integer : integers)
        {
            if (isEven(integer))
                indexOfEvens.add(integer);
        }
        integers.removeAll(indexOfEvens);
    }
    public static boolean isEven(int num)
    {
        boolean result = false;
        int remainder = num % 2;
        if(remainder == 0)
            result = true;
        return result;
    }
    public int amountOfEvenNumbers()
    {
        int result = 0;
        for (int number : integers)
        {
            if(isEven(number))
                result++;
        }
        return result;
    }
}