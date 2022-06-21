/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package New;

import java.util.Scanner;

public class Employee {
    private String ID,Name;
    private float Salary;
    
    public Employee(){}

    public Employee(String ID, String Name, float Salary) {
        this.ID = ID;
        this.Name = Name;
        this.Salary = Salary;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public float getSalary() {
        return Salary;
    }

    public void setSalary(float Salary) {
        this.Salary = Salary;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        ID = sc.next();
        System.out.print("Enter Name: ");
        Name = sc.next();
        System.out.print("Enter Salary: ");
        Salary = sc.nextFloat();
    }
    
    @Override
    public String toString() {
        return "Employee{" + "ID=" + ID + ", Name=" + Name + ", Salary=" + Salary + '}';
    }
    
    
}
