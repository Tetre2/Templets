import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	public static double WORLD_WIDTH = 1200;
	public static double WORLD_HEIGHT = 800;

	private static Stage pStage;

	private Group root = new Group();
	private Scene scene = new Scene(root, WORLD_WIDTH, WORLD_HEIGHT);

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("TEMPLATE");  //TODO
		setPrimaryStage(primaryStage);



		primaryStage.setScene(scene);	
		primaryStage.show();	


	}

	public static void main(String[] args) {
		launch(args);
	}
	
	public static Stage getPrimaryStage() {
		return pStage;
	}

	private void setPrimaryStage(Stage pStage) {
		Main.pStage = pStage;
	}

}
