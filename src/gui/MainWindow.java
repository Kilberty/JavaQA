package gui;
import gui.MainMenu;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class MainWindow extends Application  {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Tester");
        MainMenu m = new MainMenu();
        
        
        BorderPane root = new BorderPane();
        root.setTop(m.setMenuBar());
        Scene scene = new Scene(root, 1000, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
	

public static void main (String[] args) {
   launch(args);	
}




}
