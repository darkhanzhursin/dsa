package algos.leetcode.hard;

import java.util.HashMap;
import java.util.Map;

public class PrefixSum {
    public static void main(String[] args) {
        sumPrefixScores(new String[]{"abc","ab","bc","b"});
    }

    static class TrieNode {
        Map<Character, Pair> children = new HashMap<>();
    }

    static class Pair {
        TrieNode node;
        int count;
        public Pair(int count, TrieNode node) {
            this.node = node;
            this.count = count;
        }
    }

    static class Trie {
        TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        private void insert(String word) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                node.children.putIfAbsent(c, new Pair(0, new TrieNode()));
                node.children.get(c).count++;
                node = node.children.get(c).node;
            }
        }

        private int findAllPrefix(String word) {
            TrieNode node = root;
            int commonPrefix = 0;

            for (char c : word.toCharArray()) {
                if (node.children.containsKey(c)) {
                    commonPrefix += node.children.get(c).count;
                    node = node.children.get(c).node;
                } else break;
            }

            return commonPrefix;
        }
    }

    public static int[] sumPrefixScores(String[] words) {
        int[] res = new int[words.length];
        Trie trie = new Trie();

        for (String word : words) {
            trie.insert(word);
        }

        for (int i = 0; i < words.length; i++) {
            int prefixSum = trie.findAllPrefix(words[i]);
            res[i] = prefixSum;
        }

        return res;
    }
}
