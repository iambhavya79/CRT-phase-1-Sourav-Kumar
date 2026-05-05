public class ParaAndArgument {

    public static int adding(int a){
        return adding(a, 2);
    }

    public static int adding(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        int result1 = adding(4);
        int result2 = adding(4, 5);

        System.out.println(result1);
        System.out.println(result2);
    }
}
