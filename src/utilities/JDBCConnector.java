/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Himasha
 */
public class JDBCConnector {

    private static Connection connectDB() {

        Connection c = null;

        try {
            Class.forName("org.sqlite.JDBC");
//            c = DriverManager.getConnection("jdbc:sqlite:DB//" + Global.dbName + ".db");
            c = DriverManager.getConnection("jdbc:sqlite:DB//InventoryDB.db");

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

        return c;
    }

    public static ResultSet getData(String sql) {

        Connection c = null;
        Statement s = null;
        ResultSet rs = null;

        try {
            c = connectDB();
            s = c.createStatement();
            rs = s.executeQuery(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return rs;
    }

    public static boolean setData(String sql) {

        boolean updated = false;
        Connection c = null;
        Statement s = null;

        try {
            c = connectDB();
            s = c.createStatement();
            int i = s.executeUpdate(sql);

            if (i > 0) {
                updated = true;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return updated;
    }

}
