package Oop_1;


public class StaticKeyword {
    void greeting() {
        System.out.println("Hello World");
        greet();
    }
    void greet(){
//        greeting();
        System.out.println("this is another method");
    }

   static void fun() {
        StaticKeyword obj=new StaticKeyword();
        obj.greeting();
        System.out.println("This is static");
    }
    public static void main(String[] args) {
        StaticKeyword obj=new StaticKeyword();
         fun();
        obj.greeting();
//        obj.greet();
    }
    }
