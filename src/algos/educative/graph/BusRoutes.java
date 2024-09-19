package algos.educative.graph;

import java.util.*;

public class BusRoutes {
    public static void main(String[] args) {

    }

    static int minimumBuses(int[][] routes, int src, int dest) {

        Map <Integer, List <Integer>> adjList = new HashMap < > ();
        for (int i = 0; i < routes.length; i++) {
            for (int station: routes[i]) {
                if (!adjList.containsKey(station)) {
                    adjList.put(station, new ArrayList < > ());
                }
                adjList.get(station).add(i);
            }
        }

        Deque < int[] > queue = new ArrayDeque < > ();
        queue.add(new int[] {src, 0});

        Set < Integer > visitedBuses = new HashSet < > ();

        while (!queue.isEmpty()) {
            int[] current = queue.peek();
            int station = current[0];
            int busesTaken = current[1];
            queue.poll();


            if (station == dest) {
                return busesTaken;
            }

            if (adjList.containsKey(station)) {
                for (int bus: adjList.get(station)) {
                    if (!visitedBuses.contains(bus)) {
                        for (int s: routes[bus]) {
                            queue.add(new int[] {
                                    s,
                                    busesTaken + 1
                            });
                        }
                        visitedBuses.add(bus);
                    }
                }
            }
        }

        return -1;
    }
}
