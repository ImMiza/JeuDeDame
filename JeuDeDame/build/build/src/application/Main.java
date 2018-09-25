package application;

import javafx.application.Application;
import javafx.stage.Stage;
import me.allan.ressources.DameMap;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	
	
	private static Stage window;
	private static BorderPane root;
	private static Scene scene;
	private static DameMap map;
	
	
	public void initialize() {
		map = new DameMap(window);
		root.getChildren().add(map);
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			window = primaryStage;
			root = new BorderPane();
			scene = new Scene(root, 1000, 700);
			
			window.setTitle("Jeu De Dame By MizakiGaming MF");
			window.setScene(scene);
			window.show();
			
			initialize();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
