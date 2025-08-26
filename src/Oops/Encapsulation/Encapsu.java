package Oops.Encapsulation;

import java.lang.reflect.Field;

class Employee{
    private double salary = 1000;
    private String name;
    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }



    public void setSalary(double salary) {
        if(salary >= 0) {
            this.salary = salary;
        }else{
            System.out.println("Invalid Amount");
        }
    }

    public void setName(String name) {
        this.name = name;
    }


}
public class Encapsu {
    public static void main(String[] args) throws Exception{
        System.out.println("Hello");
        Employee emp = new Employee();
//        Field fsalary = Employee.class.getDeclaredField("salary");
//        fsalary.setAccessible(true);
//        System.out.println(fsalary.get(emp))
        System.out.println(emp.getSalary());
    }
}
