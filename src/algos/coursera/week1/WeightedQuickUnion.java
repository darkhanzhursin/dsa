package algos.coursera.week1;

public class WeightedQuickUnion {

    private int[] id;
    private int[] sz;
    private int count; // number of components

    public WeightedQuickUnion(int N) {
        sz = new int[N];
        id = new int[N];
        for (int i = 0; i < N; i++) {
            sz[i] = 1;
            id[i] = i;
        }
    }

    // returns the number of sets
    public int count() {
        return count;
    }

    private int root(int i) {
        while (i != id[i]) {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        if (i == j) return;
        id[i] = j;
        if (sz[i] < sz[j]) {
            id[i] = j; sz[j] += sz[i];
        } else {
            id[j] = i; sz[i] += sz[j];
        }
        count--;
    }
}
