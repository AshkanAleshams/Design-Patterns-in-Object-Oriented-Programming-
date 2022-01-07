package mvcExample;

import javafx.application.Application;



import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CalculatorView extends Application {
	
	private TextField num1;
	private TextField num2;
	private Label additionLabel;
	private Label resultLabel;
	private Button calcSum;

	
	public CalculatorView() {
		this.num1 = new TextField();
		this.num2 = new TextField();
		this.resultLabel = new Label("");
		this.additionLabel = new Label("+");
		this.calcSum = new Button("Sum");
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		//all our buttons and labels, etc
		
		
		
		//event handler stuff
		
		
		
		
		
		// LAYOUT (This is the View in MVC)
		HBox root = new HBox();
		// VBox root = new VBox();
		root.setPadding(new Insets(5));
		root.getChildren().addAll(num1,num2, additionLabel, resultLabel, calcSum);
		
		// SCENE
		Scene scene = new Scene(root); 
		// Scene scene = new Scene(root, 200, 200); 

		// STAGE
		stage.setTitle("Calculator");
		stage.setScene(scene);
		stage.show();
		
		
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}

}

