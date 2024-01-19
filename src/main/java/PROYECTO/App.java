package PROYECTO;

import clases.Reserva;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Date;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
        
        Reserva reserva1 = new Reserva("Cliente1", "CiudadOrigen1", "CiudadDestino1",
                new Date(), new Date(), 2, "VueloIda1", "VueloRegreso1", 150.0, 120.0);

        Reserva reserva2 = new Reserva("Cliente2", "CiudadOrigen2", "CiudadDestino2",
                new Date(), new Date(), 3, "VueloIda2", "VueloRegreso2", 200.0, 180.0);

        Reserva reserva3 = new Reserva("Cliente3", "CiudadOrigen3", "CiudadDestino3",
                new Date(), new Date(), 1, "VueloIda3", "VueloRegreso3", 100.0, 90.0);

        // Imprimir códigos de reserva generados
        System.out.println("Código de Reserva 1: " + reserva1.getCodigoReserva());
        System.out.println("Código de Reserva 2: " + reserva2.getCodigoReserva());
        System.out.println("Código de Reserva 3: " + reserva3.getCodigoReserva());
    }
    
    

}