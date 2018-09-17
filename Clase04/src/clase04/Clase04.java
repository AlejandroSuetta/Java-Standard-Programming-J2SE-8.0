package clase04;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Clase04 extends Application {
    
    /*
    Java 8 es LTS (Long Time Support) 8 años.
    
    A partir de Java 9 cambian los plazos de entreaga de versiones, se lanza una
    version cada 6 meses.
    JDK 9: se lanzo en septiembre  2017
    JDK10: se lanzo en marzo 2018
    JDK11: se lanzara en septiembre 2018 y es LTS
    
    Cada 18 meses se lanza una versión LTS.
    
    AWT: (Abstract Widows Type) Fue el primer entorno gráfico de java, es el más
    veloz, la desventaja es que no es muy completo.
    
    Swing: Es posterior es más completo y garantiza la misma apariencia gráfica 
    en todos los SOs, no es MVC (modelo vista controlado).
    
    JavaFX: Existe a partir de java 6, fue pensado para aplicaciones desktop
    mobiles y webs, es propiedad de Oracle, pero existe un OpenFX. JavaFx viene
    incorporado en el jdk de Oracle, se presume que en java 11 javaFX estara
    fuera del jdk.
    Cumple con el patron MVC desacoplando el código de la vista y del controlador.
    
    Descargar e instalar Scene Builder (Oracle 2.0 o Gluon para Java 8)
    */
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setTitle("Primer Formulario"); /* Titulo del formulario */
        //stage.setMaximized(true); /* Para que empieze maximizado */
        stage.setScene(scene); //Stage es la ventana contenedora. Puede consistir de varias Scenes
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
