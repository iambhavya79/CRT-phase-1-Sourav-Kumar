import java.util.Scanner;

public class coffeshot {

    public static int Shots(int cof) {
        int volumetotal = cof * 30;
        return volumetotal;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of coffee shots: ");
            int cof = sc.nextInt();

            int result = Shots(cof);
            System.out.println("Total coffee volume = " + result + " ml");
        }
    }
}
