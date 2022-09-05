package MenuScreen.Screens;

import MenuScreen.Keyword;
import MenuScreen.MenuScreen;

import java.util.ArrayList;

public class TestScreen extends MenuScreen {

    public TestScreen() {
        super(new Keyword("This Is A Test"), new Keyword("Test Option One"), new Keyword("Test Option Two"), new Keyword("Test Option Three"));
    }
}
