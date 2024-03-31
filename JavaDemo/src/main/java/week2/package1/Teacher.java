package week2.package1;

public class Teacher {
    int a; //default will be the access modifier
    private int b;
    public int c;
    protected int d;
    Student s1 = new Student(); //Student is default class but part of same package hence this line of code is valid
    public void method1() {
        System.out.println("method1() is public , Teacher class is public");
    }
    private void method2() {
        System.out.println("method1() is private , Teacher class is public");
    }
    protected void method3() {
        System.out.println("method1() is protected , Teacher class is public");
    }
    void method4() {
        System.out.println("method1() is default , Teacher class is public");
    }
}
