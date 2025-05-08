package CollectionFrameWork.StringExample.java;

public class Reverse {
    public static void main(String[] args) {
        String str = "sathish kumar hello";
        String str1[] = str.split(" ");
        for (int i = 0; i < str1.length; i++) {
            str1[i] = stringReverse(str1[i]);
        }
        for (int i = 0; i < str1.length; i++) {
            System.out.print(str1[i] + " ");
        }
    }

    public static String stringReverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
