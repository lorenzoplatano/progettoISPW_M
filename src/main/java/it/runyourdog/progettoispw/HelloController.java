package it.runyourdog.progettoispw;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    private Stage stage=new Stage();


    @FXML
    private Button padroneButton;

    @FXML
    private Button registerNowButton;

    @FXML
    public void provaButton(){
        System.out.println("IL BOTTONE FUNZIONA DANIELE GAY\n");
    }

    @FXML
    public void onRegisterNowButtonClicked() throws IOException {
        System.out.println("IL BOTTONE FUNZIONA DANIELE\n");
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("GUI/registrazione.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1200, 800);

        stage.setScene(scene);
        stage.show();
    }
}