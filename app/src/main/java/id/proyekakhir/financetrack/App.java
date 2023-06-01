package id.proyekakhir.financetrack;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class App extends Application{
    private Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        stage.setScene(getScene1());
        stage.show();
    }

    private Scene getScene1(){
        Text namaApp = new Text("FINANCIAL TRACKING");
        Button start = new Button("START");
        namaApp.setStyle("-fx-font: 32 roboto; -fx-text-fill: light green; -fx-font-weight: bold;");
        start.setStyle("-fx-font: 20 roboto; -fx-text-fill: white;");
        start.setStyle("-fx-background-color: light green; -fx-border-color: white;");
        
        

        start.setOnAction(v -> {
            stage.setScene(getScene2());
        });

        VBox vbox1 = new VBox(namaApp, start);
        vbox1.setSpacing(20);
        vbox1.setAlignment(Pos.CENTER);
        BackgroundFill bgFill = new BackgroundFill(Color.CORNSILK, CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(bgFill);
        vbox1.setBackground(background);
        Scene scene = new Scene(new StackPane(vbox1), 400, 600);
        return scene;
    }

    private Scene getScene2(){
        Text hlmLogin = new Text("Halaman Login");
        Button login = new Button("LOGIN");
        hlmLogin.setTextAlignment(TextAlignment.CENTER);
        hlmLogin.setStyle("-fx-font: 28 arial");

        Label username = new Label("Username");
        TextField txtUsername = new TextField();
        Label password = new Label("Password");
        TextField txtPassword = new TextField() ;
        login.setOnAction(v -> {
            stage.setScene(getScene3());
        });

        VBox sectionRight = new VBox(hlmLogin, username, txtUsername, password, txtPassword, login);
        sectionRight.setSpacing(15);
        sectionRight.setAlignment(Pos.CENTER_LEFT);
        BackgroundFill bgFill = new BackgroundFill(Color.CORNSILK, CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(bgFill);
        sectionRight.setBackground(background);
        Scene scene = new Scene(new StackPane(sectionRight), 400, 600);
        return scene;
    }


    private Scene getScene3(){
        Text pilihMenu = new Text("PILIH MENU");
        Button catat = new Button("Catat Pengeluaran");
        Button lihat = new Button("Lihat Pengeluaran");
        Button artikel = new Button("Artikel");
        // catat.setFont(Font.CENTER_BASELINE);
        catat.setBackground(Background.fill(Color.BISQUE));
        // catat.setOnAction(v -> {
        //     stage.setScene(getScene4()); 
        // });


        VBox vbox3 = new VBox(pilihMenu, catat, lihat, artikel);
        vbox3.setAlignment(Pos.CENTER);
        vbox3.setSpacing(15);
        BackgroundFill bgFill = new BackgroundFill(Color.CORNSILK, CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(bgFill);
        vbox3.setBackground(background);
        Scene scene = new Scene(new StackPane(vbox3), 400, 600);
        return scene;
    }

    // private Scene getScene4(){

    // }

    public static void main(String[] args) {
        launch(args);
    }

    
}
