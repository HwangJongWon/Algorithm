import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{

  public static int n,m;
  public static int[][] graph = new int[1001][1001];
  public static boolean[][] visited = new boolean[1001][1001];
  public static int dx[] = {-1,1,0,0};
  public static int dy[] = {0,0,-1,1};
  public static Queue<Node> q = new LinkedList<>();
  public static int count;
  
  public static void bfs(){

    while(!q.isEmpty()){
      Node node = q.poll();
      int x = node.getX();
      int y = node.getY();
      
      for(int i=0;i<4;i++){
        int nx = x+dx[i];
        int ny = y+dy[i];

        if(nx<0 || nx>=n || ny<0 || ny>=m) continue;
        if(graph[nx][ny]==-1)continue;
        if(graph[nx][ny]==0){
          graph[nx][ny] = graph[x][y]+1;
          
          q.offer(new Node(nx,ny));
        }
        
      }
     
    }
    int max=0;
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        if(graph[i][j]==0){
          System.out.println(-1);
          System.exit(0);
        }
        max = Math.max(max, graph[i][j]);
      }
    }
    
    if(max==1){
      System.out.println(0);
    }
    else{
      
    
      System.out.println(max-1);
    }
  }
  
   
  
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    m = Integer.parseInt(st.nextToken());
    n = Integer.parseInt(st.nextToken());

    for(int i=0;i<n;i++){
      st = new StringTokenizer(br.readLine());
      for(int j=0;j<m;j++){
        graph[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        if(graph[i][j]==1){
          q.offer(new Node(i,j));
        }
      }
    }
    
    bfs();
    
    
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