package clase04;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javax.swing.JOptionPane;

public class FXMLDocumentController implements Initializable {
    /* Todo lo que existe en la vista (FXMLDocument) tiene que existir en el controlador (FXMLDocumentController) y viceversa. */
    
    private ToggleGroup grupoEstado;
    private List<CheckBox> listaCheck;
    
    @FXML
    private TextField txtNombre;
    @FXML
    private CheckBox chkBici;
    @FXML
    private CheckBox chkMoto;
    @FXML
    private CheckBox chkAuto;
    @FXML
    private TextArea txaTexto;
    @FXML
    private RadioButton radSoltero;
    @FXML
    private RadioButton radCasado;
    @FXML
    private RadioButton radViudo;
    @FXML
    private RadioButton radDivorciado;
    @FXML
    private ComboBox<String> cmbColores;
    
    @FXML
    private void aceptar(ActionEvent event) {
        String nombre = txtNombre.getText();
        //JOptionPane.showMessageDialog(null, "Hola " +nombre);
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText("Hola " + nombre);
        alert.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        armarGrupoEstado();
        armarListaCheck();
        cargarCmbEstado();
    }    
    
    private void cargarCmbEstado() {
        cmbColores.getItems().addAll (MapaColores.getMapa().keySet());
        cmbColores.getSelectionModel().selectFirst();
    }

    private void armarListaCheck() {
        // amar la listaCheck
        listaCheck = new ArrayList();
        listaCheck.add(chkBici);
        listaCheck.add(chkMoto);
        listaCheck.add(chkAuto);
    }    

    private void armarGrupoEstado() {
        // armar el grupoEstado
        grupoEstado = new ToggleGroup();
        grupoEstado.getToggles().add(radSoltero);
        grupoEstado.getToggles().add(radCasado);
        grupoEstado.getToggles().add(radViudo);
        grupoEstado.getToggles().add(radDivorciado);
        radSoltero.setSelected(true);
    }

    @FXML
    private void agregar(ActionEvent event) {
        String nombre = txtNombre.getText();
        if (nombre.length() < 2) return;
        String texto = "";
        texto += "Nombre: " + nombre + ".\n";
        //if (chkBici.isSelected()) texto += "Tiene Bici.\n";
        //if (chkMoto.isSelected()) texto += "Tiene Moto.\n";
        //if (chkAuto.isSelected()) texto += "Tiene Auto.\n";
        for (CheckBox c:listaCheck) { /* Lo que esta entre parentesis es para hacer que recorra el vectoe (se llama for each)*/
            if (c.isSelected()) texto += "Tiene " + c.getText() + ".\n";
        }
        texto += "Estado civil: " + ((RadioButton)grupoEstado.getSelectedToggle()).getText() + ".\n"; // Para que la linea ande (ya que getText no esta en grupoEstado), se deve castear como RadioButton, ya que es un elemento padre.
        
        texto += "Color: " + cmbColores.getValue() + ".\n";
        
        String color = MapaColores.getMapa().get(cmbColores.getValue());
        txaTexto.setStyle("-fx-control-inner-background:" + color + ";");
        limpiar();
        txaTexto.setText(texto);
    }
    
    private void limpiar() {
        txtNombre.setText("");
        for (CheckBox c:listaCheck) c.setSelected(false);
        radSoltero.setSelected(true);
        cmbColores.getSelectionModel().selectFirst();
        txtNombre.requestFocus();
    }
}