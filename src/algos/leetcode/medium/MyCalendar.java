package algos.leetcode.medium;

import java.util.TreeMap;

public class MyCalendar {
    // using TreeMap : end -> start

    TreeMap<Integer, Integer> map = new TreeMap<>();
    public MyCalendar() {
        map.put(Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public boolean book(int start, int end) {
        // get an (higher)entry that ends just after current
        var e = map.higherEntry(start);
        // if start time of higher entry is less than end time of current
        // since current has to start before higher enry,
        // so if above condition is true, it means the current event will end before higher entry
        // event will start, so we can schedule it
        if(end <= e.getValue()){
            map.put(end, start);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        MyCalendar myCalendar = new MyCalendar();
        System.out.println(myCalendar.book(10, 20));
        System.out.println(myCalendar.book(15, 25));
        System.out.println(myCalendar.book(20, 30));
    }
}
