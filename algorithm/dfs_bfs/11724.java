import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
  public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
  public static boolean[] visited;

  public static void dfs(int x){
    visited[x] = true;

    for(int i=0; i<graph.get(x).size();i++){
      int y = graph.get(x).get(i);
      if(!visited[y]){
        dfs(y);
      }
    }
  }
  
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    for(int i=0;i<n+1;i++){
      graph.add(new ArrayList<Integer>());
    }
    visited = new boolean[n+1];
    for(int i=0;i<m;i++){
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      graph.get(a).add(b);
      graph.get(b).add(a);
      
    }
    int result=0;
    for(int i=1;i<=n;i++){
      if(!visited[i]){
        dfs(i);
        result++;
      }
      
      
    }
    System.out.println(result);
    
    
  }
}