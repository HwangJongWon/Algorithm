import java.io.*;
import java.util.*;

class Main{
  public static int n,m;
  public static char[][] graph;
  public static boolean[][] visited;
  public static int dx[] = {-1,1,0,0};
  public static int dy[] = {0,0,-1,1};
  public static int white=0;
  public static int blue=0;
  public static int count=1;
  
  public static int dfs(int x, int y){
    visited[x][y] = true;

    for(int i=0;i<4;i++){
      int nx = x+dx[i];
      int ny = y+dy[i];
      if((nx>=0 && nx<n && ny>=0 && ny<m) && !visited[nx][ny]){
        if(graph[nx][ny]==graph[x][y]){
          visited[nx][ny] = true;
          count++;
          dfs(nx,ny);
        }
      }
    }
    return count;
  }
  
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    m = Integer.parseInt(st.nextToken());
    n = Integer.parseInt(st.nextToken());
    graph = new char[n][m];
    visited = new boolean[n][m];
    String s;ㅇ
    for(int i=0;i<n;i++){
      s = br.readLine();
      for(int j=0;j<m;j++){
        graph[i][j] = s.charAt(j);
      }
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        if(!visited[i][j]){
          count=1;
          if(graph[i][j]=='W'){
            int temp = dfs(i,j);
            white+=(temp*temp);
          }
          else if(graph[i][j]=='B'){
            int temp_blue = dfs(i,j);
            blue+=(temp_blue*temp_blue);
          }
          
        }
      }
    }
    System.out.printf("%d %d", white, blue);
    
  }
}