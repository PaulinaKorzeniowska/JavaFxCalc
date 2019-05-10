package calc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

import javafx.stage.Stage;

public class Main extends Application{
		    public void start(Stage primaryStage) throws Exception {
		    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Window.fxml"));
		    	BorderPane borderPane = loader.load(); 
		    	Scene root = new Scene(borderPane);
		    	Application.setUserAgentStylesheet(STYLESHEET_CASPIAN);
		    	
	    	primaryStage.setScene(root);
	    	primaryStage.show();
	    	
	    	}
	    public static void main(String[] args) throws Exception {
			launch(args) ;
		
		}

}
