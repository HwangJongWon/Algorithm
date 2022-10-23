import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main{
  public static int n,m;
  public static int[] graph;
  public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  public static void dfs(int start, int depth)throws IOException{
    if(depth==m){
      for(int i=0;i<m;i++){
        bw.write(graph[i]+" ");
        
      }
      bw.newLine();
        return;
    }

    for(int i=start;i<=n;i++){
      graph[depth] = i;
      dfs(i,depth+1);
    }
  }
  
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    graph = new int[m];

    dfs(1,0);
    
    bw.flush();
    bw.close();
  }
}