import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.text.StyledEditorKit.BoldAction;

public class bfs {
    static class edge{
        int src;
        int dest;

        public edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }

    public static void CreatGraph(ArrayList<edge>graph[]) {
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<edge>();
        }

       
        graph[0].add(new edge(0, 1));
        graph[0].add(new edge(0, 2));

        graph[1].add(new edge(1, 0));
        graph[1].add(new edge(1, 3));

        graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 4));

        graph[3].add(new edge(3, 1));
        graph[3].add(new edge(3, 4));
        graph[3].add(new edge(3, 5));

        graph[4].add(new edge(4, 2));
        graph[4].add(new edge(4, 3));
        graph[4].add(new edge(4, 5));

        graph[5].add(new edge(5, 3));
        graph[5].add(new edge(5, 4));
        graph[5].add(new edge(5, 6));
         
    }
    public static void bsf(ArrayList<edge>graph[],int V){
        Queue<Integer>q=new LinkedList<>();

        boolean vis[]=new boolean[V];

        q.add(0);

        while(!q.isEmpty()){
            int curr=q.remove();
            if(vis[curr] == false){
                System.out.print(curr +" ");  // step-1  print curr
                vis[curr]=true;  // after add the data in visited array then true  // step-2

                // add neighour edge in que

                for(int i=0;i<graph[curr].size();i++){
                    edge e=graph[curr].get(i);  // curr:src , dest:i
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V=7;

        ArrayList<edge>garph[]=new ArrayList[V];
        CreatGraph(garph);
        bsf(garph, V);
    }
}
