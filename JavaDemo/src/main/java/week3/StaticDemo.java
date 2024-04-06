package week3;

public class StaticDemo {
    public static int a = 10;
    public int b = 20;

    public static void main(String[] args) {

        System.out.println(a);
        /*System.out.println(b);// non static variables cannot be accessed in static method
        m1();// non static method cannot be accessed in static method*/
        StaticDemo d = new StaticDemo(); //non static method can be accessed in static method using the object of class
        d.m1();
        m2();
    }

    public void m1() { //non static method can access non static & static variables & methods
        System.out.println(a);
        System.out.println(b);
        m2();
    }
    public static void m2(){
        System.out.println("This is static method..");
    }
}
