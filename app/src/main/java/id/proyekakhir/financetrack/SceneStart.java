package id.proyekakhir.financetrack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import id.proyekakhir.config.DbConnect;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class SceneStart{

    public static Scene getSceneStart(Stage stage) throws FileNotFoundException{
        Image image1 = new Image(new FileInputStream("E:\\Proyek Akhir OOP\\app\\image1.jpeg"));   // PINDAHIN LOGO KE FOLDER INI
        ImageView logoApp = new ImageView(image1);
        Text intro = new Text("Let's Manage your Savings!");
        Button start = new Button("Start Now");
        
        logoApp.setFitWidth(250);
        logoApp.setFitHeight(250);
        intro.setFont(Font.font("Anaktoria", FontWeight.BOLD, FontPosture.ITALIC, 18));
        intro.setFill(Color.rgb(60,86,68));
        start.setFont(Font.font("Quicksand", 16));
        start.setStyle("-fx-text-fill: black; -fx-background-color: white;");
        start.setStyle("-fx-background-radius: 300;");
        start.setCursor(Cursor.HAND);

        start.setOnAction(v -> {
            if (DbConnect.checkUsernameIsNull()){
                SceneRegis regisScene = new SceneRegis();
                Scene scene1 = regisScene.getRegis(stage);
                stage.setScene(scene1);
            }
            else {
                stage.setScene(SceneLogin.getSceneLogin(stage));
            }
        });
        
        VBox vbox1 = new VBox(logoApp, intro, start);
        vbox1.setSpacing(18);
        vbox1.setAlignment(Pos.CENTER);

        BackgroundFill bgFill = new BackgroundFill(Color.rgb(246,247,233), null, null);
        Background background = new Background(bgFill);
        vbox1.setBackground(background);
        Scene scene = new Scene(new StackPane(vbox1), 400, 650);
        return scene;
    }
}