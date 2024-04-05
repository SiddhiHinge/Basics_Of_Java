package week2.assignment;
public class Addition {
    public static void main(String[] args) {
        int a = 3, b = 4;
        System.out.println("Addition of "+a+" + "+b+" = "+add(a,b));
    }
    public static int add(int a,int b){
        int sum = 0;
        sum = a+b;
        return sum;
    }
}
