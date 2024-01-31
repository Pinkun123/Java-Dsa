import java.util.ArrayList;
import java.util.Stack;

public class scc {
    public static class edge{
        int src;
        int dest;

        public edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void CreatGraph(ArrayList<edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<edge>();
        }

        graph[0].add(new edge(0, 2));
        graph[0].add(new edge(1, 3));

        graph[1].add(new edge(1, 0));

        graph[2].add(new edge(2, 1));

        graph[3].add(new edge(3, 4));
    }
    public static void TopSort(ArrayList<edge>graph[],int curr,boolean vis[],Stack<Integer> s){
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){ // call for neigbhour
            edge e=graph[curr].get(i);// src to dest

            if(!vis[e.dest]){// now curr=e.dest
                TopSort(graph, e.dest, vis, s);
            }
        }
        s.push(curr);

    }
    public static void dfs(ArrayList<edge> graph[],int curr,boolean vis[]   ){
        vis[curr]=true;
        System.out.print(curr+" ");

        for(int i=0;i<graph[curr].size();i++){
            edge e =graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }
    }
    public static void KosaRajus(ArrayList<edge>graph[],int V){
        // step-1  topSort
         Stack<Integer> s=new Stack<>();
         boolean vis[]=new boolean[V];

         for(int i=0;i<V;i++){
             if(! vis[i]){
                TopSort(graph, i, vis, s);
             }
         }

        // step-2 tarnspose
         ArrayList<edge>tarnspose[]=new ArrayList[V];
         for(int i=0;i<tarnspose.length;i++){  // intilazation
            vis[i]=false;
            tarnspose[i]=new ArrayList<edge>();
         }

         for(int i=0;i<V;i++){// this loop for graph all node

            for(int j=0;j<graph[i].size();j++){ // this loop for neighbour for curr node tc O(n)
                edge e=graph[i].get(j);// src to dest
                graph[e.dest].add(new edge(e.dest,e.src));// dest to src now is transpose
            }
        
        }

        // step -3
        while(!s.isEmpty()){ 
            int  curr=s.pop();
             if(!vis[curr]){
                dfs(tarnspose, curr, vis);
                System.out.println();
             }
        }

    }
    public static void main(String[] args) {
        int V=5;
        ArrayList<edge>graph[]=new ArrayList[V];
        CreatGraph(graph);
        KosaRajus(graph, V);
    }
}
