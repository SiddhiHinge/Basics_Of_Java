package week2.oopsconcepts;

public class Polymorphism {
    public void method() {
        System.out.println("Method does not hold parameters");
    }
    public void method(String str) {
        System.out.println("Method has String : "+str);
    }
    public void method(int num) {
        System.out.println("Method has Number : "+num);
    }
}
