import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[][] edges = {
                {0, 1, 10},
                {0, 2, 6},
                {0, 3, 5},
                {1, 3, 15},
                {2, 3, 4}
        };
        int numVertices = 4;

        findMinimumSpanningTreeKruskal(edges, numVertices);
    }
    public static void findMinimumSpanningTreeKruskal(int[][] edges, int numVertices) {
        List<Edge> minimumSpanningTree = new ArrayList<>();
        int minCost = 0;
        Arrays.sort(edges, (a, b) -> Integer.compare(a[2], b[2]));
        DisjointSet disjointSet = new DisjointSet(numVertices);
        for (int[] edge : edges) {
            int fromVertex = edge[0];
            int toVertex = edge[1];
            int weight = edge[2];

            if (!disjointSet.areConnected(fromVertex, toVertex)) {
                minimumSpanningTree.add(new Edge(fromVertex, toVertex, weight));
                minCost += weight;
                disjointSet.union(fromVertex, toVertex);
            }
        }

        System.out.println("Minimum Spanning Tree Edges:");
        for (Edge edge : minimumSpanningTree) {
            System.out.println(edge.from + " -- " + edge.to + " == " + edge.weight);
        }

        System.out.println("Minimum Cost Spanning Tree: " + minCost);
    }
}
class Edge {
    int from;
    int to;
    int weight;

    public Edge(int from, int to, int weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }
}
class DisjointSet {
    private int[] parent;

    public DisjointSet(int size) {
        parent = new int[size];
        for (int i = 0; i < size; i++) {
            parent[i] = i;
        }
    }

    public int find(int vertex) {
        if (vertex == parent[vertex]) {
            return vertex;
        }
        return find(parent[vertex]);
    }

    public void union(int vertex1, int vertex2) {
        parent[find(vertex1)] = find(vertex2);
    }

    public boolean areConnected(int vertex1, int vertex2) {
        return find(vertex1) == find(vertex2);
    }
}

