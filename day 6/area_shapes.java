public class area_shapes {
    public static void main(String[] args) {
        area a1 = new area("reactangle",10 ,5);
        area a2 = new area("square",5);
        area a3 = new area ("circle",4.2f);
        System.out.println("the shape is : " + a1.name);
        System.out.println("the area is : "+ a1.area);
        System.out.println("the shape is : " + a2.name);
        System.out.println("the area is : "+ a2.area);
        System.out.println("the shape is : " + a3.name);
        System.out.println("the area is : "+ a3.area);
    }
}
class area{
    String name ;
    int length ; 
    int width ; 
    float area;
    int side ; 
    float rad;

    area(String name , int length , int width){
        this.name = name;
        this.length = length;
        this.width = width;

        area = length * width ;

    }
    area(String name , int side){
        this.name = name;
        this.side = side;
        
        area = side * side ;
    }
    area(String name ,float rad ){
        this.name = name;
        this.rad = rad;

        area = 3.14f * rad * rad ;
    }
}

