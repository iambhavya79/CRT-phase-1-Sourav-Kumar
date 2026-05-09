import java.util.Scanner;

public class array2 {
    
    public static void main(String[] args) {

        int[] arr = new int[5];

        Scanner sc = new Scanner(System.in);

        
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

