package week2.assignment;

public class DecreasingOrder {
    public static void main(String[] args) {
        DecreasingOrder decreasingOrder = new DecreasingOrder();
        int x = 3;
        decreasingOrder.decreasingOrder(x);
    }
    public void decreasingOrder(int startPoint){
        if(startPoint > 0) {
            System.out.println("Decreasing Order : ");
            for (int i = startPoint; i >= 0; i--) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
        else {
            System.out.println("Input number must be greater than 0 !");
        }
    }
}
