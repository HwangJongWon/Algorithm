import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
public class Main{

  public static int[] graph;
  public static boolean[] visited;
  public static int n,m;
 
  public static void dfs(int depth){
    if(depth==m){
      for(int i=0;i<m;i++){
        System.out.print(graph[i]+" ");
      }
      System.out.println();
      return;
    }
    
    for(int i=1;i<=n;i++){
      if(!visited[i]){
        visited[i] = true;
        graph[depth]=i;
        dfs(depth+1);
        visited[i] = false;
      }
    }
      
    
    
  }
  
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    graph = new int[m+1];
    visited = new boolean[n+1];
    
    

    dfs(0);
  }
}