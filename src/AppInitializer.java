import javafx.application.Application;
import javafx.stage.Stage;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Student nadeepa = new Student("Nadeepa", "1");
        System.out.println(nadeepa.name);

    }
}
