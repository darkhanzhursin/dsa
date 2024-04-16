package algos.leetcode;

public class FirstOccuranceString {
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        strStr("sadbutsad", "sado");
    }
}
