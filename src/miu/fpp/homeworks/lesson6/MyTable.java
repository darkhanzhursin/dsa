package miu.fpp.homeworks.lesson6;

public class MyTable {

    private Entry[] entries;

    public MyTable() {
        entries = new Entry[26];
    }

    public void add(char c, String name) {
        int pos = Character.compare(c, 'a');
        entries[pos] = new Entry(c, name);
    }

    public String get(char c) {
        int pos = Character.compare(c, 'a');
        return entries[pos].name;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Entry entry : entries) {
            if (entry != null) {
                result.append(entry).append("\n");
            }
        }
        return result.toString();
    }

    private class Entry {
        private char c;
        private String name;

        Entry(char c, String name) {
            this.c = c;
            this.name = name;
        }

        @Override
        public String toString() {
            return c + " -> " + name;
        }
    }

    public static void main(String[] args) {
        MyTable t = new MyTable();
        t.add('a', "Andrew");
        t.add('b', "Billy");
        t.add('w', "Willie");
        t.add('b', "Bonny");
        System.out.println(t);
        String s = t.get('b');
        System.out.println(s);
    }
}
