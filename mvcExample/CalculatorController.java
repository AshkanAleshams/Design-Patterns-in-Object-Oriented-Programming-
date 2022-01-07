package mvcExample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

public class CalculatorController implements EventHandler<ActionEvent> {

	private Label resultLabel;
	
	
	public CalculatorController(Label resultLabel) {
		this.resultLabel = resultLabel;
	}
	
	
	
	@Override
	public void handle(ActionEvent arg0) {
		
		
		
		
	}

}
