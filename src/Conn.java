import java.sql.*;

public class Conn {
    /*
    This Class is needed to connect to the database, once the user input the data into the application
    it will save it into the DB and can be retrieve later for veriftcaton or informtion update
     */

    Connection c; //create a global object
    Statement s;
    public Conn(){
        try {
            //Step 1 -> Register the Driver (need include the import library):
            //No need to register in this class due to a connector jar file is included in the library
            //Step 2 -> Create Connection:
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Y5505567Mm$");
            //Step 3 -> Create Statement:
            s = c.createStatement();
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
