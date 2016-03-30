/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lorengie.logic;

/**
 * Class employee
 * @author Asus
 */
public class Employee {
    private String EmployeeCode; /**Employee code*/
    private String EmployeePosition; /**Employee position*/
    private String EmployeeName; /**Employee name*/
    private int employeeIdentification; /**Employee identification*/

        /**
         * Default constructor
         */
    public Employee() {
    }
    
    /**
     * 
     * @param EmployeeCode employee code
     * @param EmployeePosition employee position
     * @param EmployeeName employee name
     * @param employeeIdentification employee identification
     */
    public Employee(String EmployeeCode, String EmployeePosition, String EmployeeName, int employeeIdentification) {
        this.EmployeeCode = EmployeeCode;
        this.EmployeePosition = EmployeePosition;
        this.EmployeeName = EmployeeName;
        this.employeeIdentification = employeeIdentification;
    }
    /**
     * Get employee code
     * @return employee code
     */
    public String getEmployeeCode() {
        return EmployeeCode;
    }
    /**
     * Set employee code
     * @param EmployeeCode employee code
     */
    public void setEmployeeCode(String EmployeeCode) {
        this.EmployeeCode = EmployeeCode;
    }
    /**
     * Get employee position
     * @return employee position
     */
    public String getEmployeePosition() {
        return EmployeePosition;
    }
    /**
     * Set employee position
     * @param EmployeePosition employee position
     */

    public void setEmployeePosition(String EmployeePosition) {
        this.EmployeePosition = EmployeePosition;
    }
    /**
     * Get employee name
     * @return employee name
     */

    public String getEmployeeName() {
        return EmployeeName;
    }
    /**
     * Set employee name
     * @param EmployeeName employee name
     */
    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }
    /**
     * Get employee identification
     * @return employee identification
     */
    public int getEmployeeIdentification() {
        return employeeIdentification;
    }
    /**
     * Set employee identification
     * @param employeeIdentification employee identification
     */
    public void setEmployeeIdentification(int employeeIdentification) {
        this.employeeIdentification = employeeIdentification;
    }
    
    
    
}
