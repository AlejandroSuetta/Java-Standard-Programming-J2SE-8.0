package ar.com.eduit.curso.java.notepad;

import ar.com.eduit.curso.java.utils.files.FileText;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class FXMLDocumentController implements Initializable {
    @FXML
    private TextArea txaText;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void nuevo(ActionEvent event) {
        txaText.setText("");
    }

    @FXML
    private void abrir(ActionEvent event) {
        FileChooser fc = new FileChooser();
        fc.setTitle("Abrir un archivo de texto");
        fc.getExtensionFilters().add(
            new ExtensionFilter("Archivo de Texto", "*.txt")
        );
        fc.setInitialDirectory(new File(System.getProperty("user.home")));
        File file = fc.showOpenDialog(null);
        if(file == null) return;
        txaText.setText(new FileText(file).getText());
    }

    @FXML
    private void guardar(ActionEvent event) {
        FileChooser fc = new FileChooser();
        fc.setTitle("Guardar un archivo de texto");
        fc.getExtensionFilters().add(
            new ExtensionFilter("Archivo de Texto", "*.txt")
        );
        fc.setInitialDirectory(new File(System.getProperty("user.home")));
        File file = fc.showSaveDialog(null);
        if(file == null) return;
        new FileText(file).setText(txaText.getText());
    }

    @FXML
    private void acerca(ActionEvent event) {
        Alert alert = new Alert (Alert.AlertType.INFORMATION);
        alert.setHeaderText("Bloc de Notas --");
        alert.setContentText("Curso de JAVA 2018");
        alert.show();
    }

    @FXML
    private void salir(ActionEvent event) {
        System.exit(0);
    }
}