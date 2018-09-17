package config;

import java.net.URL;
import java.time.LocalDateTime;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField txtProcesador;
    @FXML
    private TextField txtSistema;
    @FXML
    private TextField txtVersion;
    @FXML
    private TextField txtJava;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtDirectorio;
    @FXML
    private TextField txtLenguaje;
    @FXML
    private TextField txtFecha;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        txtProcesador.setText(System.getenv("PROCESSOR_IDENTIFIER") + ", " +
                System.getenv("NUMBER_OF_PROCESSORS") + " nucleos");
        txtSistema.setText(System.getProperty("os.name") + " " + System.getProperty("os.arch"));
        txtVersion.setText(System.getProperty("java.version"));
        txtJava.setText(System.getProperty("java.runtime.version"));
        txtNombre.setText(System.getProperty("user.name"));
        txtDirectorio.setText(System.getProperty("user.dir"));
        txtLenguaje.setText(System.getProperty("user.language"));
        //txtFecha.setText(LocalDateTime.now()+"");
        new Thread(new HiloHora(txtFecha)).start();
    }      

    @FXML
    private void cerra(ActionEvent event) {
        System.exit(0);
    }
}