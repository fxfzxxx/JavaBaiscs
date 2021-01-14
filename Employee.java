import java.io.*;

public class Employee{
    /* 变量 */
    public static final String COMPANY = "Microsoft"; //静态变量

    /* 实例变量 */
    String name;
    int age;
    double wage;
    String title;

    // 构造器
    public Employee(String name){
        this.name = name; // 类变量name赋值
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setWage(double wage){
        this.wage = wage;
    }

    public void printEmployee(){
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Title:" + title);
        System.out.println("Wage:" + wage);
    }
}