package MenuScreen.Screens;

import MenuScreen.MenuScreen;
import MenuScreen.Keyword;

public class QuitScreen extends MenuScreen {
    public QuitScreen() {
        super(new Keyword("Quit"), new Keyword("Yes"), new Keyword("No"));
    }
    public boolean isQuit(String user) {
        return user.equalsIgnoreCase("Yes");
    }
}
