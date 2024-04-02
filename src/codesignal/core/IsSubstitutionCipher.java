package codesignal.core;

import java.util.HashMap;
import java.util.Map;

public class IsSubstitutionCipher {

    public static void main(String[] args) {
        solution("egg", "add");
    }

    static boolean solution(String string1, String string2) {
        if (string1.length() != string2.length()) return false;
        // once a letter is assigned, must be used for same
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i<string1.length(); i++) {
            String key = string1.substring(i, i+1);
            String val = string2.substring(i, i+1);
            if (!map.containsKey(key)) {
                // already mapped to a different key
                if (map.containsValue(val)) return false;
                map.put(key, val);
            } else {
                if (!map.get(key).equals(val)) return false;
            }
        }
        return true;
    }

}
