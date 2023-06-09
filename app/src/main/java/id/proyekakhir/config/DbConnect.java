package id.proyekakhir.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.scene.control.TableView;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.control.TableColumn;

public class DbConnect {
    private static final String DB_URL = "jdbc:sqlite:/db/dbUser.db";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "password";
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    private static ResultSet resultSet;
    private static String quary;
    
    public static void connection(){    
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("connected");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean validasi(String username, String password){
        connection();
        quary = "SELECT * FROM user WHERE user_name=? AND password=?";
        try {
            preparedStatement = connection.prepareStatement(quary);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2, password);
            try(ResultSet login = preparedStatement.executeQuery()){
                return login.next();    
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false ;
        }
    }

    public static boolean saveToDatabase(String username, String password) {
        try {
            connection();
            String sql = "INSERT INTO user (user_name, password) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            statement.executeUpdate();
            connection.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean saveToDatabase(int pemasukkan, int pengeluaran, String keterangan) {
        try {
            connection();
            String sql = "INSERT INTO pengeluaran (pengeluaran, pemasukkan, keterangan) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, pengeluaran);
            statement.setInt(2, pemasukkan);
            statement.setString(3, keterangan);
            statement.executeUpdate();
            connection.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean saveToDatabase(int saldo) {
        try {
            connection();
            String sql = "UPDATE user SET saldo =?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, saldo);
            
            statement.executeUpdate();
            connection.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean checkSaldoIsNull() {
        Boolean uji = false ;
        try (Connection connection = DriverManager.getConnection(DB_URL);
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM user WHERE saldo IS NULL")) {
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                uji = true;
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return uji;
    }

    public static boolean checkUsernameIsNull() {
        Boolean uji = false ;
        try (Connection connection = DriverManager.getConnection(DB_URL);
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM user WHERE user_name IS NULL")) {
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                uji = true;
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return uji;
    }
    
    public static TableView<Object[]> fetchDataFromDatabase(TableView<Object[]> tableView) {
        try {
            // Mengatur koneksi ke database
            Connection connection = DriverManager.getConnection("jdbc:sqlite:/db/dbUser");
    
            // Mengeksekusi query dan mendapatkan hasil
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM pengeluaran");
    
            // Mendapatkan metadata kolom
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
    
            // Menambahkan kolom ke dalam TableView
            for (int i = 1; i <= columnCount; i++) {
                int columnIndex = i;    
                String columnName = metaData.getColumnName(columnIndex);
                TableColumn<Object[], Object> column = new TableColumn<>(columnName);
                column.setCellValueFactory(cellData -> {
                    Object[] row = cellData.getValue();
                    return new SimpleObjectProperty<>(row[columnIndex - 1]);
                });
                tableView.getColumns().add(column);
            }
    
            // Menambahkan data ke dalam TableView
            while (resultSet.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    rowData[i - 1] = resultSet.getObject(i);
                }
                tableView.getItems().add(rowData);
            }
    
            // Menutup koneksi dan statement
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tableView;
    }
}
