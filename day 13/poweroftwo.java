import java.util.Scanner;
public class poweroftwo {
    

    public static boolean isPowerOfTwo(int n) {

        if (n > 0 && (n & (n - 1)) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter number: ");
            int n = sc.nextInt();

            System.out.println(isPowerOfTwo(n));
        }
    }
}