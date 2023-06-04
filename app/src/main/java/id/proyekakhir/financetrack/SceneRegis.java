package id.proyekakhir.financetrack;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.regex.Pattern;
import config.DbConnect;

public class SceneRegis {
    // Regular expression patterns for username and password validation
    private static final Pattern USERNAME_PATTERN = Pattern.compile("[a-zA-Z0-9]+");
    private static final Pattern PASSWORD_PATTERN = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}");
    public Scene getRegis(Stage Stage) {
        Stage.setTitle("Registration Form");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20));
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        // Username Label and TextField
        Label usernameLabel = new Label("Username:");
        TextField usernameTextField = new TextField();
        gridPane.add(usernameLabel, 0, 0);
        gridPane.add(usernameTextField, 1, 0);

        // Password Label and PasswordField
        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();
        gridPane.add(passwordLabel, 0, 1);
        gridPane.add(passwordField, 1, 1);

        // Register Button
        Button registerButton = new Button("Register");
        Button back = new Button("Back");
        gridPane.add(registerButton, 0, 2);

        // Register Button event handling
        registerButton.setOnAction(event -> {
            String username = usernameTextField.getText();
            String password = passwordField.getText();

            // Validate username and password
            if (!validateUsername(username)) {
                showAlert("Username tidak valid. Username harus terdiri dari kombinasi huruf dan angka.");
                return;
            }

            if (!validatePassword(password)) {
                showAlert("Password tidak valid. Password harus memiliki setidaknya 8 karakter dan mengandung setidaknya satu huruf kecil, satu huruf besar, dan satu angka.");
                return;
            }

            Boolean tambah = DbConnect.saveToDatabase(username, password);
            if (tambah){
                 showAlert("Sukses.");
            }
            else {
                showAlert("tidak sukses");
            }

            
        });

        back.setOnAction(event -> {
            Stage.setScene(Scene2.getScene2(Stage));
        });

        Scene scene = new Scene(gridPane, 360, 660);
        Stage.setScene(scene);
        return scene;
    }

    // Validate username
    private boolean validateUsername(String username) {
        return USERNAME_PATTERN.matcher(username).matches();
    }

    // Validate password
    private boolean validatePassword(String password) {
        return PASSWORD_PATTERN.matcher(password).matches();
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

}
