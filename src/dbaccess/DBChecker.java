/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbaccess;

import java.sql.ResultSet;
import models.User;
import utilities.JDBCConnector;

/**
 *
 * @author hrox
 */
public class DBChecker {

    public static boolean isValidUser(User usr) {

        boolean isVaild = false;

        try {
            String sql = "SELECT COUNT(*) c FROM UserMaster WHERE username = '" + usr.getUsername() + "' AND password = '" + usr.getPassword() + "' AND isActive = 1 AND loggedIn = 0";
            ResultSet rs = JDBCConnector.getData(sql);

            while (rs.next()) {
                if (rs.getInt("c") > 0) {
                    isVaild = true;
                }
            }
            if (rs != null) {
                rs.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isVaild;
    }
}
