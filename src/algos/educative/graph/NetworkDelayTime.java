package algos.educative.graph;


import java.util.*;

public class NetworkDelayTime {
    public static void main(String[] args) {
        System.out.println(findDelayTime(new int[][] {{1,2,1}, {2,3,1}, {3,4,1}}, 4, 1));
    }
    // n - number of nodes
    // k - starting node
    // times[][0] - source node
    // times[][1] - target node
    // times[][2] - weight of the direct edge
    // Dijkstra's algorithm
    // Time complexity: O(logN): N - number of nodes
    // Space complexity: O(N + E): N - number of nodes, E - number of edges
    static int findDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> adjacencyMap = new HashMap<>();
        for (int[] time : times) {
            int source = time[0];
            int destination = time[1];
            int travelTime = time[2];
            adjacencyMap.computeIfAbsent(source, key -> new ArrayList<>()).add(new int[]{destination,
                    travelTime});
        }
        Set<Integer> visited = new HashSet<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparing(a -> a[0]));
        pq.offer(new int[]{0, k});
        int delayTime = 0;

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int time = current[0];
            int node = current[1];

            if (visited.contains(node)) {
                continue;
            }

            visited.add(node);
            delayTime = Math.max(delayTime, time);
            List<int[]> neighbors = adjacencyMap.getOrDefault(node, new ArrayList<>());

            for (int[] neighbor : neighbors) {
                int neighborNode = neighbor[0];
                int neighborTime = neighbor[1];
                if (!visited.contains(neighborNode)) {
                    int newTime = time + neighborTime;
                    pq.offer(new int[] {newTime, neighborNode});
                }
            }
        }

        if (visited.size() == n)
            return delayTime;

        return -1;
    }

    private static void addIfNonVisitedAndUpdateTime(PriorityQueue<Map<Integer, Integer>> pq, Set<Integer> visited) {
        if (!visited.contains(pq.peek().keySet().iterator().next())) {
            visited.add(pq.peek().keySet().iterator().next());
        }
    }
}
