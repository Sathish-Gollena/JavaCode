package CollectionFrameWork.Strings;

public class UpperCase {

    public static void main(String args[]) {
        /*
         * 
         * nt c = 97;
         * har b = (char) c;
         * ystem.out.println(b);
         * har k = (char) (b
         * * - 32);
         * System.out.println(k);
         */

        String str = "sathish";
        String str1 = "";
        char ch[] = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            ch[i] = (char) (ch[i] - 32);

        }
        System.out.println(ch);

    }
}
