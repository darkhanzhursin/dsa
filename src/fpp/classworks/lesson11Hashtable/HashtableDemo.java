package fpp.classworks.lesson11Hashtable;

import java.util.Hashtable;
import java.util.Set;

public class HashtableDemo {
    public static void main(String[] args) {
        // Value mau be any  collection
        Hashtable<Integer, Empl> tm = new Hashtable<>();
        tm.put(1, new Empl("Ramu", 3000, 134));
        tm.put(5, new Empl("Jony", 6000, 235));
        tm.put(3, new Empl("Crish", 2000, 876));
        tm.put(4, new Empl("Tom", 2400, 512));
        System.out.println("Hashtable entries: ");
        Set<Integer> keys = tm.keySet();
        for (Integer key : keys) {
            System.out.println(key + " ==> " + tm.get(key));
        }
        tm.remove(4);
        tm.replace(5, new Empl("Jony", 3200, 235));
        System.out.println(tm);
    }
}

class Empl {
    private String name;
    private int salary;
    private int id;

    public Empl(String name, int salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Empl{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}