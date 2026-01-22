
package P1;
import java.util.Scanner;
public class Employee {
    int nEmp=100;
    String sName;
    long nSal;
    Employee(int nEmp){
        this.nEmp = nEmp;
    }
    void nCalcIncomeTax(long nSal){
        System.out.println("return income tax");
    }

    public static void main(String[] args){
        Employee e1 = new Employee(567);
        e1.sName = "Shubham";
        e1.nCalcIncomeTax(13400);
        System.out.println("e1 employee Id is " + e1.nEmp);
        System.out.println("e1 employee name is " + e1.sName);
//        Employee e2 = new Employee();
//        e2.nEmp = 1235;
//        e2.sName = "Shivam";
//        Employee e3 = new Employee();
//        e3.nEmp = 1236;
//        e3.sName = "Sarvesh";
//        Employee[] e = new Employee[10];
//        for(int i = 0;i < e.length;i++){
//            e[i] = new Employee();
//        }
    }
}
