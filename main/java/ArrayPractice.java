public class ArrayPractice {
    public static void creatingArray() {
        // Remember, arrays are a fixed size.
        int[] cupValues = new int[5];
        cupValues[0] = 42;
        cupValues[1] = 86;
        cupValues[2] = 23;
        cupValues[3] = 8;
        cupValues[4] = 91;

        System.out.println(cupValues[0]); // Prints "42", the first element in the array.

        int numberOfCups = cupValues.length; // Getting the amount of elements in the array, using the ".length" property. Notice it's a property, not a method like "String.Length()".
        System.out.println(numberOfCups); // prints "5".

        // Creating a new array and replacing the old one, setting it to the existing variable "cupValues".
        cupValues = new int[2];

        System.out.println(cupValues.length); // prints "2"

        System.out.println(numberOfCups); // The value of "numberOfCups" is unchanged, since it is not a reference type, and the variable was not set to the new instance length.

        String[] giantWords = {"fee", "fie", "foe", "fum"};

        for (int i = 0; i < giantWords.length; i++) {
            System.out.println(giantWords[i]);
        }
    }

    public static void namesOfThreePeopleIKnow() {
        System.out.println("Please enter three names of people you know...");
        String[] names = new String[3];
        for (int i = 0; i < names.length; i++) {
            names[i] = CodePracticeApp.getString();
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    public static void gpaRangeOfStudents() {
        System.out.println("Please enter five student GPAs...");
        double[] studentGPAs = new double[5];
        for (int i = 0; i < studentGPAs.length; i++) {
            studentGPAs[i] = CodePracticeApp.getDouble();
        }
        for (int i = 0; i < studentGPAs.length; i++) {
            System.out.println(studentGPAs[i]);
        }

    }

    public static void vacationSpots() {
        String[] vacationSpots = new String[4];
        vacationSpots[0] = "NYC";
        vacationSpots[1] = "Jersey";
        vacationSpots[2] = "Austin";
        vacationSpots[3] = "NC";

        System.out.println(vacationSpots[0]);
        System.out.println(vacationSpots[3]);

        String lastName = "Stevens";
        System.out.println("The number of letters in, '" + lastName + "', is: " + lastName.length());
    }

    public static void splittingStrings() {
        String source = "this, that, the other";
        String[] elements = source.split(", ");
        for (int i = 0; i < elements.length; i++)
            System.out.println(elements[i]);
    }

    public static void charArray() {
        String myName = "Roger";
        char[] letters = myName.toCharArray();

        System.out.println("The first letter of my name is: " + letters[0]);

        System.out.println(myName.indexOf("r"));
        System.out.println("MyJavaPractice".indexOf('J'));
    }

    public static void firstLetterOfPeers() {
        System.out.println("Please enter four names:");
        String[] peers = new String[4];
        for (int i = 0; i < peers.length; i++)
            peers[i] = CodePracticeApp.getString();
        for (int i = 0; i < peers.length; i++)
            System.out.println(peers[i].charAt(0));
    }

    public static void ifWordContainsLetter() {
        System.out.println("Please enter a word:");
        String word = CodePracticeApp.getString();
        System.out.println("Please enter a letter:");
        char letter = CodePracticeApp.getString().charAt(0);
        if (word.contains("" + letter))
            System.out.println("Yep, its got one of those.");
        else
            System.out.println("Sorry!");
    }

    public static void stringSplitPrint() {
        System.out.println("Please enter a list of items, separated by a '-', no spaces:");
        String listOfItems = CodePracticeApp.getString();

        String[] itemArray = listOfItems.split("-");
        for (int i = 0; i < itemArray.length; i++) {
            System.out.println(itemArray[i]);
        }

        System.out.println("Please enter a list of items, separated by a '-' or a '.', no spaces:");
        listOfItems = CodePracticeApp.getString();
        // Using multiple delimiters for ".Split" method.
        itemArray = listOfItems.split("-|\\.");
        for (int i = 0; i < itemArray.length; i++) {
            System.out.println(itemArray[i]);
        }
    }
}