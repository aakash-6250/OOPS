package com.ClassAndObject;

public class Main {
    public static void main(String[] args) {
        Employee employee1=new Employee("Aakash Pate",1);
        Employee employee2=new Employee("Manish Suryavanshi",2);

        System.out.println("Employee1 Name : "+employee1.getEmployeeName());
        System.out.println("Employee1 id : "+employee1.getEmployeeId());
        System.out.println("Employee2 Name : "+employee2.getEmployeeName());
        System.out.println("Employee2 id : "+employee2.getEmployeeId());
    }
}
