package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


public class Main extends Application {
	private Stage primaryStage;
	private static BorderPane mainLayOut ;
	
	@Override
	public void start(Stage primaryStage) {
		try {
		this.primaryStage=primaryStage;
		this.primaryStage.setTitle("RISK");
		ShowMainView();	
		Scene scene = new Scene(mainLayOut,600,400);
	   this.primaryStage.setScene(scene);
	   this.primaryStage.setResizable(false);
	   this.primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	private void ShowMainView() {
		FXMLLoader loader= new FXMLLoader();
		loader.setLocation(Main.class.getResource("Sample.fxml"));
		try {
			mainLayOut.getChildren().add(loader.load());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void player1Simulation() {
		FXMLLoader loader1 = new FXMLLoader();
		loader1.setLocation(Main.class.getResource("AgentChoice.fxml"));
		try {
			mainLayOut.getChildren().add(loader1.load());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
