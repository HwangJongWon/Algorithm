import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{ //DFS 백트래킹 

  public static int n,m,k, result;
  public static int[][] graph;
  public static int[] dx = {-1,1,0,0};
  public static int[] dy = {0,0,-1,1};
  public static boolean[][] visited;
  public static int[][] sumCheck;
  public static int sum;

  public static ArrayList<Integer> sumList = new ArrayList<Integer>();
  
  public static void dfs(int x, int y, int depth,int sum){
    
    if(depth==k){
      result = Math.max(result, sum);
      return;

    }
    else{
      for(int i=x;i<n;i++){
            for(int j=y;j<m;j++){
              if(!visited[i][j]){
                if(check(i,j)){
                  visited[i][j] = true;                                  
                
                  dfs(x, y, depth+1, sum+graph[i][j]);
                  visited[i][j] = false;
                }
              }
            }
          }
      
    }
      
      

    
    
    
  
  }
  public static boolean check(int nx, int ny){
    for(int i=0;i<4;i++){
      int tx = nx + dx[i];
      int ty = ny + dy[i];
      
      if(tx>=0 && tx<n && ty>=0 && ty<m){
        if(visited[tx][ty]){
          
          return false;
        }
      }
    }
    return true;
    
  }
  
  
  public static  void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    k = Integer.parseInt(st.nextToken());
    graph = new int[n][m];
    visited = new boolean[n][m];
    sumCheck = new int[n][m];
    result = Integer.MIN_VALUE;
    
    
    for(int i=0;i<n;i++){
      st = new StringTokenizer(br.readLine());
      for(int j=0;j<m;j++){
        graph[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    for(int[] s: sumCheck) Arrays.fill(s, 10001);
    sumCheck[0][0] = graph[0][0];
    dfs(0,0,0,0);
    
    
    
    // for(int i=0;i<n;i++){
    //   for(int j=0;j<m;j++){
    //     if(!visited[i][j]){
    //       visited[i][j] = true;
    //       // for (int[] i : graph) Arrays.fill(i, 0);
    //       
    //       for(boolean x[]: visited) Arrays.fill(x, false);
    //       sum=graph[i][j];
    //       sumCheck[i][j] = graph[i][j];
    //       int max = dfs(i,j,0);
    //       if(result<max){
    //         result = max;
    //       }
    //     }
    //   }
    // }

    System.out.println(result);
    
    
  }

  
}