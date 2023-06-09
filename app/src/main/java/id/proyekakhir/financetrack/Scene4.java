package id.proyekakhir.financetrack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import config.DbConnect;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Cursor;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class Scene4 {
    
    public static Scene getScene4(Stage stage){
        Text catat = new Text("Catat Pengeluaran");
        Text textPengeluaran = new Text("Pengeluaran");
        Text textPemasukkan = new Text("Pemasukan");
        Text textKeterangan = new Text("Keterangan");
        Text textSaldo = new Text("Saldo");

        TextField inputPengeluaran = new TextField();
        TextField inputPemasukkan = new TextField();
        TextField inputKeterangan = new TextField();
        TextField inputSaldo= new TextField();

        Button simpan = new Button("SIMPAN");
        Button batal = new Button("BATAL");

        // catat.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, 24));
        // tgl.setFont(Font.font("Forum", FontPosture.ITALIC, 14));
        // hal.setFont(Font.font("Forum", FontPosture.ITALIC, 14));
        // jml.setFont(Font.font("Forum", FontPosture.ITALIC, 14));
        // tgl.setStyle("-fx-text-fill: grey;");
        // hal.setStyle("-fx-text-fill: grey;");
        // jml.setStyle("-fx-text-fill: grey;");

        catat.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, 2));
        simpan.setFont(Font.font("Quicksand", 14));
        simpan.setStyle("-fx-text-fill: black; -fx-background-color: silver;");
        simpan.setStyle("-fx-background-radius: 100;");
        simpan.setCursor(Cursor.HAND);
        batal.setFont(Font.font("Times New Roman", 14));
        batal.setStyle("-fx-text-fill: black; -fx-background-color: silver;");
        batal.setStyle("-fx-background-radius: 100;");
        batal.setCursor(Cursor.HAND);

        simpan.setOnAction(v -> {
            int pengeluaran = Integer.parseInt(inputPengeluaran.getText());
            int Pemasukkan = Integer.parseInt(inputPemasukkan.getText());
            int Saldo = Integer.parseInt(inputSaldo.getText());
            String keterangan = inputKeterangan.getText();
            DbConnect.connection();
            Boolean uji = DbConnect.saveToDatabase(Pemasukkan, pengeluaran, keterangan);
            Boolean uji2 = DbConnect.saveToDatabase(Saldo);
            if (uji){
                if (uji2){
                    showAlert("sukses menginput data");
                    return;
                }
            }
            else if (uji) {
                showAlert("sukses menginput data");
                return;
                }
            else {
                showAlert("gagal menginput data");
                return;
            }
        });

        batal.setOnAction(v -> {
            stage.setScene(Scene3.getScene3(stage));
        });

        GridPane Data = new GridPane();
        if (DbConnect.checkSaldoIsNull()){
            Data.add(textPengeluaran, 0, 0);
            Data.add(inputPengeluaran, 1, 0);
            Data.add(textPemasukkan, 0, 1);
            Data.add(inputPemasukkan, 1, 1);
            Data.add(textKeterangan, 0, 2);
            Data.add(inputKeterangan, 1, 2);
            Data.add(textSaldo, 0, 3);
            Data.add(inputSaldo, 1, 3);
            Data.add(simpan, 0, 4);
            Data.add(batal, 1, 4);
        }
        else {
            Data.add(textPengeluaran, 0, 0);
            Data.add(inputPengeluaran, 1, 0);
            Data.add(textPemasukkan, 0, 1);
            Data.add(inputPemasukkan, 1, 1);
            Data.add(textKeterangan, 0, 2);
            Data.add(inputKeterangan, 1, 2);
            Data.add(simpan, 0, 3);
            Data.add(batal, 0, 4);
        }
    
        Data.setHgap(10); 
        Data.setVgap(10);
        //Data.setStyle("-fx-font: 18 times new roman;");
        Data.setAlignment(Pos.CENTER);


        VBox root  = new VBox();
        root.getChildren().addAll(catat, Data);
        root.setAlignment(Pos.CENTER);
        root.setStyle(" -fx-spacing: 30px; -fx-alignment: center;");
        
        // VBox vb2 = new VBox(simpan,batal);
        // vb2.setAlignment(Pos.CENTER_LEFT);
        // vb2.setSpacing(10);

        VBox vbox4 = new VBox(root);
        vbox4.setPadding(new Insets(20, 30, 20, 30));
        vbox4.setAlignment(Pos.CENTER);
        vbox4.setSpacing(20);
        BackgroundFill bgFill = new BackgroundFill(Color.rgb(246,247,233), CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(bgFill);
        vbox4.setBackground(background);
        Scene scene = new Scene(new StackPane(vbox4), 400, 650);
        return scene;
    }
    private static void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            // Menentukan path atau lokasi database SQLite
            String databasePath = "D:/Folder Baru (2)/praktikum/AplikasihFinal/app/src/main/data/dataUser.sqlite";

            // Membuat koneksi ke database
            connection = DriverManager.getConnection(databasePath);
            statement = connection.createStatement();

            // Membuat tabel
            String createTableQuery = "CREATE TABLE IF NOT EXISTS transaksi (" +
                    "no INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "tanggal TEXT, " +
                    "pengeluaran REAL, " +
                    "pemasukan REAL, " +
                    "keterangan TEXT, " +
                    "saldo REAL" +
                    ")";
            statement.executeUpdate(createTableQuery);

            // Menambahkan baris baru
            String insertRowQuery = "INSERT INTO transaksi (tanggal, pengeluaran, pemasukan, keterangan, saldo)" +
                "VALUES ('2023-06-02', 100.0, 0.0, 'Pembelian barang', 100.0)";
            statement.executeUpdate(insertRowQuery);

            System.out.println("Database, tabel, dan baris berhasil dibuat.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Menutup statement dan koneksi setelah selesai
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
