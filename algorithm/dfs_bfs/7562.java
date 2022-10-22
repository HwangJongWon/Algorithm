import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class Main{
  public static int n; //테스트 케이스 개수
  public static int w; //체스판 한변의 길이
  public static int[][] graph = new int[301][301];
  public static Queue<Node> q = new LinkedList<>();
  public static int dx[] = {-2,-2, -1,1, 2,2, -1,1};
  public static int dy[] = {-1,1, -2,-2, -1,1, 2,2};
  public static int tx, ty;
  
  public static int bfs(){
    while(!q.isEmpty()){
      Node node = q.poll();
      int x = node.getX();
      int y = node.getY();

      for(int i=0;i<8;i++){
        int nx = x+dx[i];
        int ny = y+dy[i];

        if(nx<0 || nx>=w || ny<0 || ny>=w) continue;
        
        if(graph[nx][ny]==0){
          graph[nx][ny] = graph[x][y]+1;
          q.offer(new Node(nx, ny));
        }
        else if(graph[nx][ny]==-1){
          if(nx==tx && ny==ty) return 0;
          else{
            graph[nx][ny] = graph[x][y]+1;
            return graph[nx][ny]; 
          }
        }
        
      }
    }
    return 0;
  }
  
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    n = Integer.parseInt(br.readLine());

    for(int i=0;i<n;i++){
      w = Integer.parseInt(br.readLine());
      for (int[] g : graph) Arrays.fill(g, 0);
      
      for(int c=0;c<2;c++){//현재 있는 체스칸과 이동할 칸 저장
        st=new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        if(c==0){
          tx = a;
          ty = b;
          q.offer(new Node(a,b));
        }
        else{
          graph[a][b] = -1;
        }
        
        
      }
      
      int result = bfs();
      bw.write(result+"");
      bw.newLine();
      q.clear();
      
      
    }
    bw.flush();
    bw.close();
    
  }
  public static class Node{
    private int x;
    private int y;
    public Node(int x, int y){
      this.x = x;
      this.y = y;
    }
    public int getX(){
      return this.x;
    }
    public int getY(){
      return this.y;
    }
  }

}