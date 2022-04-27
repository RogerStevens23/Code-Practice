import AnimalHierarchy.Animal_A;
import AnimalHierarchy.Bird;
import javaCollections.CollectionsApp;
import java.util.*;

public class CodePracticeApp
{
    public static void main(String[] args)
    {
        System.out.println("\n");
        Animal_A myBird = new Bird();
        myBird.label();
        myBird.move();
        myBird.eat();
    }

    public static void ATM_Sum() {
        ATM atm = new ATM();
        Sum sum = new Sum();

        while (!atm.exit) {
            System.out.println("Attempts: " + atm.attempts);
            System.out.println("Please enter PIN...");
            atm.enteredPin = atm.getInputNum();
            System.out.println(atm.checkPin());
            if (atm.isOverAttempts()) {
                System.out.println("Sorry, too many attempts!\nGoodbye...");
                atm.exit = true;
            }
        }

        while (!sum.correctFormat) {
            System.out.println("Please enter lower number to be calculated:");
            sum.lowerNum = sum.getUserInt();
            System.out.println("Please enter higher number to be calculated:");
            sum.higherNum = sum.getUserInt();
            System.out.println(sum.checkFormat());
        }
        sum.calculateSum();
        System.out.println("The sum of the numbers is: " + sum.sum);
    }
    public static int getPositiveInt() {
        boolean isPos = false;
        Scanner input = new Scanner(System.in);
        int result = 0;
        while (!isPos) {
            result = input.nextInt();
            if (result >= 0)
                isPos = true;
        }
        return result;
    }
    public static double getDouble() {
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }
    public static String getString() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    public static boolean isPrimeNumber(int posNum) {
        boolean flag = true;
        for (int i = 2; i < posNum; i++) {
            if (posNum % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag && posNum > 1)
            return true;
        else
            return false;
    }
    public static int highestCommonFactor(int firstInt, int secondInt) {
        int dividend = 0, divisor = 0, remainder = 1;

        if (firstInt > secondInt) {
            dividend = firstInt;
            divisor = secondInt;
        } else {
            dividend = secondInt;
            divisor = firstInt;
        }

        while (remainder != 0) {
            remainder = dividend % divisor;
            if (remainder == 0) {
                break;
            }
            dividend = divisor;
            divisor = remainder;
        }
        return divisor;
    }
    public static void addingLoop() {
        String response;
        do {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("Please enter two numbers: ");
            int firstNum = getPositiveInt(), secondNum = getPositiveInt();
            int sum = firstNum + secondNum;
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("The sum of the numbers is:" + sum);
            System.out.println("Do you wish to perform the operation again?");
            System.out.println("'N' for no.");
            response = getString();
            if (Objects.equals(response, "N"))
                break;
        }
        while (response != "N");
    }
    public static void stringPractice() {
        String cityName = "Cleveland";
        System.out.println("Length: " + cityName.length());
        System.out.println("Substring: " + cityName.substring(0, 2));
        System.out.println("Single Character at Beginning: " + cityName.charAt(0));
        System.out.println("Single Character at End: " + cityName.charAt(cityName.length() - 1));

        Scanner input = new Scanner(System.in);
        /*String password = "1234";

        System.out.println("Enter the password");
        String passwordEntered = input.nextLine();

        while(!passwordEntered.equals(password))
        {
            System.out.println("Try again...");
            passwordEntered = input.nextLine();
        }

        System.out.println("Welcome!");*/

        System.out.println("Enter you email");
        String email = input.nextLine();

        System.out.println(email.toLowerCase());

    }
    public static void computerClassPractice()
    {
        Computer wcciPC = new Computer("Dell", "Lattitude", 500, 100);
        System.out.println("Here is some info about your computer:");
        System.out.println("Make: " + wcciPC.getMake());
        System.out.println("Model: " + wcciPC.getModel());
        System.out.println("Price: " + wcciPC.getPrice());
        System.out.println("Memory: " + wcciPC.getMemory());

        wcciPC.download();
        System.out.println("Memory is now at " + wcciPC.getMemory());

        System.out.println(wcciPC);
    }
    public static void HashSetTest()
    {
        // HashSet is not concerned about order, and groups like items together as one set.
        String[] text = {"i", "came", "i", "saw", "i", "left"}; // three "i"s
        Set<String> s = new HashSet<String>();
        for (String a : text)
        {
            s.add(a);
        }
        System.out.println("HashSet implementation: " +s.size() + " distinct words: " + s); // Only one 'i' in output, as it's a set.
    }
    public static void LinkedHashSetTest()
    {
        // LinkedHashSet is the same as HashSet, and groups like items together as one set. The difference is the items are ordered by occurrence.
        String[] text = {"i", "came", "i", "saw", "i", "left"}; // three "i"s
        Set<String> s = new LinkedHashSet<String>();
        for (String a : text)
        {
            s.add(a);
        }
        System.out.println("HashSet implementation: " +s.size() + " distinct words: " + s); // Only one 'i' in output, as it's a set.
    }
    public static void ArrayListTest()
    {
        List<String> groceries = new ArrayList<>();
        groceries.add("Fruit");
        groceries.add("Milk");
        groceries.add("Cereal");

        System.out.println(groceries);
    }
    public static void QueueLinkedListTest()
    {
        int time = 30;
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i = time; i > 0; i--)
        {
            queue.add(i);
        }
    }
}