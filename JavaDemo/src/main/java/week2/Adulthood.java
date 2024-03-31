package week2;

public class Adulthood {
    public static void main(String args[]) {
        Adulthood adult1 = new Adulthood();
        System.out.println("You lived as adult for " + adult1.adultLife("Siddhi",25)+" years");
    }

    public int adultLife(String name, int age){
        System.out.println("Name : "+name+", Age : "+age);
        int adult_yrs;
        adult_yrs = age-18;
        return adult_yrs;
    }
}
