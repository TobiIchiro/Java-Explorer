/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hrapp;

/**
 *
 * @author israe
 */
public class HRApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Starting Application");
        
        Department d1 = new Department("D1");
        System.out.println(d1);
        Employee e1 = new Employee(1,"A",10);
        d1.addEmployee(e1);
        Employee e2 = new Employee(2,"B",10);
        d1.addEmployee(e2);
        Employee e3 = new Employee(3,"C",10);
        d1.addEmployee(e3);
        //Locate an employee by their identification number
        /* Get every Employee in the department
        for(Employee empoyee : d1.getEmployees()) {
            System.out.println(employee);
        }*/
    }
    
}
