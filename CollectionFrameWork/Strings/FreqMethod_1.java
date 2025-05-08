package CollectionFrameWork.Strings;

import java.util.*;

public class FreqMethod_1 {
    public static void main(String args[]) {
        String str1 = "Sathish";
        String str2 = "Kumar";
        System.out.print(okCool(str1, str2));
    }

    public static String okCool(String str1, String str2) {
        if (str1 == "" && str2 == "") {
            return null;
        }
        String ans = "";
        str1 = str1.replaceAll(" ", "").toLowerCase();
        str2 = str2.replaceAll(" ", "").toLowerCase();
        int freq[] = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            freq[c - 'a'] += 1;
        }
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            freq[c - 'a'] += 1;
        }
        for (int i = 25; i >= 0; i--) {
            if (freq[i] > 0) {
                ans += (char) (97 + i);
            }
        }
        return ans;
    }

}
