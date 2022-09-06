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

    // Getters
    public Keyword getScreenWord() {return screenWord;}
    public Keyword[] getKeywords() {return keywords;}

    // Constructors
    public MenuScreen(Keyword screenWord,Keyword...keywords) {
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

    // Keyword Check and Return
    public boolean isCorrectKeyword(String wordEntered) {
        boolean isCorrectKeyword = false;
        for(Keyword word : keywords) {
            if (wordEntered.equalsIgnoreCase(word.getWord())) {
                isCorrectKeyword = true;
                break;
            }
        }
        return isCorrectKeyword;
    }
    public Keyword returnCorrectKeyword(String wordEntered) {
        Keyword result = null;
        for(Keyword word : keywords) {
            if (wordEntered.equalsIgnoreCase(word.getWord())) {
                result = word;
                break;
            }
        }
        return result;
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