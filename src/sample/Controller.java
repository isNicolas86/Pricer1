package sample;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;


public class Controller {
    @FXML
    GridPane gridPane = new GridPane();



    public void onButtonClicked(){
//        gridPane.addRow(2+this.count,new TextField());
//        gridPaneHeight = gridPaneHeight + gridPaneGrowth;
//        gridPane.setPrefSize(800,gridPaneHeight);
//        count++;
        gridPane.autosize();
        gridPane.getRowConstraints().add( new RowConstraints(50));
    }
}
