/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pbopert8_9.mainperson;

/**
 *
 * @author A S U S
 */
public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person("Salma Shakira Nurul Azmi", "123 College SBS", "333-9876", "salma@example.com");
        Student student = new Student("Bian", "456 Grand Tulip", "777-2345", "bian@example.com", Student.SENIOR);
        MyDate hireDate = new MyDate(2022, 8, 9);
        Employee employee = new Employee("Ajeng Fauziah", "655 Office Raise", "888-7627", "ajeng@example.com", "Office 432", 8700000.0, hireDate);
        Faculty faculty = new Faculty("Syifa Azara", "876 Corporate Course", "555-7354", "syifa@example.com", "Office 987", 8500000.0, hireDate, "7 Jam", "Dosen");
        Staff staff = new Staff("Almira Syarafana", "987 Delara STG", "555-7654", "almira@example.com", "Office 321", 3300000.0, hireDate, "Manager");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
