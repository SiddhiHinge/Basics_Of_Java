package week1;

public class Pattern {
    public static void main(String args[]) {
        System.out.println("Descending week1.Pattern");
        for(int i=5 ; i > 2 ; i--) { //Loop for number of rows
            int j = i;
            while(j > 0) { //Loop for number of stars to print
                System.out.print("*");
                j -= 1;
            }
            System.out.println();
        }

        System.out.println("Ascending week1.Pattern");
        for(int i=1 ; i <= 4 ; i++) { //Loop for number of rows
            int j = i;
            while(j > 0) { //Loop for number of stars to print
                System.out.print("*");
                j -= 1;
            }
            System.out.println();
        }
    }
}
