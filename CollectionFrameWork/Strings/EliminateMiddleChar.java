import java.util.*;

public class EliminateMiddleChar {
    public static void main(String[] args) {

        String str = "SarkSurssr";
        char[] ch1 = str.toCharArray();
        int n = ch1.length;
        List<Character> ch = new ArrayList<>();
        for (int i = 0; i < ch1.length; i++) {
            if (i < n - 2) {
                if ((ch1[i] == 's' || ch1[i] == 'S') && (ch1[i + 2] == 'r' || ch1[i + 2] == 'R')) {
                    ch.add(ch1[i]);
                    ch.add(ch1[i + 2]);
                    i = i + 2;
                } else {
                    ch.add(ch1[i]);
                }
            } else {
                ch.add(ch1[i]);
            }
        }

        for (int i = 0; i < ch.size(); i++) {
            System.out.print(ch.get(i));
        }
    }
}
