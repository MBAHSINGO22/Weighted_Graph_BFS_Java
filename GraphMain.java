package PERTEMUAN10;

public class GraphMain {
    public static void main(String[] args) {
        Graph graph1 = new Graph();
        graph1.addVertex('A');
        graph1.addVertex('B');
        graph1.addVertex('C');
        graph1.addVertex('D');
        graph1.addVertex('E');
        graph1.addVertex('F');

        graph1.addEdge('A', 'B', 1);
        graph1.addEdge('A', 'C', 1);
        graph1.addEdge('A', 'D', 1);
        graph1.addEdge('B', 'E', 1);
        graph1.addEdge('B', 'C', 1);
        graph1.addEdge('D', 'C', 1);
        graph1.addEdge('D', 'F', 1);
        graph1.addEdge('C', 'E', 1);
        graph1.addEdge('C', 'F', 1);

        System.out.println("Graph 1:");
        System.out.println(graph1.toString());

        System.out.println("BFS Traversal Graph 1 :");
        graph1.bfs();

        System.out.println();

        Graph graph2 = new Graph();
        graph2.addVertex('A');
        graph2.addVertex('B');
        graph2.addVertex('C');
        graph2.addVertex('D');
        graph2.addVertex('G');
        graph2.addVertex('E');
        graph2.addVertex('F');
        graph2.addVertex('H');
        graph2.addVertex('I');

        graph2.addEdge('A', 'B', 1);
        graph2.addEdge('B', 'C', 1);
        graph2.addEdge('C', 'D', 1);
        graph2.addEdge('D', 'G', 1);
        graph2.addEdge('G', 'E', 1);
        graph2.addEdge('E', 'B', 1);
        graph2.addEdge('E', 'C', 1);
        graph2.addEdge('G', 'F', 1);
        graph2.addEdge('F', 'A', 1);
        graph2.addEdge('A', 'B', 1);
        graph2.addEdge('D', 'H', 1);
        graph2.addEdge('A', 'I', 1);

        System.out.println("Graph 2:");
        System.out.println(graph2.toString());

        System.out.println("BFS Traversal Graph 2 :");
        graph2.bfs();
    }
}
