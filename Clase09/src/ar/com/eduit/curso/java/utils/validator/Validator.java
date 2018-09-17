package ar.com.eduit.curso.java.utils.validator;

public class Validator {
    String text;
    public Validator(String text) {
        this.text = text;
    }
    public boolean length(int length){
        return text.length()==length;
    }
    public boolean length(int min, int max){
        return text.length()>=min && text.length()<=max;
    }
    public boolean isInteger(){
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) { return false; }
    }
    public boolean isInteger(int min, int max){
        if(!isInteger()) return false;
        int num=Integer.parseInt(text);
        return num>=min && num<=max;
    }
}
