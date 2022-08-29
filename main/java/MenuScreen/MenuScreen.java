package MenuScreen;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class MenuScreen
{
    private Keyword screenWord;
    private ArrayList<Keyword> keywords;
    public MenuScreen(Keyword screenWord, ArrayList<Keyword> keywords)
    {
        this.screenWord = screenWord;
        this.keywords = keywords;
    }
    public String runMenuScreen()
    {
        String resultKeyword = "";
        boolean isCorrectKeyword = false;
        while(!isCorrectKeyword)
        {
            String input = getUserString();
            for(Keyword word : keywords)
            {
                if(input.equalsIgnoreCase(word.getWord()))
                {
                    isCorrectKeyword = true;
                    resultKeyword = word.getWord();
                }
            }
        }
        return resultKeyword;
    }
    public String getUserString()
    {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}