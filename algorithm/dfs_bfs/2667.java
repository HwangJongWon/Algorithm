import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
  public static int dx[] = {0,0,1,-1};
  public static int dy[] = {1,-1,0,0};
  public static int[][] graph = new int[26][26];
  public static int n;
  public static int[] count = new int[26*26];
  public static int result=0;
  public static boolean[][] visited = new boolean[26][26];
  
  public static void dfs(int x, int y){
    
    visited[x][y]=true;
    count[result]++;

    for(int i=0;i<4;i++){
      int nx = x +dx[i];
      int ny = y +dy[y];
      if(nx >=0 && ny >=0 && nx < n && ny < n){
                if(graph[nx][ny] == 1 && !visited[nx][ny]){
                    dfs(nx,ny);
                }
            }
    }
    
    
    
    
    
   
  }
  
  
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    String s;
    for(int i=0;i<n;i++){
      s=br.readLine();
      for(int j=0;j<n;j++){
        graph[i][j]=s.charAt(j) -'0';
      }
    }

   
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(graph[i][j]==1&&!visited[i][j]){
          result++;
          dfs(i,j);
          
          
        }
      }
    }
    System.out.println(result);
    Arrays.sort(count);
    
    for(int i=0;i<count.length;i++){
      if(count[i]==0){
        
      }
      else{
        System.out.println(count[i]);
      }
    }
    
  }
}