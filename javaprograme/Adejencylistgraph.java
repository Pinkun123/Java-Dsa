import java.util.ArrayList;

public class Adejencylistgraph {
    static class Edge{
        int src;
        int dest;

        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }

    public static void CreatGraph(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));   // new edge(src: 0 , dest:1)

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3)); 
        
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3)); 
        
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));      

    }

    public static void main(String[] args) {
        int V=4; // v= vertices of graph

        ArrayList<Edge>graph[]=new ArrayList[V]; // graph store arrlist inside arrlist store edge 
        CreatGraph(graph);

        // print 2 neighbour

        for(int i=0;i<graph[2].size();i++){
            Edge e=graph[2].get(i);
            System.out.print(e.dest +" ");
        }
    }
}
