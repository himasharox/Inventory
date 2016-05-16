/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbaccess;

import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import models.EmployeeDetails;
import utilities.JDBCConnector;

/**
 *
 * @author hrox
 */
public class DBGetter {

    public static int getNextEmployeeId() {

        int nextId = 0;

        try {
            String sql = "SELECT IFNULL(MAX(empId),0) id FROM EmployeeMaster";
            ResultSet rs = JDBCConnector.getData(sql);

            while (rs.next()) {
                nextId = rs.getInt("id") + 1;
            }

            if (rs != null) {
                rs.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nextId;
    }

    public static void getIdNamesToList(JList jl, int type, String prefix) {

        //type -> 1 = Employee
        try {
            String sql = "";

            if (type == 1) {
                sql = "SELECT empId id, empName name FROM EmployeeMaster WHERE empName LIKE '" + prefix + "%' AND isActive = 1";
            }

            ResultSet rs = JDBCConnector.getData(sql);
            DefaultListModel lm = new DefaultListModel();
            lm.removeAllElements();

            while (rs.next()) {
                lm.addElement(rs.getInt("id") + "-" + rs.getString("name"));
            }

            jl.setModel(lm);

            if (rs != null) {
                rs.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static EmployeeDetails getEmployeeDetailsFromId(int id) {

        EmployeeDetails emp = new EmployeeDetails();

        try {
            String sql = "SELECT * FROM EmployeeMaster WHERE empId = '" + id + "'";
            ResultSet rs = JDBCConnector.getData(sql);
            
            while(rs.next()){
                emp.setEmpId(id);
                emp.setAddress1(rs.getString("address1"));
                emp.setAddress2(rs.getString("address2"));
                emp.setAddress3(rs.getString("address3"));
                emp.setCitizenship(rs.getString("citizenship"));
                emp.setContact1(rs.getString("contact1"));
                emp.setContact2(rs.getString("contact2"));
                emp.setContact3(rs.getString("contact3"));
                emp.setDob(rs.getString("dob"));
                emp.setEmpName(rs.getString("empName"));
                emp.setEpfNo(rs.getString("epfNo"));
                emp.setEtfNo(rs.getString("etfNo"));
                emp.setFirstAppointmentDate(rs.getString("firstAppointmentDate"));
                emp.setGender(rs.getString("gender"));
                emp.setGuardianContact(rs.getString("guardianContact"));
                emp.setGuardianName(rs.getString("guardianName"));
                emp.setGuardianRelation(rs.getString("guardianRelation"));
                emp.setIsMarried(rs.getInt("isMarried"));
                emp.setIsMonthly(rs.getInt("isMonthly"));
                emp.setIsPaid(rs.getInt("isPaid"));
                emp.setIsPermanent(rs.getInt("isPermanent"));
                emp.setNic(rs.getString("nic"));
                emp.setPassportExpiratonDate(rs.getString("passportExpiratonDate"));
                emp.setPassportNo(rs.getString("passportNo"));
            }
            
            if (rs != null) {
                rs.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return emp;
    }
}
