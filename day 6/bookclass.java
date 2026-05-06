public class bookclass {
    public static void main(String[] args) {
     Book b1 = new Book();
     b1.getbook("david malans life");
     System.out.println(b1.name);
     b1.getbook(599);
     System.out.println(b1.cost);
    }
}
class Book{
    String name ; 
    int cost ; 

    void getbook(String newName){
        name = newName;

    }
    void getbook(int newCost){
        cost = newCost;

    }
}
