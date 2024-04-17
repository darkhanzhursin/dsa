package algos.leetcode.medium;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public static void main(String[] args) {
        groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
    }

    static public List<List<String>> groupAnagrams(String[] strs) {
//        List<List<String>> groups = new ArrayList<>();
//        for (String str : strs) {
//            if (groups.stream().filter(l -> l.contains(str)).count() > 0) continue;
//            List<String> group = new ArrayList<>();
//            for (int i = 0; i < strs.length; i++) {
//                if (str == strs[i]) continue;
//                char[] chars1 = str.toCharArray();
//                Arrays.sort(chars1);
//                char[] chars2 = strs[i].toCharArray();
//                Arrays.sort(chars2);
//                if (Arrays.equals(chars1, chars2)) group.add(strs[i]);
//            }
//            group.add(str);
//            groups.add(group);
//        }
//        return groups;

        Map<String, List<String>> map = new HashMap<>();

        for (String str: strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = String.valueOf(chars);
            map.putIfAbsent(sorted, new ArrayList<>());
            map.get(sorted).add(str);
        }

        return new ArrayList<>(map.values());
    }

}
