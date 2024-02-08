package ct6;

import java.util.HashSet;
import java.util.Set;

public class Example {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(3);
        set.add(2);
        set.add(2);

        for (int num : set) {
            System.out.println(num);
        }
    }
}
