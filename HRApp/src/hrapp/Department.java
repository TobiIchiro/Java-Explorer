/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hrapp;

/**
 *
 * @author israe
 */
public class Department {
    private String name;
    private Employee[] employees = new Employee[10];
    private static int employeeCount;
    
    public Department(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addEmployee(Employee employee){
        if(employeeCount < employees.length) {
            employees[employeeCount] = employee;
            employeeCount++;
        }
        else System.out.println("Department is at max capacity");
    }
    public Employee[] getEmployees() {
        Employee[] employees = new Employee[employeeCount];
        int i = 0;
        for(Employee employee : this.employees) {
            if(!(employee == null)) {
                employees[i] = employee;
            }
        }
        return employees;
    }
    public int getEmployeesQuantity() {
        return employeeCount;
    }
    
    public Employee getEmployee(int id) {
        for (Employee employee : employees) {
            if (employee.getIdentification() == id) return employee;
        }
        return null;
    }
    
    public double getTotalSalary() {
        double totalSalary = 0.0;
        for(Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }
    
    public double getAverageSalary() {
        double totalSalary = 0.0;
        for(Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary/employeeCount;
    }
    
    @Override
    public String toString() {
        return "Department: " + name;
    }
}
