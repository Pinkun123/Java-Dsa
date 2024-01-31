import java.util.ArrayList;

public class trazen {
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

        graph[0].add(new edge(0, 1));
        graph[0].add(new edge(0, 2));
        graph[0].add(new edge(0, 3));

        graph[1].add(new edge(1, 0));
        graph[1].add(new edge(1, 2));

        graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 1));

        graph[3].add(new edge(3, 0));
        graph[3].add(new edge(3, 4));
        graph[3].add(new edge(3, 5));

        graph[4].add(new edge(4, 3));
        graph[4].add(new edge(4, 5));

        graph[5].add(new edge(5, 3));
        graph[5].add(new edge(5, 4));
    }

    public static void dfs(ArrayList<edge>graph[],int curr,boolean vis[], int dt[],int low[],int time,int parr){
          vis[curr]=true;

          dt[curr]=low[curr]= ++time;

          for(int i=0;i<graph[curr].size();i++){
             edge e=graph[curr].get(i);

             if(e.dest== parr){
                continue;
             }
             else if(!vis[e.dest]){
                dfs(graph, e.dest, vis, dt, low, time, curr);
                low[curr]=Math.min(low[curr], low[e.dest]);
                if(low[curr]<low[e.dest]){
                    System.out.println("the bridge is:" + curr + "---"+ e.dest);
                }
             }
             else{
                low[curr]=Math.min(low[curr], dt[e.dest]);
             }
          }
    }

    public static void GetBridge(ArrayList<edge>graph[],int V){
        int dt[]=new int[V]; // discvoery time
        int low[]=new int [V]; // lowest discovery time
        int time=0;

        boolean vis[]=new boolean[V]; // vis arrya

        for(int i=0;i<V;i++){
            if(!vis[i]){
               dfs(graph, i, vis, dt, low, time, -1);// par=-1, i =curr
            }
        }
    }
    public static void main(String[] args) {
        int V=6;
        ArrayList<edge>graph[]=new ArrayList[V];
        CreatGraph(graph);
        GetBridge(graph, V);
    }
    
}
