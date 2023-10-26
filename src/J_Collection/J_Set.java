package J_Collection;

import java.util.*;

public class J_Set {
    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<>();
        integers.add(2);
        integers.add(2);
        integers.add(1);
        integers.add(1);
        System.out.println(integers);
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(6);
        tree.add(5);
        tree.add(2);
        tree.add(2);
        System.out.println(tree);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "sudhakaran");
        map.put(2, "ADDWIN");
        map.put(3, "Naresh");
        map.replace(2, "Bootstrap Naresh");
        map.remove(3);
        System.out.println(map);
    }


}
