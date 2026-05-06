// write a function that apply 10% discount 
// references update the original bill  amout

 public class discount {

    public static void applyDiscount(double[] bill){
        bill[0] = bill[0] - (bill[0] * 0.10);
    }

    public static void main(String[] args) {
        double[] bill = {1000};

        applyDiscount(bill);

        System.out.println(bill[0]);
    }
}
