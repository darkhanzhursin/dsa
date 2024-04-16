package algos.hackerRank;

import java.util.*;
import java.util.stream.Collectors;

public class ActiveTraders {

    public static void main(String[] args) {
        solution(List.of("Alpha", "Beta", "Beta", "Omega"));
    }

    static private List<String> solution(List<String> customers) {
        Map<String, Integer> customerCount = new HashMap<>();

        // Count occurrences of each customer
        for (String customer : customers) {
            customerCount.put(customer, customerCount.getOrDefault(customer, 0) + 1);
        }

        // Filter active customers
        List<String> activeCustomers = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : customerCount.entrySet()) {
            if (entry.getValue() * 100 >= customers.size() * 5) {
                activeCustomers.add(entry.getKey());
            }
        }

        // Sort and return the list of active customers
        Collections.sort(activeCustomers);
        return activeCustomers;
    }
}
