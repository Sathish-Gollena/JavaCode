package CollectionFrameWork.ArrayList;

import java.util.*;

public class AllAboutArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        l.add(list);
        // System.out.println(l.get(0).get(0));
        // for (int i = 0; i < list.size(); i++) {
        //     System.out.println(list.get(i));
        // }
        list.add(0, 7);
        System.out.println(list);
    }
}
