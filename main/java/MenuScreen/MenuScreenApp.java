package MenuScreen;

import MenuScreen.Screens.QuitScreen;

import java.util.Scanner;

public class MenuScreenApp
{
    // Private Fields
    private final MenuScreen[] menuScreens;
    private MenuScreen currentMenuScreen;
    private MenuScreen previousMenuScreen;

    // Constructors
    public MenuScreenApp(MenuScreen[] menuScreens, int startScreen) {
        this.menuScreens = menuScreens;
        currentMenuScreen = menuScreens[startScreen];
        previousMenuScreen = menuScreens[startScreen];
    }
    // Methods
    public void runScreen() {
        boolean quit = false;
        String userInput = "";
        while(!quit) {
            // Display Current Screen
            currentMenuScreen.displayScreen();
            // Get user input
            // Check if user input is valid
            Keyword temp = loopUserInputUntilCorrectKeyword(currentMenuScreen);
            // if not previous screen,
            if(!temp.getWord().equalsIgnoreCase("Back")) {
                // set previous screen to current screen
                // set current screen to new screen
                previousMenuScreen = currentMenuScreen;
                currentMenuScreen = returnMenuScreenFromKeyword(temp);
            }
            // else set current screen to previous screen
            else
                currentMenuScreen = previousMenuScreen;

            if(currentMenuScreen instanceof QuitScreen) {
                currentMenuScreen.displayScreen();
                userInput = getUserString();
                if(((QuitScreen) currentMenuScreen).isQuit(userInput))
                    quit = true;
                else
                    currentMenuScreen = previousMenuScreen;
            }
        }
    }

    public MenuScreen returnMenuScreenFromKeyword(Keyword keyword) {
        MenuScreen result = null;
        if(!keyword.getWord().equalsIgnoreCase("Quit")) {
            for(MenuScreen screen : menuScreens) {
                if(screen.getScreenWord().getWord().equalsIgnoreCase(keyword.getWord())) {
                    result = screen;
                    break;
                }
            }
        }
        else
            result = new QuitScreen();
        return result;
    }

    // User input Methods
    public Keyword loopUserInputUntilCorrectKeyword(MenuScreen currentMenuScreen) {
        boolean isCorrect = false;
        Keyword result = null;
        String userInput = "";
        while(!isCorrect) {
            userInput = getUserString();
            if(currentMenuScreen.isCorrectKeyword(userInput)) {
                result = currentMenuScreen.returnCorrectKeyword(userInput);
                isCorrect = true;
            }
            else
                System.out.println("Please enter a correct option!");
        }
        return result;
    }
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
}