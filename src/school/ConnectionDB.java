package school;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionDB {
    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/school_management", "root" ,"mouad@7895");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Connection Failed: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }    
        return connection;
    }

}
