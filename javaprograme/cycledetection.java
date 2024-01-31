import java.util.ArrayList;

public class cycledetection {
    static class edge{
        int src;
        int dest;

        public edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }

    public static void CreatGraph( ArrayList<edge>graph[],int V){
        for(int i=0;i<graph.length;i++){
             graph[i]=new ArrayList<edge>();
        }

        graph[0].add(new edge(0 , 2));

        
        graph[1].add(new edge(1 , 0));

        
        graph[2].add(new edge(2 , 3));

        
        graph[3].add(new edge(3 , 0));
       
    }
    public static boolean Cycledetection(ArrayList<edge>graph[],boolean vis[],int curr,boolean rec[]){
        vis[curr]=true;
        rec[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            edge e=graph[curr].get(i);
            if(rec[e.dest]){
                return true;
            }
            else if(!rec[e.dest]){
               if( Cycledetection(graph, vis, e.dest, rec)){
                return true;
               }
            }
        }
        rec[curr]=false;
        return false;
    }


    public static void main(String[] args) {
        int V=7;
        ArrayList<edge>garph[]=new ArrayList[V];
        CreatGraph(garph, V);
        boolean vis[]=new boolean[V];
        boolean rec[]=new boolean[V];

        System.out.println(Cycledetection(garph, vis, 0, rec));

    }
}
