package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class SampleController {
	@FXML
    private Button sim;

	  @FXML
	    private ImageView riskimage;
	    @FXML
	    private Button playingButton;
    @FXML
    void simulationClicked(ActionEvent event) {
            Main.player1Simulation();
    }	
    
}
