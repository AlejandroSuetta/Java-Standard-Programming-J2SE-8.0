package config;

import java.time.LocalDateTime;
import javafx.scene.control.TextField;

public class HiloHora implements Runnable{

    private TextField txt;

    public HiloHora(TextField txt) {
        this.txt = txt;
    }
    
    @Override
    public void run() {
        while (true) {
            LocalDateTime ldt = LocalDateTime.now();
            txt.setText(
                    ldt.getYear() + "/" + 
                    ldt.getMonthValue() + "/" +
                    ldt.getDayOfMonth() + " " +
                    ldt.getHour() + ":" +
                    ldt.getMinute() + ":" +
                    ldt.getSecond());
            try{Thread.sleep(1000);} catch(Exception e){}
        }
    }
    
}
