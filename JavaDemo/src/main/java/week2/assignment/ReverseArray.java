package week2.assignment;
public class ReverseArray {
    public static void main(String[] args) {
        ReverseArray array = new ReverseArray();
        int[] example1 = {54,43,2,1,5};
        int[] example2 = {324,5,2,2};
        array.reverseOrder(example1);
        System.out.println();
        array.reverseOrder(example2);
    }
    public void reverseOrder(int[] numbers){
        for(int i = numbers.length-1; i >= 0; i--) {
            System.out.print(numbers[i]);
            System.out.print(" ");
        }
    }
    public void printArray(int[] numbers){
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            System.out.print(" ");
        }
    }
}
