import java.sql.*;

public class Conn {
    /*
    This Class is needed to connect to the database, once the user input the data into the application
    it will save it into the DB and can be retrieve later for veriftcaton or informtion update
     */

    Connection c; //create a global object
    public Conn(){
        try {
            //Step 1 -> Register the Driver (need include the import library):
            //Class.forName(com.mysql.cj.jdbc.Driver);
            //Step 2 -> Create Connection:
            c = DriverManager.getConnection("jdbc:mysql:///");
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
