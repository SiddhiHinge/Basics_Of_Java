package week1;

public class ForLoop {
    public static void main(String[] args){
        System.out.println("For Loop");
        for(int i=1; i<=100 ; i++) {
            if(i%2 == 0){
                System.out.println("Even number : "+i);
            }
        }
        System.out.println("While Loop");
        int j=2;
        while(j<=100) {
            System.out.println("Even number : "+j);
            j+=2;
        }
    }
}
