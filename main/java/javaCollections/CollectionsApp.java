package javaCollections;

import static InputUtils.Input.*;

public class CollectionsApp
{
    ArrayListUtils arrayList = new ArrayListUtils();
    HashMapUtils map = new HashMapUtils();

    public void runCollectionsApp()
    {
        boolean exit =false;
        while(!exit)
        {
            System.out.println("Welcome!");
            System.out.println("Please select an option:\n[1] ArrayList\n[2] HashMap\n[3] Quit");
            int input = getPositiveInt();
            switch(input)
            {
                case 1:
                    arrayListSelection();
                    break;
                case 2:
                    hashMapSubMenu();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    exit = true;
                    continue;
                default:
                    System.out.println("Please select an available option!\nPress ENTER to continue:");
                    getString();
            }
        }
    }

    // ArrayList Selection Menu
    public void arrayListSelection()
    {
        boolean exit = false;
        System.out.println("Please selection a list to use:\n[1] Words\n[2] Integers");
        while(!exit)
        {
            int input = getPositiveInt();
            switch(input)
            {
                case 1:
                    arrayListStringSubMenu();
                    exit = true;
                    break;
                case 2:
                    arrayListIntegerSubMenu();
                    exit = true;
                    break;
                default:
                    System.out.println("Please select an available option!");
                    pauseScreen();
            }
        }
    }

    // Word ArrayList Methods
    public void arrayListStringSubMenu()
    {
        int input;
        boolean exitSubMenu = false;
        while(!exitSubMenu)
        {
            System.out.println("Please select an option:");
            System.out.println("[1] Populate");
            if(arrayList.getWords().size() != 0)
            {
                System.out.println("[2] Display All");
                System.out.println("[3] Display All Plural With Caps On");
                System.out.println("[4] Display All Words In Reverse Order");
            }
            if(arrayList.getWords().size() != 0)
            {
                input = getPositiveInt();
                switch(input)
                {
                    case 1:
                        addWordsToListInRange();
                        exitSubMenu = true;
                        break;
                    case 2:
                        System.out.println("\nThe current words are:");
                        System.out.println(arrayList.getWords());
                        exitSubMenu = pauseScreen();
                        break;

                    case 3:
                        System.out.println("All plural words with caps on a1re:");
                        System.out.println(arrayList.getAllPluralsWithCaps());
                        exitSubMenu = pauseScreen();
                        break;
                    case 4:
                        System.out.println("All words in reverse order are:");
                        System.out.println(arrayList.reverseOrderOfWordsString());
                        exitSubMenu = pauseScreen();
                        break;
                }
            }
            else
            {
                input = getPositiveInt();
                addWordsToListInRange();
                exitSubMenu = pauseScreen();
                break;
            }
        }
    }
    public void addWordsToListInRange()
    {
        boolean populated = false;
        arrayList.getWords().removeAll(arrayList.getWords());
        while(!populated)
        {
            if(arrayList.getWords().size() == 0)
            {
                System.out.println("PLease enter a minimum of 10 words:");
                for(int i = 0; i < 10; i++)
                {
                    boolean isNotEmpty = false;
                    System.out.println("Word count: " + i);
                    while(!isNotEmpty)
                    {
                        String word = getString();
                        if(!word.equals(""))
                        {
                            arrayList.addToWords(word);
                            isNotEmpty = true;
                        }
                        else
                            System.out.println("The string is empty!");
                    }
                }
            }
            System.out.println("Please enter more words, up to 25, or enter blank string to exit:");
            String input = getString();
            if(!input.equals("") && arrayList.getWords().size() < 25)
            {
                System.out.println("Word count: " + arrayList.getWords().size());
                arrayList.addToWords(input);
            }
            else
                populated = true;
        }
    }

