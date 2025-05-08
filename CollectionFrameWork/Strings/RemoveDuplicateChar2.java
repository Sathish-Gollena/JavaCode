import java.util.*;

public class RemoveDuplicateChar2 {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        String str = "sathish";
        for (int i = 0; i < str.length(); i++) {
            if (!list.contains(str.charAt(i))) {
                list.add(str.charAt(i));
            }
        }
        String str1 = "";
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)); // list.get(i);
        }
        // System.out.println(str1);
    }
}
