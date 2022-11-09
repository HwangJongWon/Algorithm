import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

  public static int n;
  public static int graph[][];
  public static boolean visited[][];
  public static int check[][];
  public static int landNum = 2;
  public static int dx[] = {-1,1,0,0};
  public static int dy[] = {0,0,-1,1};
  public static int tempAnswer = Integer.MAX_VALUE;
  
  public static void landCheck(int x, int y){
    visited[x][y] = true;
    Queue<Node> q = new LinkedList<>();
    q.offer(new Node(x,y,0));
    while(!q.isEmpty()){
      Node node = q.poll();
      x = node.getX();
      y = node.getY();
      graph[x][y] = landNum;
      for(int i=0;i<4;i++){
        int nx = x+dx[i];
        int ny = y+dy[i];
        if((nx>=0 && nx<n && ny>=0 && ny<n)&&!visited[nx][ny]&&graph[nx][ny]==1){
          visited[nx][ny] = true;
          graph[nx][ny] = landNum;
          q.offer(new Node(nx, ny,0));
        }
      }
    }
    landNum++;
  }

  public static int dari(int x, int y){
    visited[x][y] = true;
    Queue<Node> q = new LinkedList<>();
    q.offer(new Node(x,y,0));
    int idxNum = graph[x][y];
    while(!q.isEmpty()){
      Node node = q.poll();
      x = node.getX();
      y = node.getY();
      
      for(int i=0;i<4;i++){
        int nx = x+dx[i];
        int ny = y+dy[i];
        if((nx>=0 && nx<n && ny>=0 && ny<n)&&!visited[nx][ny]&&graph[nx][ny]!=idxNum){
          visited[nx][ny] = true;
          
          
          if(graph[nx][ny]==0){
            q.offer(new Node(nx,ny,node.getCount()+1));
            
          }
          else{
            tempAnswer = Math.min(tempAnswer, node.getCount());
          }
          
        }
      }
    }
    return tempAnswer;
  }
  
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    n = Integer.parseInt(br.readLine());
    graph = new int[n][n];
    visited = new boolean[n][n];
    check = new int[n][n];
    StringTokenizer st;
    for(int i=0;i<n;i++){
      st = new StringTokenizer(br.readLine());
      for(int j=0;j<n;j++){
        graph[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(!visited[i][j] && graph[i][j]==1){
          
          landCheck(i,j);
        }
      }
    }
    int result=0;
    for(int i=0;i<n;i++){
      
      for(int j=0;j<n;j++){
        visited = new boolean[n][n];
        if(!visited[i][j]&&graph[i][j]>=2){
          
          result = dari(i,j);
          // System.out.println(result);
        }
      }
    }
    System.out.println(result);
    

    
    
    
  }

  public static class Node{
    private int x;
    private int y;
    private int count;
    public Node(int x, int y, int count){
      this.x = x;
      this.y = y;
      this.count = count;
    }
    public int getX(){
      return this.x;
    }
    public int getY(){
      return this.y;
    }
    public int getCount(){
      return this.count;
    }
  }
}