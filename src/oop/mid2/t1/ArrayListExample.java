package oop.mid2.t1;

/**
 * Task 1 - MIDTERM - Java List Filtering Animation Replication
 *
 * This Java program simulates the behavior shown in the animation at:
 * "max.ge/oop_mid2/t1/t1_aleksi_naskidashvili_1_27394816.html".
 *
 * Functionality:
 * 1. It defines two lists:
 *      - list1: a list of integers.
 *      - list2: a list of strings.
 *
 * 2. It creates a third list (list3) by transforming each number `n` from list1 using
 *    the formula `index = 2 * n - 1`, then fetching the element at that index in list2.
 *
 * 3. Then, it performs a filtering process as seen in the animation:
 *      - First removes the element at index 0.
 *      - Then removes the element at index 1 (from the updated list).
 *      - Then index 2, and so on.
 *    This continues until the index is greater than or equal to the list size.
 *
 * The program is flexible to work with any valid `list1` and `list2` input,
 * as long as the indices computed do not go out of bounds in list2.
 *
 * Package: oop.mid2.t1
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(5, 8, 4, 4, 6, 4, 6, 7, 9, 4, 8, 2, 5);
        List<String> list2 = Arrays.asList(
                "zQQkZ", "IdFs", "2KSkd", "Rnt", "R35bT", "s2IZh", "TByz4",
                "1FBrI", "4qkAV", "QfM",  "dwIz", "2dN",  "4OZm",  "WYWg",
                "KhDcs", "FfF",  "cD6D",  "xGbN"
        );

        List<String> list3 = new ArrayList<>(list1.size());

        for (int n : list1) {
            int idx = 2 * n - 1;
            list3.add(list2.get(idx));
        }

        System.out.println("Before filtering:");
        System.out.println(list3);

        int i = 0;
        while (i < list3.size()) {
            list3.remove(i);
            i++;
        }

        System.out.println("\nAfter filtering:");
        for (String s : list3) {
            System.out.println(s);
        }

        System.out.println("\nFinal output after filtering:");
        System.out.println(list3);

    }
}
