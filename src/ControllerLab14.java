import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class ControllerLab14 {
    @FXML
    private Button click1;
    @FXML
    private Button click2;
    @FXML
    private Label sum;
    @FXML
    private TextField intA;
    @FXML
    private TextField intB;
    @FXML
    private void action1(ActionEvent Calculate){
        int x = Integer.parseInt(intA.getText());
        int y = Integer.parseInt(intB.getText());
        int z = x+y;
        sum.setText(String.valueOf(z));
    }
    @FXML
    private void action2(ActionEvent Clear){
        sum.setText("");
        intA.setText("0");
        intB.setText("0");
    }

}
