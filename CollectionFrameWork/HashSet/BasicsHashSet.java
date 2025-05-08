package CollectionFrameWork.HashSet;

import java.util.*;

public class BasicsHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);

        System.out.println(set);
        // System.out.println(set.size());
        // System.out.println(set.contains(5));
        // System.out.println(set.remove(2));
        // System.out.println(set);
        // set.clear();
        // System.out.println(set.isEmpty());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
