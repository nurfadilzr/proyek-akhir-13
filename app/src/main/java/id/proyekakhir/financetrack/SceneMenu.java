package id.proyekakhir.financetrack;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class SceneMenu {
    public static Scene getSceneMenu(Stage stage){
        Text pilihMenu = new Text("PILIH MENU");
        Button catat = new Button("Catat Pengeluaran");
        Button lihat = new Button("Lihat Pengeluaran");
        Button artikel = new Button("Tips");
        Button logout = new Button("LOGOUT");

        pilihMenu.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
        pilihMenu.setFill(Color.rgb(60,86,68));
        catat.setFont(Font.font("Times New Roman", 22));
        catat.setStyle("-fx-background-color: white");
        catat.setTextFill(Color.rgb(69,125,88));
        catat.setCursor(Cursor.HAND);
        
        lihat.setFont(Font.font("Times New Roman", 22));
        lihat.setStyle("-fx-background-color: white");
        lihat.setTextFill(Color.rgb(69,125,88));
        lihat.setCursor(Cursor.HAND);

        artikel.setFont(Font.font("Times New Roman", 22));
        artikel.setStyle("-fx-background-color: white");
        artikel.setTextFill(Color.rgb(69,125,88));
        artikel.setCursor(Cursor.HAND);

        logout.setFont(Font.font("Quicksand", 14));
        logout.setStyle("-fx-text-fill: white; -fx-background-color: silver;");
        logout.setStyle("-fx-background-radius: 100;");
        logout.setCursor(Cursor.HAND);

        catat.setOnAction(v -> {
            stage.setScene(SceneCatat.getSceneCatat(stage)); 
        });
        lihat.setOnAction(v -> {
            SceneLihat scene = new SceneLihat();
            stage.setScene(scene.getSceneLihat(stage)); 
        });
        artikel.setOnAction(v -> {
            stage.setScene(SceneTips.getSceneTips(stage)); 
        });
        logout.setOnAction(v -> {
            stage.setScene(SceneLogin.getSceneLogin(stage)); 
        });

        VBox vb = new VBox(pilihMenu, catat, lihat, artikel);
        vb.setAlignment(Pos.CENTER);
        vb.setSpacing(20);

        VBox vbox3 = new VBox(vb, logout);
        vbox3.setAlignment(Pos.CENTER);
        vbox3.setSpacing(40);
        BackgroundFill bgFill = new BackgroundFill(Color.rgb(246,247,233), CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(bgFill);
        vbox3.setBackground(background);
        Scene scene = new Scene(new StackPane(vbox3), 400, 650);
        return scene;
    }
}
