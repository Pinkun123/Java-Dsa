import java.util.ArrayList;

public class ap {
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

        graph[4].add(new edge(4, 3));
    }

    public static void dfs(ArrayList<edge>graph[],int curr,int dt[],int low[],int time,boolean vis[],boolean Ap[],int par){
        vis[curr]=true;
        low[curr]=dt[curr]=++time;
        int children=0;
        for(int i=0;i<graph[curr].size();i++){ // call neighbour
            edge e=graph[curr].get(i);
            int neighbour=e.dest;

            // 1st case
            if(par == neighbour){
                continue;
            }// 2nd case
            else if(vis[neighbour]){ // neighbour is visted allradey
                low[curr]=Math.min(low[curr],dt[neighbour]);
            }
            else{ // neighbour not visted
                dfs(graph, neighbour, dt, low, time, vis, Ap, -1);
                low[curr]=Math.min(low[curr],low[neighbour]);

                if(low[neighbour]<=dt[curr] && par !=-1){
                    Ap[curr]=true;
                }
                 children++;
            }
        }

        if(par == -1 && children > 1){
            Ap[curr]=true;
        }
    }

    public static void getAp(ArrayList<edge>graph[],int V){

        int dt[]=new int[V];// discovery time array
        int low[]=new int[V];// low discovery time Arry
        int time=0;

        boolean vis[]=new boolean[V]; //vis arry
        boolean Ap[]=new boolean[V];// Articulation point

        for(int i=0;i<V;i++){
            if(!vis[i]){
               dfs(graph, i, dt, low, time, vis, Ap, -1);
            }
        }
    }
    public static void main(String[] args) {
        int V=5;
        ArrayList<edge>graph[]=new ArrayList[V];

    }
}
