package introduction;

import util.hierarchy.Beaver;
import util.hierarchy.Dog;

import java.sql.*;

public class DBIntroDog {
    public static void saveDog(Dog dog) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:/Users/37126/SQLITE3/zoo-v.db");
            Statement statement = connection.createStatement();
            //animal first
            //int generatedID =
            statement.execute(
                    "INSERT INTO Animals ( age, eyeColour) VALUES( " + dog.getAge() + ", '" + dog.getEyeColor() + "');");
            //dog second
            String queryLastRowInserted = "SELECT last_insert_rowid() AS id;";
            statement.execute(queryLastRowInserted);
            ResultSet rs = statement.getResultSet();
            rs.next();
            int generatedID = rs.getInt("id");


            statement.execute("INSERT INTO Dog ( name, height, canRun, canSwim, canBite, colour, animalID) VALUES( "
                   + "'" + dog.getName() + "', "  + dog.getHeight() + ", " + (dog.isCanRun() ? 1 : 0) + ", "
                    + (dog.isCanSwim() ? 1 : 0) + ", "  + (dog.isCanBite() ? 1 : 0) + ", '"  + dog.getColour() + "', "  + generatedID + ");");

            statement.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}