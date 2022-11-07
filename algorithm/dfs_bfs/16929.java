import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static int n,m;
  public static int firstX, firstY;
  public static char[][] graph;
  public static boolean visited[][];

  public static boolean check;
  
  public static int dx[] = {-1,1,0,0};
  public static int dy[] = {0,0,-1,1};
  public static boolean dfs(int x, int y, int count){
    visited[x][y] = true;
    for(int i=0;i<4;i++){
      int nx = x+dx[i];
      int ny = y+dy[i];

      if(nx>=0 && nx<n && ny>=0 && ny<m){
        if(graph[nx][ny] == graph[x][y]){
          if(visited[nx][ny]==false){
            visited[nx][ny] = true;
            if(dfs(nx, ny, count+1)) return true;
          }
          else{
            if(count>=4 && nx==firstX && ny==firstY) return true;
          }
          
        }
      }
    }
    return false;
  }
  
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    graph = new char[n][m];
    
    String s;
    for(int i=0;i<n;i++){
      s = br.readLine();
      for(int j=0;j<m;j++){
        graph[i][j] = s.charAt(j);
      }
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        visited = new boolean[n][m];
        firstX = i;
        firstY = j;
        if(dfs(i,j, 1)){
          System.out.println("Yes");
          return;
        };
      }
    }
    System.out.println("No");
    
    
  }
}