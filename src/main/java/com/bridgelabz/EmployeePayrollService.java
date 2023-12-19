package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    static List<Employee> EmployeeList = new ArrayList<>();

    public static void ReadEmployeeData(Scanner sc){
        System.out.println("Enter Employee id");
        int id = sc.nextInt();
        System.out.println("Enter Employee Name");
        String name = sc.next();
        System.out.println("Enter Employee salary");
        int salary = sc.nextInt();
        EmployeeList.add(new Employee(id,name,salary));
    }

    public static void WriteEmployeeData(){
        System.out.println("Writing Employee payroll to console" + EmployeeList);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeePayrollService.ReadEmployeeData(sc);
        EmployeePayrollService.WriteEmployeeData();
    }
}
