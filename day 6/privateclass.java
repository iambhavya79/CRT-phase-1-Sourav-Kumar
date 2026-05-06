public class privateclass {

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
        s1.studentregino(239090);
        System.out.println("the registration no is : " + s1.getregi());
    } 
    
}
class student{
    private int regi;
    public int rollno;
    public String name;
    void studentrollno(int setrollno){
    rollno = setrollno;
    
    }
    void studentname(String setname){
        name = setname;
    
    }
    void studentregino(int setregino){
        regi = setregino;
    }
    int getregi(){
        return regi;
    }
}




