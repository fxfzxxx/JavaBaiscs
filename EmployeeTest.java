import java.io.*;

public class EmployeeTest {
    // Creat Object
    public static void main(String[] args) {
        Employee empAlex = new Employee("Alex");
        // Employee empSam = new Employee("Sam");
        
        System.out.println(Employee.COMPANY); // 通过 类.静态变量 直接输出值 
        empAlex.setAge(26);
        empAlex.name = "Alex ";
        empAlex.title = "Engineer"; //直接定义变量
        empAlex.setTitle("Engineer");//通过方法赋值
        empAlex.setWage(26.44);
        empAlex.printEmployee();

    }


}
