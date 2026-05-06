public class classandobj {
    public static void main(String[] args) {
        student s1 = new student();
        s1.studentrollno(23);
        System.out.println("the roll no is : "+s1.rollno);
        s1.studentname("sachin");
        System.out.println("the name of the student is :"+s1.name);
        s1.studentrollno(24);
        System.out.println("the roll no is : "+s1.rollno);
        s1.studentname("amit");
        System.out.println("the name of the student is :"+s1.name);
    } 
}
class student{
    int rollno;
    String name;
    void studentrollno(int setrollno){
    rollno = setrollno;
    
    }
    void studentname(String setname){
        name = setname;
    
    }
}

