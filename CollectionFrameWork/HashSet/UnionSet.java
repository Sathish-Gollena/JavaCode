package CollectionFrameWork.HashSet;

import java.util.*;

public class UnionSet {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3 };
        int arr2[] = { 2, 4, 6, 1 };
        System.out.println(union(arr1, arr2));
    }

    public static int union(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            set.add(arr2[j]);
        }
        // Iterator it =set.iterator();
        // Iterator it = set.iterator();
        // while (it.hasNext()) {
        // System.out.print(it.next() + " ");
        // }
        return set.size();
    }

}
