import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main{
  public static int n,m;
  public static int[] graph;
  public static int[] temp;
  public static boolean[] visited;
  public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  public static void dfs(int depth)throws IOException{
    if(depth==m){
      for(int i=0;i<m;i++){
        bw.write(graph[i]+" ");
        
      }
      bw.newLine();
        return;
    }

    for(int i=0;i<n;i++){
      
        
        graph[depth] = temp[i];
        dfs(depth+1);
        
      
    }
  }
  
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    
    temp = new int[n];
    graph = new int[m];
    visited = new boolean[n];
    
    st = new StringTokenizer(br.readLine());
    for(int i=0;i<n;i++){
      temp[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(temp);

    dfs(0);
    
    bw.flush();
    bw.close();
  }
}