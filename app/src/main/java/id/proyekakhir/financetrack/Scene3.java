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


public class Scene3 {

    public static Scene getScene3(Stage stage){
        Text pilihMenu = new Text("PILIH MENU");
        Button catat = new Button("Catat Pengeluaran");
        Button lihat = new Button("Lihat Pengeluaran");
        Button artikel = new Button("Artikel");
        Button logout = new Button("LOGOUT");

        pilihMenu.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, 30));
        catat.setStyle("-fx-font: 18 forum; -fx-text-fill: black;");
        // catat.setBackground(Background.fill(Color.DIMGREY));
        catat.setStyle("-fx-background-color: white");
        catat.setCursor(Cursor.HAND);
        lihat.setStyle("-fx-font: 18 forum; -fx-text-fill: black;");
        // lihat.setBackground(Background.fill(Color.DIMGREY));
        catat.setStyle("-fx-background-color: white");
        lihat.setCursor(Cursor.HAND);
        artikel.setStyle("-fx-font: 18 forum; -fx-text-fill: black;");
        // artikel.setBackground(Background.fill(Color.DIMGREY));
        catat.setStyle("-fx-background-color: white");
        artikel.setCursor(Cursor.HAND);

        logout.setFont(Font.font("Quicksand", 12));
        logout.setStyle("-fx-text-fill: white; -fx-background-color: silver;");
        logout.setStyle("-fx-background-radius: 300;");
        logout.setCursor(Cursor.HAND);

        catat.setOnAction(v -> {
            stage.setScene(Scene4.getScene4(stage)); 
        });
        lihat.setOnAction(v -> {
            Scene5 scene = new Scene5();
            stage.setScene(scene.getScene5(stage)); 
        });
        artikel.setOnAction(v -> {
            stage.setScene(Scene6.getScene6(stage)); 
        });
        logout.setOnAction(v -> {
            stage.setScene(Scene2.getScene2(stage)); 
        });


        VBox vbox3 = new VBox(pilihMenu, catat, lihat, artikel, logout);
        vbox3.setAlignment(Pos.CENTER);
        vbox3.setSpacing(20);
        BackgroundFill bgFill = new BackgroundFill(Color.rgb(246,247,233), CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(bgFill);
        vbox3.setBackground(background);
        Scene scene = new Scene(new StackPane(vbox3), 400, 600);
        return scene;
    }
}
