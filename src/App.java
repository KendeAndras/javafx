import org.omg.CORBA.Object;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage prStage) throws Exception {
        StackPane sp = new StackPane();

        Scene scene = new Scene(null);
        prStage.setScene(scene);
        prStage.show();
    }
}
