/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author hrox
 */
public class EmployeeDetails {

//company
    private int empId;
    private String epfNo;
    private String etfNo;
    private String firstAppointmentDate;
    private int isPermanent;
    private int isPaid;
    private int isMonthly;

//general
    private String empName;
    private String nic;
    private String gender;
    private String dob;
    private int isMarried;

//contact
    private String address1;
    private String address2;
    private String address3;
    private String contact1;
    private String contact2;
    private String contact3;
    private String guardianName;
    private String guardianRelation;
    private String guardianContact;

//other
    private String citizenship;
    private String passportNo;
    private String passportExpiratonDate;

//availability
    private int isActive;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEpfNo() {
        return epfNo;
    }

    public void setEpfNo(String epfNo) {
        this.epfNo = epfNo;
    }

    public String getEtfNo() {
        return etfNo;
    }

    public void setEtfNo(String etfNo) {
        this.etfNo = etfNo;
    }

    public String getFirstAppointmentDate() {
        return firstAppointmentDate;
    }

    public void setFirstAppointmentDate(String firstAppointmentDate) {
        this.firstAppointmentDate = firstAppointmentDate;
    }

        public int getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(int isPaid) {
        this.isPaid = isPaid;
    }

    public int getIsMonthly() {
        return isMonthly;
    }

    public void setIsMonthly(int isMonthly) {
        this.isMonthly = isMonthly;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getIsMarried() {
        return isMarried;
    }

    public void setIsMarried(int isMarried) {
        this.isMarried = isMarried;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getContact1() {
        return contact1;
    }

    public void setContact1(String contact1) {
        this.contact1 = contact1;
    }

    public String getContact2() {
        return contact2;
    }

    public void setContact2(String contact2) {
        this.contact2 = contact2;
    }

    public String getContact3() {
        return contact3;
    }

    public void setContact3(String contact3) {
        this.contact3 = contact3;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getGuardianRelation() {
        return guardianRelation;
    }

    public void setGuardianRelation(String guardianRelation) {
        this.guardianRelation = guardianRelation;
    }

    public String getGuardianContact() {
        return guardianContact;
    }

    public void setGuardianContact(String guardianContact) {
        this.guardianContact = guardianContact;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public String getPassportExpiratonDate() {
        return passportExpiratonDate;
    }

    public void setPassportExpiratonDate(String passportExpiratonDate) {
        this.passportExpiratonDate = passportExpiratonDate;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public int getIsPermanent() {
        return isPermanent;
    }

    public void setIsPermanent(int isPermanent) {
        this.isPermanent = isPermanent;
    }

   }
