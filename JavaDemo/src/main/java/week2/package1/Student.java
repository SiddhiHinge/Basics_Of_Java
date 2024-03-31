package week2.package1;

class Student {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.a = 10;
        //t1.b = 11; Cannot access as it is private
        t1.c = 12;
        t1.d = 13;
    }
}
