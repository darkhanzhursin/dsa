package miu.fpp.homeworks.lesson8.prob3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static List<Marketing> listMoreThan1000(List<Marketing> list) {
        //return list.stream().filter(m -> m.getSalesAmount() > 1000).toList();
        List<Marketing> result = new ArrayList<>();
        for (Marketing m : list) {
            if (m.getSalesAmount() > 1000) result.add(m);
        }
        return result;
    }
    public static void main(String[] args) {
        List<Marketing> marketingList = new ArrayList<>();
        Marketing removableMarketing = new Marketing("Bob", "House", 122000.0);
        marketingList.add(removableMarketing);
        marketingList.add(new Marketing("John", "Computer", 3500.0));
        marketingList.add(new Marketing("Anna", "IPhone", 4000.0));
        marketingList.add(new Marketing("Siri", "Application", 800));
        marketingList.add(new Marketing("Lili", "Car", 650));

        System.out.println(marketingList.size());
        marketingList.remove(removableMarketing);
        System.out.println(marketingList.size());
        System.out.println("Before sorting by sales amount: ");
        for (Marketing m : marketingList) {
            System.out.println(m.getEmployeeName() + " " + m.getSalesAmount());
        }
        marketingList.sort((m1, m2) -> (int) (m1.getSalesAmount() - m2.getSalesAmount()));
        System.out.println("After sorting by sales amount: ");
        for (Marketing m : marketingList) {
            System.out.println(m.getEmployeeName() + " " + m.getSalesAmount());
        }
        List<Marketing> listMoreThan1000 = listMoreThan1000(marketingList);
        Collections.sort(listMoreThan1000, new Comparator<Marketing>() {
            @Override
            public int compare(Marketing o1, Marketing o2) {
                return o1.getEmployeeName().compareTo(o2.getEmployeeName());
            }
        });
        System.out.println("After sorting by name of employees who's sales amount is more than 1000");
        for (Marketing m : listMoreThan1000) {
            System.out.println(m.getEmployeeName() + " " + m.getSalesAmount());
        }
    }
}
