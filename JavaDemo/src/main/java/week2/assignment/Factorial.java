package week2.assignment;
public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int num = 10 ;
        System.out.println("Factorial for number "+num+" is "+factorial.getFactorial(num));
    }
    public int getFactorial(int n){
        int result = 1;
        for(int i = 1 ; i < n ; i++) {
            result = result * i;
        }
        return result;
    }
}
