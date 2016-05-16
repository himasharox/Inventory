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
public class DBInserter {

    public static boolean insertEmployeeMaster(EmployeeDetails ed) {

        boolean inserted = false;

        try {
            String sql = "INSERT INTO EmployeeMaster"
                    + "(empId,epfNo,etfNo,firstAppointmentDate,isPermanent,isPaid,isMonthly,"
                    + "empName,nic,gender,dob,isMarried,"
                    + "address1,address2,address3,contact1,contact2,contact3,guardianName,guardianRelation,guardianContact,"
                    + "citizenship,passportNo,passportExpiratonDate,"
                    + "isActive) "
                    + "VALUES('" + ed.getEmpId() + "','" + ed.getEpfNo() + "','" + ed.getEtfNo() + "','" + ed.getFirstAppointmentDate() + "','" + ed.getIsPermanent()+ "','" + ed.getIsPaid() + "','" + ed.getIsMonthly() + "',"
                    + "'" + ed.getEmpName() + "','" + ed.getNic() + "','" + ed.getGender() + "','" + ed.getDob() + "','" + ed.getIsMarried() + "',"
                    + "'" + ed.getAddress1() + "','" + ed.getAddress2() + "','" + ed.getAddress3() + "','" + ed.getContact1() + "','" + ed.getContact2() + "','" + ed.getContact3() + "','" + ed.getGuardianName() + "','" + ed.getGuardianRelation() + "','" + ed.getGuardianContact() + "',"
                    + "'" + ed.getCitizenship() + "','" + ed.getPassportNo() + "','" + ed.getPassportExpiratonDate() + "',"
                    + "'" + ed.getIsActive() + "')";
            inserted = JDBCConnector.setData(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return inserted;
    }

}
