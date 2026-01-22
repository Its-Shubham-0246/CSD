package P1;

public class Student {
    //Attributes == Properties == state == variable
    String name;
    long roll_no;
    String branch = "CS";
    char section = 'D';
    int[] marks = new int[5];

    //Methods = funtions in C == procedure
    public void checkResult(){
        System.out.println("Hello");

    }
    public static void main(String[] args){
        //creating an Object
        //demons process runs in backgroud
        Student st1 = new Student();
        Student st2 = new Student();
        st1.name = "Shubham";
        st2.name = "Shivam";
        st2.roll_no = 12345;
        System.out.println("1st student name is :" + st1.name);
        Student[] student = new Student[73];
        student[0].name = "Shubham";
        student[0].roll_no = 1;
        student[0].marks[0] = 89;
        student[0].marks[1] = 98;
        student[0].marks[2] = 88;
        student[0].marks[3] = 93;
        student[0].marks[4] = 99;
    }
}
