import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
  public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
  
  public static int n, m, v;
  public static boolean[] visited;
  public static boolean[] bfsvisited;
  
  public static void dfs(int x){

    visited[x] = true;
    System.out.print(x+" ");
    for(int i=0;i<graph.get(x).size();i++){
      int y = graph.get(x).get(i);
      if(!visited[y]){
        dfs(y);
      }
    }
  }
  
  public static void bfs(int start){
    
    Queue<Integer> q = new LinkedList<>();
    q.offer(start);
    bfsvisited[start] = true;

    while(!q.isEmpty()){
      int x = q.poll();
      System.out.print(x+" ");

      for(int i=0;i<graph.get(x).size();i++){
        int y=graph.get(x).get(i);
        if(!bfsvisited[y]){
          q.offer(y);
          bfsvisited[y]=true;
        }
      }
    }
  }
  
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    v = Integer.parseInt(st.nextToken());
    visited = new boolean[n+1];
    bfsvisited = new boolean[n+1];
    for(int i=0; i<n+1;i++){
      graph.add(new ArrayList<Integer>());
      
    }
    
    for(int i=0;i<m;i++){
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      graph.get(a).add(b);
      graph.get(b).add(a);

      
    }
    for (int i = 0; i <= n; i++) {
      Collections.sort(graph.get(i));
    }
    
   
    dfs(v);
    System.out.println();
    bfs(v);
  }
}