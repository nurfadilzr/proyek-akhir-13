package id.proyekakhir.financetrack;

import config.DbConnect;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class Scene5 {

    private TableView<Object[]> tableView;

    public Scene getScene5(Stage stage){
        Text lihat = new Text("Lihat Pengeluaran");
        Button back = new Button("BACK");

        tableView = new TableView<>();
        DbConnect.fetchDataFromDatabase(tableView);
        lihat.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, 24));
        back.setStyle("-fx-background-radius: 300;");
        back.setCursor(Cursor.HAND);

        back.setOnAction(v -> {
            stage.setScene(Scene3.getScene3(stage));
        });

        VBox vbox5 = new VBox(lihat, tableView, back);
        vbox5.setPadding(new Insets(20, 30, 20, 30));
        vbox5.setAlignment(Pos.CENTER_LEFT);
        vbox5.setSpacing(20);
        BackgroundFill bgFill = new BackgroundFill(Color.rgb(246,247,233), CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(bgFill);
        vbox5.setBackground(background);
        Scene scene = new Scene(new StackPane(vbox5), 400, 600);
        return scene;
    }
}
