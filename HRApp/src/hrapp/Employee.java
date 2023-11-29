/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hrapp;

/**
 *
 * @author israe
 */
public class Employee {
    private int identification;
    private String name;
    private double salary;
    
    public Employee() {
        
    }
    
    public Employee(int identification, String name, double salary) {
        setIdentification(identification);
        setName(name);
        setSalary(salary);
    }

    public int getIdentification() {
        return identification;
    }

    public void setIdentification(int identification) {
        this.identification = identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return identification + "," + name + "," + salary;
    }
    
}
