/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diplom_1;

import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class Form_projectController implements Initializable {

    @FXML
    private ComboBox employeebox;
    @FXML
    private ComboBox catbox;
    @FXML
    private ComboBox levelbox;
    @FXML
    private ComboBox zonabox;
    @FXML
    private ComboBox managerprojectbox;
    @FXML
    private ComboBox executorbox;
    @FXML
    private ComboBox workinggroupbox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            setInSelectCombobox(zonabox, DB_Connection.getNames());
            setInSelectCombobox(levelbox, DB_Connection.getLevel());
            setInSelectCombobox(catbox, DB_Connection.getCategory());
            setInSelectCombobox(employeebox, DB_Connection.getEmployee());
            setInSelectCombobox(managerprojectbox, DB_Connection.getManagerProject());
            setInSelectCombobox(executorbox, DB_Connection.getExecutor());
            setInSelectCombobox(workinggroupbox, DB_Connection.getWorkingGroup());
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Form_projectController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void setInSelectCombobox(ComboBox comboBox, List<String> list) {
        comboBox.getItems().addAll(list);
        comboBox.getSelectionModel().select(0);
    }
}
