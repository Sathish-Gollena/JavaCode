package CollectionFrameWork.Strings;

public class Str_2 {
    public static void main(String[] args) {
        String[] arr = { "apple", "abcde" };
        System.out.println(Sathish(arr));
    }

    public static String Sathish(String arr[]) {
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i].toLowerCase();
            if (first(s) && last(s)) {
                str += s + " ";
            }
        }
        return str;
    }

    public static boolean first(String s) {
        char c = s.charAt(0);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }

    public static boolean last(String s) {
        char c = s.charAt(s.length() - 1);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }
}
