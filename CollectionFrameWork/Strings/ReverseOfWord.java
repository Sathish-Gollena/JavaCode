package CollectionFrameWork.Strings;

public class ReverseOfWord {
    public static void main(String[] args) {
        String str[] = "I love India".split(" ");
        String ans = " ";
        for (int i = str.length - 1; i >= 0; i--) {
            ans += str[i] + " ";
        }
        System.out.print(ans);
        // OR System.out.print(ans.substring(0,ans.length()-1));
    }
}
