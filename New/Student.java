/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package New;

import java.util.Scanner;

/**
 *
 * @author sneak
 */
public class Student {
    private String ID,Name;
    private int age;

    public Student(){}
    
    public Student(String ID, String Name, int age) {
        this.ID = ID;
        this.Name = Name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        ID = sc.next();
        System.out.print("Enter Name: ");
        Name = sc.next();
        System.out.print("Enter Salary: ");
        age = sc.nextInt();
    }
    
    @Override
    public String toString() {
        return "Student{" + "ID=" + ID + ", Name=" + Name + ", age=" + age + '}';
    }
    
    
}
