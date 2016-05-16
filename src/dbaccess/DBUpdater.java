/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbaccess;

import models.EmployeeDetails;
import utilities.JDBCConnector;

/**
 *
 * @author hrox
 */
public class DBUpdater {

    public static boolean updateUserLogin(String username, int status) {

        //status -> 1 = loggedIn, 0 = loggedOut
        boolean updated = false;

        try {
            String sql = "UPDATE UserMaster SET loggedIn = '" + status + "' WHERE username = '" + username + "'";
            updated = JDBCConnector.setData(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return updated;
    }

    public static boolean updateEmployeeDetails(EmployeeDetails emp) {

        boolean updated = false;

        try {
            String sql = "UPDATE EmployeeMaster SET isPermanent = '" + emp.getIsPermanent() + "',isPaid = '" + emp.getIsPaid() + "',isMonthly = '" + emp.getIsMonthly() + "',isMarried = '" + emp.getIsMarried() + "',"
                    + "address1 = '" + emp.getAddress1() + "',address2 = '" + emp.getAddress2() + "',address3 = '" + emp.getAddress3() + "',contact1 = '" + emp.getContact1() + "',contact2 = '" + emp.getContact2() + "',"
                    + "contact3 = '" + emp.getContact3() + "',guardianName = '" + emp.getGuardianName() + "',guardianRelation = '" + emp.getGuardianRelation() + "',guardianContact = '" + emp.getGuardianContact() + "',"
                    + "citizenship = '" + emp.getCitizenship() + "',passportNo = '" + emp.getPassportNo() + "',passportExpiratonDate = '" + emp.getPassportExpiratonDate() + "',epfNo = '" + emp.getEpfNo() + "',etfNo = '" + emp.getEtfNo() + "'"
                    + " WHERE empId = '" + emp.getEmpId() + "'";
            updated = JDBCConnector.setData(sql);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return updated;
    }
}
