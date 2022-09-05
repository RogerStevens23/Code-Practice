package MenuScreen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public abstract class MenuScreen {

    // Private Fields
    private final Keyword screenWord;
    private final Keyword[] keywords;
    private final String displayBars;

    // Constructors
    public MenuScreen(Keyword screenWord,Keyword... keywords) {
        this.screenWord = screenWord;
        this.keywords = keywords;
        this.displayBars = dynamicDisplayBars();
    }

    // Methods
    public void displayScreen() {
        System.out.println(displayBars);
        System.out.println(screenWord.getWord());
        System.out.println(displayBars);
        for (Keyword word : keywords)
            System.out.println(word.getWord());
        System.out.println(displayBars);
    }

    //
    public boolean isCorrectKeyword() {
        boolean isCorrectKeyword = false;
        String input = getUserString();
        for(Keyword word : keywords) {
            if (input.equalsIgnoreCase(word.getWord())) {
                isCorrectKeyword = true;
                break;
            }
        }
        return isCorrectKeyword;
    }

    // Display Logic
    private String dynamicDisplayBars() {
        int screenWordSize =  screenWord.getWord().length(), keywordSize = largestKeywordSize(keywords);
        if(screenWordSize > keywordSize)
            return "-".repeat(screenWordSize);
        else return "-".repeat(keywordSize);
    }
    private int largestKeywordSize(Keyword[] keywords) {
        int prevSize = 0;
        for(Keyword word : keywords) {
            if(word.getWord().length() > prevSize)
                prevSize = word.getWord().length();
        }
        return prevSize;
    }


    // User input Methods
    public String getUserString() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    public int getUserInt() {
        int result = -1;
        Scanner input = new Scanner(System.in);
        try {
            result = input.nextInt();
        }
        catch (java.util.InputMismatchException exception) {
            System.out.println("Incorrect Format!");
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(displayBars).append("\n").append(screenWord.getWord()).append("\n").append(displayBars).append("\n");
        for (Keyword word : keywords)
            result.append(word.getWord()).append("\n");
        result.append(displayBars);
        return result.toString();
    }
}