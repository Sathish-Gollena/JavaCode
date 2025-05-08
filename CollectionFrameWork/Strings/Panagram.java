public class Panagram {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyxz";
        int[] freq = new int[26];
        System.out.print(panagram(str, freq));

    }

    public static String panagram(String str, int[] freq) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            freq[c - 'a'] += 1;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 0) {
                return "no";
            }
        }
        return "yes";
    }

}
