import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;
public class Main{
  public static int w,h;
  public static int[][] graph = new int[51][51];
  public static boolean[][] visited = new boolean[51][51];
  public static int[] dx = {0,0,-1,1,-1,-1,1,1};
  public static int[] dy = {1,-1,0,0,-1,1,-1,1};
  public static int count;
  //왼쪽 위 대각선 dx[2], dy[1]
  //왼쪽 아래 대각선 dx[2], dy[0]
  //오른쪽 위 대각선 dx[3], dy[1]
  //오른쪽 아래 대각선 dx[3], dy[0]

  
  public static void dfs(int x, int y){
    visited[x][y] = true;

    for(int i=0;i<8;i++){
      int nx = x+dx[i];
      int ny = y+dy[i];
      if(nx>=0 && nx<=w && ny>=0 && ny<=h){
        if(graph[nx][ny]==1 && !visited[nx][ny]){
          
          dfs(nx,ny);
        }
      }
    }
    
  }
  
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    while(true){
      st=new StringTokenizer(br.readLine());
      w=Integer.parseInt(st.nextToken());
      h=Integer.parseInt(st.nextToken());
      
      if(w==0 && h==0){
        break;
      }
      else{
        
        for(int i=0;i<h;i++){
          st = new StringTokenizer(br.readLine());
          for(int j=0;j<w;j++){
            graph[i][j] = Integer.parseInt(st.nextToken());
          }
        }
        
        count=0;
        for(int i=0;i<h;i++){
          for(int j=0;j<w;j++){
            if(!visited[i][j]&&graph[i][j]==1){
              
              dfs(i,j);
              count+=1;
            }
          }
        }
        
        bw.write(count+"");
        bw.newLine();
        for (int[] i : graph) Arrays.fill(i, 0);
        for (boolean[] i : visited) Arrays.fill(i, false);
        // System.out.println(count);
      }
      
    }

    bw.flush();
    bw.close();
    
    

    
    
  }
}