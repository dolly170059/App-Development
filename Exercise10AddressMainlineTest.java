package addresses;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Screen;
import javafx.stage.Stage;

/*******
 * <p> Title: Exercise10AddressesTestMainline Class </p>
 * 
 * <p> Description: A JavaFX demonstration application: This controller class sets up the key
 * attributes and classes for the Exercise10 demonstration application </p>
 * 
 * <p> Copyright: Lynn Robert Carter Â© 2018-08-26 </p>
 * 
 * @author Dolly
 * 
 * @version 2.03	2018-07-19 Baseline
 * @version 3.00	2018-08-30 An enhancement for Exercise 11
 * 
 */
public class Exercise10AddressesTestMainline extends Application {
	
	public UserInterface theGUI;
	
	public static double WINDOW_HEIGHT;
	public static double WINDOW_WIDTH;
	
	/**********
	 * This method is the root of the application and from it, the foundations of the application
	 * establish, the GUI is linked to the methods of various classes and the setup is performed.
	 * 
	 * This method queries the environment to determine the size of the window that is at the heart
	 * of the Graphical User Interface (GUI). The method is called with a single parameter that 
	 * specified the Stage object that JavaFX applications use.
	 * 
	 * The method starts by creating a Pane object, calls the GUI to instantiate the GUI widgets 
	 * using that Pane, creates a Scene using that Pane as a window of a size that will fit the
	 * specifics of the system running the application. Once the Scene is set, it is shown to the
	 * user, and at that moment the application changes from a programmed sequence of actions set
	 * by the programmer into a set of actions determined by the user by means of the various GUI
	 * elements the user selects and uses. 
	 * 
	 * @param theStage is a Stage object that is passed in to the methods and is used to set up the
	 * the controlling object for the application's user interface
	 */
	public void start(Stage theStage) throws Exception {
		
		// Demonstrate that the United States Address holds the data and prints it properly
		UnitedStatesAddress lrcarterAddress = new UnitedStatesAddress (
				"Lynn Robert Carter",
				"3857 East Equestrian Trail",
				"Phoenix",
				"Arizona",
				"85044-3008",
				"USA");
		
		// Demonstrate that the Qatar Address holds the data and prints it properly
		QatarBusinessAddress cmuQatarAddress = new QatarBusinessAddress (
				"Office of Undergraduate Admissions",
				"Carnegie Mellon University",
				"c/o Qatar Foundation",
				"P.O. Box 24866",
				"Doha",
				"Qatar");
		// Demonstrate that the India Address holds the data and prints it properly
		IndiaAddress IndiaAddress = new IndiaAddress (
				"Maharishi Markandeshwar (Deemed to be University)",

				"Ambala - Yamunanagar Highway",

				"Mullana - Ambala", 
				"133-207",
				"(Haryana)",

				"India");
		
        // Demonstrate that the parents Address holds the data and prints it properly
		ParentsAddress ParentsAddress = new ParentsAddress (
				"# 248 Nanak Nagar, Farakpur",

				"Jagadhari Workshop",

				"Yamuna Nagar", 
				"135-001",
				"(Haryana)",

				"India");
		
		// The following displays the information stored above in a format appropriate for mailing
		// address on the console
		System.out.println(lrcarterAddress);
		System.out.println("---------------------------------------");
		System.out.println(cmuQatarAddress);
		System.out.println("---------------------------------------");
		System.out.println(IndiaAddress);
		System.out.println("---------------------------------------");
		System.out.println(ParentsAddress);
		System.out.println("---------------------------------------");
		
		// Determine the actual visual bounds for this display
		Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();

		// Set the Stage boundaries to the visual bounds so the window does not totally fill the screen 
		WINDOW_WIDTH = primaryScreenBounds.getWidth() - primaryScreenBounds.getMinX() - 100;
		if (WINDOW_WIDTH > 1000) WINDOW_WIDTH = 1000;
		WINDOW_HEIGHT = primaryScreenBounds.getHeight() - primaryScreenBounds.getMinY() - 100;
		if (WINDOW_HEIGHT > 600) WINDOW_HEIGHT = 600;
			
		theStage.setTitle("Exercise 10");						// Label the stage's window
		
		Pane theRoot = new Pane();								// Create a pane within the window
		
		theGUI = new UserInterface(theRoot);					// Create the Graphical User Interface
																// and populate that Pane with widgets
		theGUI.AppendAdress(lrcarterAddress, cmuQatarAddress, IndiaAddress, ParentsAddress);
		
		Scene theScene = new Scene(theRoot, WINDOW_WIDTH, WINDOW_HEIGHT);	// Create the scene using
																// the GUI window and the size that 
																// was computed earlier
		
		theStage.setScene(theScene);							// Set the scene on the stage and
		
		theStage.show();										// show the stage to the user
		
		// When the stage is shown to the user, the pane within the window is now visible.  This means 
		// that any Graphical User Interface (GUI) that were established are now visible and it is now
		// possible for the user to select input fields and enter values into them, click on buttons, 
		// and read the labels, the results, and the error messages.
	}
	


	/*******************************************************************************************************/

	/*******************************************************************************************************
	 * This is the method that launches the JavaFX application
	 * 
	 * @param args are the program parameters and they are not used by this program.
	 * 
	 */
	public static void main(String[] args) {					// This method may not be required
		launch(args);											// for all JavaFX applications using
	}															// other IDEs.
}
