package introduction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import util.hierarchy.Beaver;

public class DatabasesIntroduction {

    public static void main(String[] args) {

        //                v place to put exception and what to do if things did not work
        //  try {} catch (){ }
        //       ^place to write if everything works out
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:/Users/agris.traskovs/code/testableSGT/sql/zoo.db");

            Statement statement = connection.createStatement();
            //INSERT INTO Birds ( name, age, eyeColor) VALUES( 'Goose', 15, 'black');
            statement.execute("INSERT INTO Birds ( name, age, eyeColor) VALUES( 'Goose', 15, 'black');");

            statement.execute("SELECT name, age FROM Birds;");

            ResultSet rs = statement.getResultSet();

            while (rs.next()) {
                System.out.println(rs.getString("name") + " is " + rs.getInt("age") + " years old.");
            }
            statement.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void saveBeaver(Beaver bev) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:/Users/agris.traskovs/code/testableSGT/sql/zoo.db");
            Statement statement = connection.createStatement();
            //animal first
            //int generatedID =
                statement.execute(
                "INSERT INTO Animals ( age, eyeColour) VALUES( " + bev.getAge() + ", '" + bev.getEyeColor() + "');");
            //beaver second
            String queryLastRowInserted = "SELECT last_insert_rowid() AS id";
            statement.execute(queryLastRowInserted);
            ResultSet rs = statement.getResultSet();
            rs.next();
            int generatedID = rs.getInt("id");


            statement.execute("INSERT INTO Beaver ( lengthForTeeth, colourOfFur, hasADam, animalID) VALUES( "
                + bev.getLengthOfTeeth() + ", '" + bev.getColourOfFur() + "', "
                + (bev.isHasADam() ? 1 : 0) + ", " + generatedID + ");");

            statement.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
