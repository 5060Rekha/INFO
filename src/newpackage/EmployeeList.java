/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.util.ArrayList;

/**
 *
 * @author sajja
 */
public class EmployeeList {
    
    private ArrayList<NewClass> employeeList;

    public EmployeeList() {
       employeeList = new ArrayList<>();
    }
    
    public void addEmployee(NewClass newClass){
       employeeList.add(newClass);
    }

    public ArrayList<NewClass> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<NewClass> employeeList) {
        this.employeeList = employeeList;
    }
    
    public ArrayList<NewClass> searchType(String type, String value, ArrayList<NewClass> empList)
    {
       ArrayList<NewClass> filteredList = new ArrayList<>();
      
       if(type.equalsIgnoreCase("name")){
        for(NewClass emp: empList){
           if(emp.getName().equals(value)){
               filteredList.add(emp);
           }
        } 
       } else if(type.equalsIgnoreCase("eid")){
        for(NewClass emp: empList){
           if(String.valueOf(emp.getEID()).equals(value)){
               filteredList.add(emp);
           }
        } 
       }else if(type.equalsIgnoreCase("gender")){
        for(NewClass emp: empList){
           if(emp.getGender().equalsIgnoreCase(value)){
               filteredList.add(emp);
           }
        } 
       }else{
        return filteredList;
       }
        return filteredList;
    }
    
    
    
    
    
}
