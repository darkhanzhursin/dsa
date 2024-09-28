package algos.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestPrefix {

    public static void main(String[] args) {
        longestCommonPrefix(new int[] {1, 10}, new int[] {100});
    }

    static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
    }

    static class Trie {
        TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        private void insert(String num) {
            TrieNode node = root;
            for (char c : num.toCharArray()) {
                node.children.putIfAbsent(c, new TrieNode());
                node = node.children.get(c);
            }
        }

        public int findLongestCommonPrefix(String number) {
            TrieNode node = root;
            int commonLength = 0;

            for (char c : number.toCharArray()) {
                if (node.children.containsKey(c)) {
                    commonLength++;
                    node = node.children.get(c);
                } else break;
            }

            return commonLength;
        }
    }

    public static int longestCommonPrefix(int[] arr1, int[] arr2) {
        Trie trie = new Trie();
        int maxPrefix = 0;

        for (int num : arr1) {
            trie.insert(Integer.toString(num));
        }

        for (int num : arr2) {
            int commonPrefix = trie.findLongestCommonPrefix(Integer.toString(num));
            maxPrefix = Math.max(maxPrefix, commonPrefix);
        }

        return maxPrefix;
    }
}
