/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employees;

import Extension.ObjectPlus;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 *
 * @author samum
 */
public class Employee extends ObjectPlus{
    private String EmployeeID;
    private String FirstName;
    private String LastName;
    private String phone;

    private static Set<Employee> employees = new HashSet<>();
    private static EmployeeType employeeType;


    public Employee(String firstName, String lastName, String phone, EmployeeType employeeType) throws Exception{
        this.FirstName = firstName;
        this.LastName = lastName;
        this.phone = phone;
        setEmployeeType(employeeType);
        EmployeeID = UUID.randomUUID().toString();
        employees.add(this);
    }




    public void setEmployeeType(EmployeeType employeesType){
        if(employeesType != null){
            this.employeeType = employeesType;
        }
    }



    public String toString(){
        return FirstName + " " + LastName;
    }

}
