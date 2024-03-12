package codesignal.intro;

import java.util.*;

public class FileNaming {
    public static void main(String[] args) {
        solution(new String[] {"doc", "doc", "image", "doc(1)"});
    }
    static String[] solution(String[] names) {
        Map<String, Integer> tally = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            int numFiles = tally.getOrDefault(name, 0);
            numFiles = nextNumFiles(tally, name, numFiles);
            if (tally.containsKey(name)) {
                names = updateNames(names, i, numFiles-1);
                tally.put(names[i], 1);
            }
            tally.put(name, numFiles);
        }
        return names;
    }

    static int nextNumFiles(Map<String, Integer> tally, String name, int numFiles) {
        do {
            numFiles++;
        } while (tally.containsKey(name+"("+(numFiles-1)+")"));
        return numFiles;
    }

    static String[] updateNames(String[] names, int i, int num) {
        String name = names[i];
        names[i] = name + "(" + num + ")";
        return names;
    }
}


// ["doc", "doc", "image", "doc(1)", "doc"] -> ["doc", "doc(1)", "image", "doc(1)(1)", "doc(2)"]
// ["do", "do"] -> ["do", "do(1)")