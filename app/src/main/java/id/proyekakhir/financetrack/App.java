package id.proyekakhir.financetrack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
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

    private Scene getScene1() throws FileNotFoundException{
        Image image1 = new Image(new FileInputStream("E:\\image1.jpeg"));
        ImageView logoApp = new ImageView(image1);
        Text intro = new Text("Let's Manage your Savings!");
        Button start = new Button("Start Now");

        logoApp.setFitWidth(250);
        logoApp.setFitHeight(250);
        intro.setFont(Font.font("Anaktoria", FontWeight.BOLD, FontPosture.ITALIC, 18));
        intro.setFill(Color.rgb(60,86,68));
        start.setFont(Font.font("Quicksand", 14));
        start.setStyle("-fx-text-fill: black; -fx-background-color: silver;");
        start.setStyle("-fx-background-radius: 300;");
        start.setCursor(Cursor.HAND);

        start.setOnAction(v -> {
            stage.setScene(getScene2());
        });

        VBox vbox1 = new VBox(logoApp, intro, start);
        vbox1.setSpacing(18);
        vbox1.setAlignment(Pos.CENTER);

        BackgroundFill bgFill = new BackgroundFill(Color.rgb(246,247,233), null, null);
        Background background = new Background(bgFill);
        vbox1.setBackground(background);
        Scene scene = new Scene(new StackPane(vbox1), 400, 600);
        return scene;
    }

    private Scene getScene2(){
        Text hlmLogin = new Text("Halaman Login");
        Button login = new Button("LOGIN");
        Button back = new Button("BACK");
        
        hlmLogin.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, 26));
        login.setFont(Font.font("Quicksand", 12));
        login.setStyle("-fx-text-fill: black; -fx-background-color: silver;");
        login.setStyle("-fx-background-radius: 200;");
        login.setCursor(Cursor.HAND);
        back.setFont(Font.font("Quicksand", 12));
        back.setStyle("-fx-text-fill: black; -fx-background-color: silver;");
        back.setStyle("-fx-background-radius: 300;");
        back.setCursor(Cursor.HAND);

        Label username = new Label("Username");
        TextField txtUsername = new TextField();
        username.setFont(Font.font("Forum", 14));
        txtUsername.setFont(Font.font("Forum", 14));

        Label password = new Label("Password");
        TextField txtPassword = new TextField();
        password.setFont(Font.font("Forum", 14));
        txtPassword.setFont(Font.font("Forum", 14));
        
        login.setOnAction(v -> {
            stage.setScene(getScene3());
        });
        back.setOnAction(v -> {
            try {
                stage.setScene(getScene1());
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
        
        VBox vb = new VBox(hlmLogin);
        vb.setAlignment(Pos.CENTER);

        VBox vb1 = new VBox(username, txtUsername, password, txtPassword);
        vb1.setAlignment(Pos.CENTER_LEFT);
        vb1.setSpacing(5);

        VBox vb2 = new VBox(login, back);
        vb2.setAlignment(Pos.CENTER);
        vb2.setSpacing(10);

        VBox vbox2 = new VBox(vb, vb1, vb2);
        vbox2.setPadding(new Insets(20, 30, 20, 30));
        vbox2.setAlignment(Pos.CENTER);
        vbox2.setSpacing(20);
        
        // VBox vbox2 = new VBox(hlmLogin, username, txtUsername, password, txtPassword, login, back);
        // vbox2.setAlignment(Pos.CENTER_LEFT);
        // vbox2.setSpacing(10);
        // vbox2.setMaxWidth(200);
        
        BackgroundFill bgFill = new BackgroundFill(Color.rgb(246,247,233), CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(bgFill);
        vbox2.setBackground(background);
        Scene scene = new Scene(new StackPane(vbox2), 400, 600);
        return scene;
    }


    private Scene getScene3(){
        Text pilihMenu = new Text("PILIH MENU");
        Button catat = new Button("Catat Pengeluaran");
        Button lihat = new Button("Lihat Pengeluaran");
        Button artikel = new Button("Artikel");
        Button logout = new Button("LOGOUT");

        pilihMenu.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, 30));
        catat.setStyle("-fx-font: 18 forum; -fx-text-fill: white;");
        catat.setBackground(Background.fill(Color.DIMGREY));
        catat.setCursor(Cursor.HAND);
        lihat.setStyle("-fx-font: 18 forum; -fx-text-fill: white;");
        lihat.setBackground(Background.fill(Color.DIMGREY));
        lihat.setCursor(Cursor.HAND);
        artikel.setStyle("-fx-font: 18 forum; -fx-text-fill: white;");
        artikel.setBackground(Background.fill(Color.DIMGREY));
        artikel.setCursor(Cursor.HAND);
        logout.setFont(Font.font("Quicksand", 12));
        logout.setStyle("-fx-text-fill: black; -fx-background-color: silver;");
        logout.setStyle("-fx-background-radius: 200;");
        logout.setCursor(Cursor.HAND);

        catat.setOnAction(v -> {
            stage.setScene(getScene4()); 
        });
        lihat.setOnAction(v -> {
            stage.setScene(getScene5()); 
        });
        artikel.setOnAction(v -> {
            stage.setScene(getScene6()); 
        });
        logout.setOnAction(v -> {
            stage.setScene(getScene2()); 
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

    private Scene getScene4(){
        Text catat = new Text("Catat Pengeluaran");
        TextField tgl = new TextField("dd/mm/yyyy");
        TextField hal = new TextField("Keperluan");
        TextField jml = new TextField("Rp");
        Button simpan = new Button("SIMPAN");
        Button batal = new Button("BATAL");

        catat.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, 24));
        tgl.setFont(Font.font("Forum", FontPosture.ITALIC, 14));
        hal.setFont(Font.font("Forum", FontPosture.ITALIC, 14));
        jml.setFont(Font.font("Forum", FontPosture.ITALIC, 14));
        tgl.setStyle("-fx-text-fill: grey;");
        hal.setStyle("-fx-text-fill: grey;");
        jml.setStyle("-fx-text-fill: grey;");

        simpan.setFont(Font.font("Quicksand", 12));
        simpan.setStyle("-fx-text-fill: black; -fx-background-color: silver;");
        simpan.setStyle("-fx-background-radius: 200;");
        simpan.setCursor(Cursor.HAND);
        batal.setFont(Font.font("Quicksand", 12));
        batal.setStyle("-fx-text-fill: black; -fx-background-color: silver;");
        batal.setStyle("-fx-background-radius: 300;");
        batal.setCursor(Cursor.HAND);

        simpan.setOnAction(v -> {
            stage.setScene(getScene5());
        });
        batal.setOnAction(v -> {
            stage.setScene(getScene3());
        });

        VBox vb = new VBox(catat);
        vb.setAlignment(Pos.CENTER_LEFT);

        VBox vb1 = new VBox(tgl, hal, jml);
        vb1.setAlignment(Pos.CENTER_LEFT);
        vb1.setSpacing(10);

        VBox vb2 = new VBox(simpan,batal);
        vb2.setAlignment(Pos.CENTER_LEFT);
        vb2.setSpacing(10);

        VBox vbox4 = new VBox(vb, vb1, vb2);
        vbox4.setPadding(new Insets(20, 30, 20, 30));
        vbox4.setAlignment(Pos.CENTER);
        vbox4.setSpacing(20);
        BackgroundFill bgFill = new BackgroundFill(Color.rgb(246,247,233), CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(bgFill);
        vbox4.setBackground(background);
        Scene scene = new Scene(new StackPane(vbox4), 400, 600);
        return scene;
    }

    private Scene getScene5(){
        Text lihat = new Text("Lihat Pengeluaran");
        Button back = new Button("BACK");

        lihat.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, 24));
        back.setStyle("-fx-background-radius: 300;");
        back.setCursor(Cursor.HAND);

        back.setOnAction(v -> {
            stage.setScene(getScene3());
        });

        VBox vbox5 = new VBox(lihat, back);
        vbox5.setPadding(new Insets(20, 30, 20, 30));
        vbox5.setAlignment(Pos.CENTER_LEFT);
        vbox5.setSpacing(20);
        BackgroundFill bgFill = new BackgroundFill(Color.rgb(246,247,233), CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(bgFill);
        vbox5.setBackground(background);
        Scene scene = new Scene(new StackPane(vbox5), 400, 600);
        return scene;
    }

    private Scene getScene6(){
        Text artikel = new Text("Artikel");
        Button back = new Button("BACK");
        // String[] text = {
        //     "Perencanaan keuangan yang baik seringkali didukung dengan adanya \n",
        //     "pengetahuan keuangan yang baik pula. Pengetahuan keuangan atau financial \n",
        //     "literacy adalah pengetahuan individu mengenai konsep keuangan, \n", 
        //     "prinsip-prinsip dan teknologi yang digunakan sebagai dasar pengelolaan \n",
        //     "keuangan yang memungkinkan individu dalam mengambil keputusan-keputusan keuangan. \n"
        // };

        Text isi = new Text(    
        "Perencanaan keuangan yang baik seringkali didukung dengan adanya pengetahuan keuangan yang baik pula. Pengetahuan keuangan atau financial literacy adalah pengetahuan individu mengenai konsep keuangan, prinsip-prinsip dan teknologi yang digunakan sebagai dasar pengelolaan keuangan yang memungkinkan individu dalam mengambil keputusan-keputusan keuangan.");
        isi.setWrappingWidth(380);
        isi.setTextAlignment(TextAlignment.JUSTIFY);
        isi.setFont(Font.font("Times New Roman", 16));
        //isi.setText("Perencanaan keuangan yang baik seringkali didukung dengan adanya \npengetahuan keuangan yang baik pula. Pengetahuan keuangan atau financial \nliteracy adalah pengetahuan individu mengenai konsep keuangan, \nprinsip-prinsip dan teknologi yang digunakan sebagai dasar pengelolaan");
        
        
        // isi.setText("pengetahuan keuangan yang baik pula. Pengetahuan keuangan atau financial");
        // isi.setText("literacy adalah pengetahuan individu mengenai konsep keuangan, \n");
        // isi.setText("prinsip-prinsip dan teknologi yang digunakan sebagai dasar pengelolaan \n");
        // isi.setText("keuangan yang memungkinkan individu dalam mengambil keputusan-keputusan keuangan. \n");

        //TextArea isi = new TextArea();
        //String[] isi = {"Perencanaan keuangan yang baik seringkali didukung dengan adanya pengetahuan keuangan yang baik pula. Pengetahuan keuangan atau financial literacy adalah pengetahuan individu mengenai konsep keuangan, prinsip-prinsip dan teknologi yang digunakan sebagai dasar pengelolaan keuangan yang memungkinkan individu dalam mengambil keputusan-keputusan keuangan."};


        artikel.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, 24));
        back.setStyle("-fx-background-radius: 300;");
        back.setCursor(Cursor.HAND);

        back.setOnAction(v -> {
            stage.setScene(getScene3());
        });

        VBox vbox6 = new VBox(artikel, isi, back);
        vbox6.setPadding(new Insets(20, 30, 20, 30));
        vbox6.setAlignment(Pos.TOP_LEFT);
        vbox6.setSpacing(20);
        BackgroundFill bgFill = new BackgroundFill(Color.rgb(246,247,233), CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(bgFill);
        vbox6.setBackground(background);
        Scene scene = new Scene(new StackPane(vbox6), 400, 600);
        return scene;
    }

    public static void main(String[] args) {
        launch(args);
    }   
}