    // Integer ArrayList Methods
    public void arrayListIntegerSubMenu()
    {
        int input;
        boolean exitSubMenu = false;
        while(!exitSubMenu)
        {
            System.out.println("Please select an option:");
            System.out.println("[1] Populate");
            if(arrayList.getIntegers().size() != 0)
            {
                System.out.println("[2] Display All");
                System.out.println("[3] Display Average");
                System.out.println("[4] Display Highest and Lowest Numbers");
                System.out.println("[5] Remove All Even Numbers");
            }
            if(arrayList.getIntegers().size() != 0)
            {
                input = getPositiveInt();
                switch(input)
                {
                    case 1:
                        arrayList.getIntegers().removeAll(arrayList.getIntegers());
                        arrayList.populateWith100RandomNumbers();
                        System.out.println("ArrayList has been populated with 100 random numbers.");
                        exitSubMenu = pauseScreen();
                        break;
                    case 2:
                        System.out.println("All current numbers are:\n" + arrayList.getIntegers());
                        exitSubMenu = pauseScreen();
                        break;
                    case 3:
                        System.out.println("The average of all the numbers is: " + arrayList.getIntegerAverage());
                        exitSubMenu = pauseScreen();
                        break;
                    case 4:
                        System.out.println("The highest of all the numbers is: " + arrayList.getHighestNumberOrLowestNumber(true));
                        System.out.println("The lowest of all the numbers is: " + arrayList.getHighestNumberOrLowestNumber(false));
                        exitSubMenu = pauseScreen();
                        break;
                    case 5:
                        arrayList.removeEvenNumbersFromArrayList();
                        System.out.println("All even numbers removed:");
                        exitSubMenu = pauseScreen();
                        break;
                }
            }
            else
            {
                input = getPositiveInt();
                arrayList.populateWith100RandomNumbers();
                System.out.println("ArrayList has been populated with 100 random numbers.");
                exitSubMenu = pauseScreen();
                break;
            }
        }
    }

    // HashMap Methods
    public void hashMapSubMenu()
    {
        int input;
        boolean exitSubMenu = false;
        while (!exitSubMenu)
        {
            System.out.println("Please select an option:");
            System.out.println("[1] Populate");
            if(map.getMap().size() != 0)
            {
                System.out.println("[2] Display All");
                System.out.println("[3] Retrieve value with key");
                System.out.println("[4] Check whether a key-value pair exists");
            }
            if(map.getMap().size() != 0)
            {
                input = getPositiveInt();
                switch(input)
                {
                    case 1:
                        addWordsToMapInRange();
                        exitSubMenu = true;
                        break;
                    case 2:
                        System.out.println("\nThe current key-value pairs are:");
                        System.out.println(map.getMap());
                        exitSubMenu = pauseScreen();
                        break;

                    case 3:
                        System.out.println("Please enter a key:");
                        System.out.println(map.getValueWithKey(getPositiveInt()));
                        exitSubMenu = pauseScreen();
                        break;
                    case 4:
                        System.out.println("Please enter a key:");
                        int key = getPositiveInt();
                        System.out.println("Please enter a value:");
                        String value = getString();
                        if(map.checkIfKeyValuePairExists(key, value))
                        {
                            System.out.println("The key-value pair does exist!");
                        }
                        else
                            System.out.println("The key-value pair does not exist!");
                        exitSubMenu = pauseScreen();
                        break;
                }
            }
            else
            {
                input = getPositiveInt();
                addWordsToMapInRange();
                exitSubMenu = pauseScreen();
                break;
            }
        }
    }
    public void addWordsToMapInRange()
    {
        boolean populated = false;
        map = new HashMapUtils();
        while(!populated)
        {
            if(map.getMap().size() == 0)
            {
                System.out.println("PLease enter a minimum of 10 words:");
                for(int i = 0; i < 10; i++)
                {
                    boolean isNotEmpty = false;
                    System.out.println("Word count: " + i);
                    while(!isNotEmpty)
                    {
                        String word = getString();
                        if(!word.equals(""))
                        {
                            map.addWord(word);
                            isNotEmpty = true;
                        }
                        else
                            System.out.println("The string is empty!");
                    }
                }
            }
            System.out.println("Please enter more words, up to 15, or enter blank string to exit:");
            String input = getString();
            if(!input.equals("") && map.getMap().size() < 15)
            {
                System.out.println("Word count: " + map.getMap().size());
                map.addWord(input);
            }
            else
                populated = true;
        }
    }

    // Pause Screen
    public static boolean pauseScreen()
    {
        System.out.println("Press enter to continue:");
        getString();
        return true;
    }
}