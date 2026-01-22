package P1;

class Employee1 {
    String name;
    double salary;
    Employee1(String name ,double salary){
        this.name = name;
        this.salary = salary;
    }
    void show(){
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}
class Manager extends Employee1{
    String dpt;
    Manager(String name, double salary, String dpt){
        super(name ,salary);
        this.dpt = dpt;
    }
    void show(){
        super.show();
        System.out.println("Department : " + dpt);
    }
}

public class Super5{
    public static void main(String[] args){
        Manager manager = new Manager("Shubham",97562,"frontend");
        manager.show();
    }
}
