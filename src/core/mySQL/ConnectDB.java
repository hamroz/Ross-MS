package core.mySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectDB {
    /*
    public static void main(String[] args) {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost/rossDB";
            conn = DriverManager.getConnection(url, "root","");

            System.out.println("Got it!");

        } catch (SQLException e) {
            throw new Error("Problem", e);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    */

        public static Connection conDB() {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/rossDB", "root", "");
                return con;
            } catch (ClassNotFoundException | SQLException ex) {
                System.err.println("ConnectionUtil : " + ex.getMessage());
                return null;
            }
        }
    }
