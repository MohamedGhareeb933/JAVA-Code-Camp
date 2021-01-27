package graph;


import com.sun.corba.se.impl.orbutil.graph.Graph;

public class graph {
    private int n;
    private int adj[][];

    graph(int n) {
        this.n = n;
        adj = new int[n][n];

        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                adj[i][j] = 0;
            }
        }
    }

    public void addEdge(int orig, int dest) {
        if (orig > n || dest > n || orig < 1 || dest < 1) {
            System.out.println("invalid add " + orig + " , " + dest );
        }else {
            adj[orig - 1][dest - 1] = 1;
        }
    }

    public void removeEdge(int orig, int dest) {
        if (orig > n || dest > n || orig < 1 || dest < 1) {
            System.out.println("invalid remove " + orig + " , " + dest );
        }else {
            adj[orig - 1][dest - 1] = 0;
        }
    }

    public void print() {
        for (int i= 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String [] args) {

       graph g = new graph(5);
       g.addEdge(1, 5);
        g.addEdge(2, 4);

        g.print();
    }
}
