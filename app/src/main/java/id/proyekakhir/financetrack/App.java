package id.proyekakhir.financetrack;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application{
    private Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        stage.setScene(SceneStart.getSceneStart(stage));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }   
}
