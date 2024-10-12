package Oop_1;

public class Class_And_Object {
    public static void main(String[] args) {
        Student std=new Student(10,"Rohan",80.0f);
        System.out.println(std);
    }
}
class Student{
    int rno;
    String name;
    float marks;
    Student() {
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }

    Student(int roll, String name, float marks){
        this.rno=roll;
        this.name=name;
        this.marks=marks;
    }
}

