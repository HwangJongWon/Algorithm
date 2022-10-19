import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

class Main{
  public static boolean[] visited;
  public static boolean status;
  public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
  
  
  public static void dfs(int x, int depth){
    
    if(depth==5){
      
      status = true;
      return;
    }
    visited[x] = true;
    
    

    
  
    
    for(int i=0;i<graph.get(x).size();i++){
      int y = graph.get(x).get(i);
      
      if(!visited[y]){
        
        dfs(y, depth+1);

      }
    }
    
    visited[x]=false;
    
  }

  
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    visited = new boolean[n];
    for(int i=0;i<n;i++){
      graph.add(new ArrayList<Integer>());
    }
    
    
		
    
    for(int i=0;i<m;i++){
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      
      graph.get(a).add(b);
      graph.get(b).add(a);
      
    }
    status = false;
    
    for(int i=0;i<n;i++){
      dfs(i,1);
      if(status==true){
        System.out.println(1);
        return;
      }
    }
    
      System.out.print(0);
    
    
    
    
    
  }
}