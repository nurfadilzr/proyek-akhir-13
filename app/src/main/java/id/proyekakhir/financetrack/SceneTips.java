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
import javafx.scene.text.TextAlignment;


public class SceneTips {

    public static Scene getSceneTips(Stage stage){
        Text artikel = new Text("Tips");
        Button back = new Button("BACK");

        Text isi = new Text(    
        "Perencanaan keuangan yang baik seringkali didukung dengan adanya pengetahuan keuangan yang baik pula. " +
        "Pengetahuan keuangan atau financial literacy adalah pengetahuan individu mengenai konsep keuangan, " +
        "prinsip-prinsip dan teknologi yang digunakan sebagai dasar pengelolaan keuangan yang memungkinkan individu " +
        "dalam mengambil keputusan keuangan.\n \nTerdapat lima tahapan dasar dalam melakukan " +
        "perencanaan keuangan pribadi sebagai berikut: \n1. Melakukan Evaluasi Kesehatan Keuangan \nHal tersebut " +
        "dapat meliputi kegiatan yang terkait dengan mengevaluasi pendapatan dan berapa banyak pengeluaran " +
        "yang perlu dibiayai.\n \n2. Tetapkan Tujuan Keuangan \nMenentukan tujuan keuangan dan membaginya ke " +
        "beberapa periode, seperti tujuan keuangan jangka pendek, menengah, dan jangka panjang.\n \n3. Buatlah " +
        "Action Plan \nHal tersebut melibatkan pengendalian budget, menentukan strategi investasi, dan " +
        "berbagai kegiatan lainnya.\n \n4. Implementasi Rencana \nSangat penting untuk selalu disiplin dengan rencana " +
        "yang dibuat dan berhati-hati dalam mengambil keputusan keuangan.\n \n5. Review, Evaluasi, dan Revisi \nCek " +
        "kembali apakah perencanaan yang anda lakukan sudah sesuai dengan kebutuhan saat ini atau tidak..");
        isi.setWrappingWidth(360);
        isi.setLineSpacing(1.15);
        isi.setTextAlignment(TextAlignment.JUSTIFY);
        isi.setFont(Font.font("Times New Roman", 15));

        artikel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
        back.setFont(Font.font("Times New Roman", 14));
        back.setStyle("-fx-background-radius: 100;");
        back.setCursor(Cursor.HAND);

        back.setOnAction(v -> {
            stage.setScene(SceneMenu.getSceneMenu(stage));
        });
       
        VBox vbox6 = new VBox(artikel, isi, back);
        vbox6.setPadding(new Insets(20, 30, 20, 30));
        vbox6.setAlignment(Pos.TOP_LEFT);
        vbox6.setSpacing(20);
        BackgroundFill bgFill = new BackgroundFill(Color.rgb(246,247,233), CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(bgFill);
        vbox6.setBackground(background);
        Scene scene = new Scene(new StackPane(vbox6), 450, 650);
        return scene;
    }
}
