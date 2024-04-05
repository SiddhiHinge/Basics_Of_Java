package week2.assignment;
public class GreatestNumber {
    public static void main(String[] args) {
        GreatestNumber greatestNumber = new GreatestNumber();
        int a,b,c;
        a=2; b=2 ; c=5;
        System.out.println("Greatest Number of "+a+","+b+","+c+" : "+greatestNumber.find_greatest_number(a,b,c));
    }
    public int find_greatest_number(int a, int b, int c){
        int greatestNum = 0;
        if(a > b && a > c) {
            greatestNum = a;
        }
        else if (b > a && b > c){
            greatestNum = b;
        }
        else if (c > a && c > b){
            greatestNum = c;
        }
        else {
            System.out.println("Could not find !");
        }
        return greatestNum;
    }
}
