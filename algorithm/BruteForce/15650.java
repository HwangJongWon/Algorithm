import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
  public static int n,m;
  public static int[] graph;
  public static boolean[] visited;
  public static int temp;
  public static void dfs(int start, int depth){
    
    if(depth == m){
      for(int i=0; i<m;i++){
        System.out.print(graph[i]+" ");
      }
      System.out.println();
      return;
    }
    
    
    for(int i=start;i<=n;i++){
      
        graph[depth] = i;
        dfs(i+1, depth+1);
        
    }
  }
  
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    graph = new int[m];
    visited = new boolean[n];

    dfs(1,0);
    
  }
}