import java.util.*;
class Main {
    public static void main(String[] args) {
        int[][] edges = {
                {0, 1, 10},
                {0, 2, 6},
                {0, 3, 5},
                {1, 3, 15},
                {2, 3, 4}
        };
        int numVertices = 4;
        findMinimumSpanningTree(edges, numVertices);
    }
    public static void findMinimumSpanningTree(int[][] edges, int numVertices) {
        boolean[] visited = new boolean[numVertices];
        PriorityQueue<Edge> minHeap = new PriorityQueue<>(new EdgeComparator());
        List<Edge> minimumSpanningTree = new ArrayList<>();
        int startVertex = 0;
        visited[startVertex] = true;
        for (int[] edge : edges) {
            if (edge[0] == startVertex) {
                minHeap.offer(new Edge(edge[0], edge[1], edge[2]));
            }
        }

        int minCost = 0;

        while (!minHeap.isEmpty() && minimumSpanningTree.size() < numVertices -1) {
            Edge edge = minHeap.poll();
            int fromVertex = edge.from;
            int toVertex = edge.to;
            int weight = edge.weight;

            if (visited[fromVertex] && !visited[toVertex]) {
                visited[toVertex] = true;
                minimumSpanningTree.add(edge);
                minCost += weight;
                for (int[] nextEdge : edges) {
                    if (nextEdge[0] == toVertex && !visited[nextEdge[1]]) {
                        minHeap.offer(new Edge(nextEdge[0], nextEdge[1], nextEdge[2]));
                    }
                }
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
class EdgeComparator implements Comparator<Edge> {
    @Override
    public int compare(Edge e1, Edge e2) {
        return Integer.compare(e1.weight, e2.weight);
    }
}
