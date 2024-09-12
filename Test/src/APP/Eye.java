package APP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Eye {
    public static void main(String[] args) {

        Connection dbConnection;
        try {

            Class.forName("org.postgresql.Driver");

            dbConnection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Users", "postgres", "123");
            System.out.println("Driver loading success!");

            String insert = "SELECT * FROM public.\"Users\"\n" +
                    "ORDER BY user_id ASC ";

            PreparedStatement ptSt = dbConnection.prepareStatement(insert);
            ptSt.executeLargeUpdate();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}