package Oops.Interface;
abstract class Student{
    String name;
    int rollNo;
    Student(String name,int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
    void showDetails(){
        System.out.println("Name: "+ name + ", RollNo: "  +rollNo);
    }
    abstract void study();
}
interface Sports{
    void playSport();
}
interface Music{
    void playInstrument();
}
interface Coding{
    void writeCode();
}
class EngineeringStudent extends Student implements Coding{

    EngineeringStudent(String name, int rollNo) {
        super(name, rollNo);
    }
    @Override
    public void writeCode() {
        System.out.println("Write Code");
    }

    @Override
    void study() {
        System.out.println("study Coding");
    }
}
class ArtStudent extends Student implements Music{

    ArtStudent(String name, int rollNo) {
        super(name, rollNo);
    }

    @Override
    public void playInstrument() {
        System.out.println("Play Instrument");
    }

    @Override
    void study() {
        System.out.println("Study Arts");
    }
}
class SchoolStudent extends Student implements Sports{

    SchoolStudent(String name, int rollNo) {
        super(name, rollNo);
    }

    @Override
    public void playSport() {
        System.out.println("Play Sport");
    }

    @Override
    void study() {
        System.out.println("Study - Mathematics,Science,Chemistry");
    }
}
public class Test6 {
    public static void main(String[] args){
        EngineeringStudent s1 = new EngineeringStudent("Shubham",132);
        ArtStudent s2 = new ArtStudent("Sarvesh",243);
        SchoolStudent s3 = new SchoolStudent("Manish",354);
        s1.study();
        s1.writeCode();

        s2.study();
        s2.playInstrument();

        s3.study();
        s3.playSport();
    }
}
