class Sum {

    int arr[] = {10, 20, 30, 40, 50};
    int sum = 0;

    void calculate() {

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Sum = " + sum);
    }
}

public class sumofarray {

    public static void main(String[] args) {

        Sum s = new Sum();
        s.calculate();

    }
}