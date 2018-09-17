package ar.com.eduit.curso.java.utils.validator;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ValidatorGui extends Validator{
    JTextField  swTxt=null;
    JLabel      swLbl=null;
    TextField   fxTxt=null;
    Label       fxLbl=null;
    public ValidatorGui(JTextField swTxt, JLabel swLbl){
        super(swTxt.getText());
        this.swTxt=swTxt;
        this.swLbl=swLbl;
    }
    public ValidatorGui(TextField fxTxt, Label fxLbl){
        super(fxTxt.getText());
        this.fxTxt=fxTxt;
        this.fxLbl=fxLbl;
    }
    private void setText(String text){
        if(swLbl!=null) swLbl.setText(text);
        if(fxLbl!=null) fxLbl.setText(text);
    }
    private void requestFocus(){
        if(swTxt!=null) swTxt.requestFocus();
        if(fxTxt!=null) fxTxt.requestFocus();
    }
    private void selectAll(){
        if(swTxt!=null) swTxt.selectAll();
        if(fxTxt!=null) fxTxt.selectAll();
    }
    @Override
    public boolean isInteger(int min, int max) {
       if(super.isInteger(min, max)) return true;
       setText("debe ser un número entero entre "+min+" y "+max);
       selectAll();
       requestFocus();
       return false;
    }
    @Override
    public boolean isInteger() {
        if(super.isInteger()) return true;
        setText("debe ser un número entero.");
        selectAll();
        requestFocus();
        return false;
    }
    @Override
    public boolean length(int min, int max) {
        if(super.length(min, max)) return true;
        setText("el texto debe tener entre "+min+" y "+max+" caracteres.");
        selectAll();
        requestFocus();
        return false;
    }
    @Override
    public boolean length(int length) {
        if(super.length(length)) return true;
        setText("el texto debe tener "+length+" caracteres.");
        selectAll();
        requestFocus();
        return false;
    }
    
}
