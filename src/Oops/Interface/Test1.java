package Oops.Interface;
//marker interface - blank interface
//functional interface - only one method
interface Inter1{
    int x = 112; // public static final
    void method1(); //public abstract
}
interface Inter2{
    int x = 115; // public static final
    void method2(); //public abstract
}
public class Test1 implements Inter1,Inter2{
    public static void main(String[] args){
        System.out.println("Main Entry Point");
    }
    public void method1(){
        System.out.println("This is my method");
        System.out.println(Inter1.x);
        int x = 113;
        System.out.println(x);
    }
    public void method2(){
        System.out.println("This is my method");
        System.out.println(Inter2.x);
        int x = 113;
        System.out.println(x);
    }
}
