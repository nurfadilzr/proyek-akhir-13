package id.proyekakhir.financetrack;

import id.proyekakhir.config.DbConnect;
import java.io.FileNotFoundException;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class SceneLogin {
    private static Scene scene;

    public static Scene getSceneLogin(Stage stage){
        Text hlmLogin = new Text("Halaman Login");
        Button login = new Button("LOGIN");
        Button back = new Button("BACK");
        
        hlmLogin.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, 26));
        login.setFont(Font.font("Quicksand", 14));
        login.setStyle("-fx-text-fill: black; -fx-background-color: white;");
        login.setStyle("-fx-background-radius: 100;");
        login.setCursor(Cursor.HAND);
        back.setFont(Font.font("Quicksand", 14));
        back.setStyle("-fx-text-fill: black; -fx-background-color: white;");
        back.setStyle("-fx-background-radius: 100;");
        back.setCursor(Cursor.HAND);

        Label user = new Label("Username");
        TextField txtUsername = new TextField();
        user.setFont(Font.font("Forum", 14));
        txtUsername.setFont(Font.font("Forum", 14));

        Label pass = new Label("Password");
        TextField txtPassword = new TextField();
        pass.setFont(Font.font("Forum", 14));
        txtPassword.setFont(Font.font("Forum", 14));
        
        Label output = new Label();
        Hyperlink regis = new Hyperlink("Buat Kata Sandi dan Pasword");

        regis.setOnAction(v -> {
            SceneRegis regisScene = new SceneRegis();
            scene = regisScene.getRegis(stage);
            stage.setScene(scene);
        });

        login.setOnAction(v -> {
            String username = txtUsername.getText();
            String password = txtPassword.getText();
            Boolean uji = DbConnect.validasi(username, password);
            if (uji){
                stage.setScene(SceneMenu.getSceneMenu(stage));
            }
            else{
                output.setText("password or username invalid");
            }
        });
        
        back.setOnAction(v -> {
            try {
                stage.setScene(SceneStart.getSceneStart(null));
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
        
        VBox vb = new VBox(hlmLogin);
        vb.setAlignment(Pos.CENTER);

        VBox vb1 = new VBox(user, txtUsername, pass, txtPassword, regis);
        vb1.setAlignment(Pos.CENTER_LEFT);
        vb1.setSpacing(5);

        VBox vb2 = new VBox(login, back);
        vb2.setAlignment(Pos.CENTER);
        vb2.setSpacing(10);

        VBox vbox2 = new VBox(vb, vb1, vb2);
        vbox2.setPadding(new Insets(20, 30, 20, 30));
        vbox2.setAlignment(Pos.CENTER);
        vbox2.setSpacing(20);
        
        BackgroundFill bgFill = new BackgroundFill(Color.rgb(246,247,233), CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(bgFill);
        vbox2.setBackground(background);
        Scene scene = new Scene(new StackPane(vbox2), 400, 650);
        return scene;
    }
}
