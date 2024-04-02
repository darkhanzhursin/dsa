package miu.fpp.homeworks.lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDups {

    private static final String duplicated = "DUPLICATED";

    static String[] removeDups(String[] arr) {
        int len = arr.length;
        if (arr == null || len == 0) return new String[0];

        for (int i = 0; i < len; i++) {
            if (arr[i] == null) continue;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] != null && arr[i].equals(arr[j])) {
                    arr[j] = duplicated;
                }
            }
        }

        int countDifs = 0;
        for (String s : arr) {
            if (s != duplicated) countDifs++;
        }

        String[] res = new String[countDifs];
        int index = 0;
        for (String s : arr) {
            if (s != duplicated) res[index++] = s;
        }

        return res;
    }

    static String[] removeDuplicatesWithList(String[] arr) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++) {
            if (!stringList.contains(arr[i])) {
                stringList.add(arr[i]);
            }
        }

        return stringList.toArray(new String[0]);
    }
    public static void main(String[] args) {
        String[] res = removeDups(new String[] {"horse", "dog", "cat", "horse", "dog"});
        System.out.println(Arrays.toString(res));
    }
}
