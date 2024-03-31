package week1;

public class SquareCube {
    public static void main(String Args[]) {
        System.out.println("Square of numbers 2 , 3 is "+calculate(2,3,"Square"));
        System.out.println("Cube of numbers 2 , 3 is "+calculate(2,3,"Cube"));
        System.out.println("Cube of numbers 2 , 3 is "+calculate(2,3,"calc"));
    }
    public static int calculate(int a, int b, String calcType){
        int result = 0;
        if(calcType=="Square"){
            result = (a*a)+(b*b)+(2*a*b);
        }
        else if(calcType=="Cube"){
            result = (a*a*a)+(b*b*b)+(3*a*a*b)+(3*a*b*b);
        }
        else {
            System.out.println("Give valid calculation type !");
        }
        return result;
    }
}
