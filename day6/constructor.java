public class constructor {
     public static void main(String[] args) {

        Student s1 = new Student("Sachin", 23);

        System.out.println(s1.name);
        System.out.println(s1.rollno);
    }
}

class Student {

    String name;
    int rollno;

    Student(String n, int r) {
        name = n;
        rollno = r;
    }
}
