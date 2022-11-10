import java.io.*;
import java.util.*;

class Main{
  public static int n,m,k;
  public static int[][] graph;
  public static boolean[][] visited;
  public static int[] dx = {-1,1,0,0};
  public static int[] dy = {0,0,-1,1};
  public static int sum=0;
  public static int max = Integer.MIN_VALUE;

  public static int dfs(int x, int y){
    visited[x][y] = true;

    for(int i=0;i<4;i++){
      int nx = x+dx[i];
      int ny = y+dy[i];
      if((nx>=0 && nx<n && ny>=0 && ny<m) && !visited[nx][ny]){
        if(graph[nx][ny]==1){
          visited[nx][ny] = true;
          sum++;
          dfs(nx,ny);
        }
      }
    }
    return sum;
  }

  
  
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    k = Integer.parseInt(st.nextToken());
    graph = new int[n][m];
    visited = new boolean[n][m];
    for(int i=0;i<k;i++){
      st = new StringTokenizer(br.readLine());
      int r = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());

      graph[r-1][c-1] = 1;
    }

    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        if(!visited[i][j] && graph[i][j]==1){
          sum=1;
          int temp = dfs(i,j);
          if(max<temp){
            max = temp;
          }
        }
      }
    }
    
    System.out.println(max);

    
  }
}