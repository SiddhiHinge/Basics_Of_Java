package week3.collectionDemo;

import week3.interfaceDemo.Apple;

import java.util.*;

public class Storage {
    public static void main(String[] args) {
        Storage s = new Storage();
        System.out.println("Array List of Guests");
        s.arrayList();
        System.out.println("Set of numbers");
        s.hashset();
        System.out.println("HashMap of Students");
        s.map();
    }
    public void arrayList(){
        List<String> guestList = new ArrayList<String>();
        guestList.add("Harry");
        guestList.add("Ron");
        guestList.add("Harmione");
        guestList.add("Harry");

        for(String guest : guestList){
            System.out.println(guest);
        }
    }
    public void hashset(){
        Set<Integer> numbers = new HashSet<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);

        for(int num : numbers){
            System.out.println(num);
        }
    }
    public void map(){
        Map<Integer,String> students = new HashMap<Integer,String>();
        students.put(1,"Harry");
        students.put(2,"Ron");
        students.put(3,"Harmione");
        students.put(3,"Ron");

        for(int key : students.keySet()){
            System.out.println(students.get(key));
        }
    }
}

/*If declare a collection of array like this then any type of variable will be added which is not right
        hence we have to use generics to specify which type of data will the collection hold
        ArrayList guestList = new ArrayList();
        guestList.add(1);
        guestList.add("Siddhi");
        guestList.add(true);
        guestList.add(new Apple());*/