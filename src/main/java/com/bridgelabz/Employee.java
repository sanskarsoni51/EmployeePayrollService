package com.bridgelabz;

public class Employee {

    private int EmpId;
    private String Name;
    private int Salary;

    @Override
    public String toString() {
        return "Employee{" +
                "EmpId=" + EmpId +
                ", Name='" + Name + '\'' +
                ", Salary=" + Salary +
                '}';
    }

    public Employee(int empId, String name, int salary) {
        EmpId = empId;
        Name = name;
        Salary = salary;
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}
