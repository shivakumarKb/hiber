package com.mccoy;

public class EmployeeService {
    public static void main(String[] args) {
        
        EmployeeDAO empDAO = new EmployeeDAO();
        
        Employee createEmp1 = new Employee(1, "Sachin","R&D");
        Employee createEmp2 = new Employee(3, "shivakumar","R&D22");
        empDAO.insert(createEmp1);//Create
        empDAO.insert(createEmp2);//Create
        
        Employee readEmp = empDAO.get(1);//Read        
        System.out.println(readEmp);
        
        Employee updateEmp = new Employee(1,"Sachin Tendulkar","R&D");        
        empDAO.update(updateEmp);//Update
        
      //  empDAO.delete(2); //Delete
                
    }
}
 