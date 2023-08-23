import CodingBatPracticeClasses.Array1;



public class CodePracticeApp {
	public static void main(String[] args) { 
		// MenuScreen[] screens = new
		// MenuScreen[] { new QuickScreen(new Keyword("Start Screen"), new
		// Keyword("One"), new Keyword("Two"), new Keyword("Three")), new
		// QuickScreen(new Keyword("One"), new Keyword("Bob"), new Keyword("John"), new
		// Keyword("Paul")), new QuickScreen(new Keyword("Two"), new
		// Keyword("Start Screen")), new QuickScreen(new Keyword("Three")), new
		// QuickScreen(new Keyword("Bob"), new Keyword("Fish"), new Keyword("Bish"), new
		// Keyword("Dish")), new QuickScreen(new Keyword("John"), new Keyword("Yoko"),
		// new Keyword("One")), new QuickScreen(new Keyword("Yoko")), }; MenuScreenApp
		// App = new MenuScreenApp(screens, 0); App.runScreen();

		System.out.println("Results are: ");
		for(int i : Array1.makeMiddle(new int[]{1,2})) {
			System.out.println(i);
		}
	} 
}