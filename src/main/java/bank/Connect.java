package bank;

import java.sql.*;

public class Connect {
    Connection c;
    Statement s;
    public Connect() {
        try{
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Prince@2004");
            s = c.createStatement();
        }
        catch (Exception e){
            System.out.println(e.getMessage());

        }
    }
}
