import java.sql.*;

public class JDBCConnection {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String userName = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, userName, password);

            System.out.println(connection.getSchema());
            System.out.println("Connection established successfully!");

            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}