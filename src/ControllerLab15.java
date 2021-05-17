import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class ControllerLab15 {
    @FXML
    private Button click1;
    @FXML
    private Button click2;
    @FXML
    private TextField count;
    @FXML
    private void action1(ActionEvent Calculate){
        int x = Integer.parseInt(count.getText());
        if(x<3){
            x++;
            count.setText(String.valueOf(x));
        }
    }
    @FXML
    private void action2(ActionEvent Clear){
        int x = Integer.parseInt(count.getText());
        if(x>-5){
            x--;
            count.setText(String.valueOf(x));
        }
    }

}
