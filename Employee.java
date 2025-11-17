package employee;
import java.io.*;

public class Employee {
    
    //成员变量
    private String name;  // 姓名
    private int age;  // 年龄
    private double salary; //薪资
    
    //设置构造方法
    public Employee(String name){
        this.name = name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
        return age;
    }
    
     // 设置 salary 的值
    public void setSalary(double salary) {
        this.salary = salary;
    }
 
    // 获取 salary 的值
    public double getSalary() {
        return salary;
    }
 
    // 打印信息
    public void printEmployee() {
        System.out.println(this);
    }
 
    public static void main(String[] args) {
        Employee one = new Employee("zhangsan");
        one.setAge(15);
        int age = one.getAge();
        System.out.println("员工的年龄为" + age);
    }
}
