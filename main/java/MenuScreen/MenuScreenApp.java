package MenuScreen;

import java.util.Scanner;

public class MenuScreenApp
{
    // Private Fields
    private MenuScreen[] menuScreens;
    private MenuScreen currentMenuScreen = null;

    // Constructors
    public MenuScreenApp(MenuScreen[] menuScreens, int startScreen) {
        this.menuScreens = menuScreens;
        currentMenuScreen = menuScreens[startScreen];
    }
    // Methods
    public void runScreen() {
        boolean quit = false;
        String userInput = "";
        while(!quit) {
            currentMenuScreen.displayScreen();
            userInput = getUserString();
            if(!userInput.equalsIgnoreCase("Quit"))
                currentMenuScreen = checkInputReturnScreen(userInput);
            else
                quit = true;
        }
    }
    public MenuScreen checkInputReturnScreen(String userInput) {
        boolean correct = false;
        MenuScreen result = null;
        while(!correct) {
            if(!userInput.equalsIgnoreCase("quit")) {
                if(currentMenuScreen.isCorrectKeyword(userInput)) {
                    result = returnMenuScreenFromKeyword(currentMenuScreen.returnCorrectKeyword(userInput));
                    correct = true;
                }
            }
            else {
                correct = true;
            }
        }
        return result;
    }
    public MenuScreen returnMenuScreenFromKeyword(Keyword keyword) {
        MenuScreen result = null;
        for(MenuScreen screen : menuScreens) {
            if(screen.getScreenWord().getWord().equalsIgnoreCase(keyword.getWord()))
                result = screen;
        }
        return result;
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
}