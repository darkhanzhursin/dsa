package algos.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {
    public static void main(String[] args) {
        canFinish(2, new int[][]{{1,0}});
    }

    enum Status {
        NOT_VISITED, VISITED, VISITING;
    }
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        if (prerequisites == null || prerequisites.length == 0 || prerequisites[0].length == 0) return true;
        List<List<Integer>> list = new ArrayList<>(numCourses);
        for (int i = 0; i < numCourses; i++) {
            list.add(new ArrayList<>());
        }

        for (int[] p: prerequisites) {
            int prerequisite = p[1];
            int course = p[0];
            list.get(course).add(prerequisite);
        }

        Status[] visited = new Status[numCourses];
        for (int i = 0; i < numCourses; i++) {
            visited[i] = Status.NOT_VISITED;
        }
        for (int i = 0; i < numCourses; i++) {
            // if there is a cycle, return false
            if(dfs(list, visited, i)) return false;
        }

        return true;
    }

    private static boolean dfs(List<List<Integer>> list, Status[] visited, int cur) {
        if(visited[cur] == Status.VISITING) return true;
        if(visited[cur] == Status.VISITED) return false;
        visited[cur] = Status.VISITING;
        for(int next: list.get(cur)) {
            if(dfs(list, visited, next)) return true;
        }
        visited[cur] = Status.VISITED;
        return false;
    }
}
