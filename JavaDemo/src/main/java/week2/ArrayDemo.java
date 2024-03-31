package week2;
public class ArrayDemo {
    public static void main(String args[]){
        String[] names = new String[5];
        ArrayDemo obj = new ArrayDemo();
        obj.setNames(names);
        obj.printArray(names);
    }

    public void setNames(String[] names) {
        names[0] = "Harry";
        names[1] = "Ron";
        names[2] = "Harmione";
        names[3] = "Draco";
        names[4] = "Hagrid";
    }

    public void printArray(String[] names) {
        for(int i=0 ; i <names.length ; i++){
            System.out.println(names[i]);
        }
    }
}
