import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node{
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

public class Main{
  public static int[][] graph = new int[201][201];

  public static int dx[] = {-1, 1, 0, 0}
  public static int dy[] = {0, 0, -1, 1}
  
  public static int bfs(int x, int y){
    Queue<Node> q = new LinkedList<>();
    q.offer(new Node(x, y));

    while(!q.isEmpty()){
      Node node = q.poll();
      x = node.getX();
      y = node.getY();

      for(int i=0; i<4;i++){
        int nx = x + dx[i];
        int ny = y + dy[i];

        if(nx<0 || nx>=n || ny<0 || ny>=m) continue;

        if(graph[nx][ny] == 0) continue;

        if(graph[nx][ny]==1){
          graph[nx][ny] = graph[x][y] +1;
          q.offer(new Node(nx, ny));
        }
      }
    }
  }



  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    String s;
    for(int i=0;i<n;i++){
      s=br.readLine();
      for(int j=0;j<m;j++){
        graph[i][j] = s.charAt(j) - '0';
      }
    }

    System.out.println(bfs(0,0));
  }
}