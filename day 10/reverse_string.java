public class reverse_string {
    
//     public static void main(String[] args) {

//         StringBuilder str = new StringBuilder("hello");

//         System.out.println(str.reverse());
//     }
    public static void main(String[] args) {

        char[] s = {'h', 'e', 'l', 'l', 'o'};

        reverse_string obj = new reverse_string();

        obj.reverseString(s);

        System.out.println(s);
    }

    public void reverseString(char[] s) {

        String rev = "";

        for (int i = s.length - 1; i >= 0; i--) {
            rev = rev + s[i];
        }

        for (int i = 0; i < s.length; i++) {
            s[i] = rev.charAt(i);
        }
    }

}