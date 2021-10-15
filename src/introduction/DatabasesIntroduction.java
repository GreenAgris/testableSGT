package introduction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasesIntroduction {

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:/Users/agris.traskovs/code/testableSGT/sql/zoo.db");
            Statement statement = connection.createStatement();
            statement.execute("SELECT name FROM Birds;");
            ResultSet rs = statement.getResultSet();

            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }
            statement.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
