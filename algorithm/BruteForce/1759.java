import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main{

  public static int L, C;
  public static String[] arr;
  public static String[] temp;
  public static boolean[] visited;
  public static int moCount;
  public static int jaCount;
  public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  public static void dfs(int x, int depth, int moCount, int jaCount)throws IOException{

    if(depth == L){
      
      for(int i=0;i<L;i++){
        
        if(moCount>=1 && jaCount>=2){
          bw.write(temp[i]+"");
        }
        else{
          return;
        }
        
      }
      bw.newLine();
      return;
    }

    for(int i=x;i<C;i++){
      
      if(!visited[i]){
        visited[i] = true;
        
        temp[depth] = arr[i];
        if(temp[depth].equals("a") || temp[depth].equals("e") || temp[depth].equals("i") || temp[depth].equals("o") || temp[depth].equals("u")){
          dfs(i, depth+1, moCount+1, jaCount);
        }
        
        else{
          dfs(i, depth+1, moCount, jaCount+1);
        }
        
        visited[i] = false;
        
      }
    }
  }
  
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    StringTokenizer st = new StringTokenizer(br.readLine());

    L = Integer.parseInt(st.nextToken());
    C = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    arr = new String[C];
    temp = new String[L];
    visited = new boolean[C];
    for(int i=0;i<C;i++){
      arr[i] = st.nextToken();
    }

    Arrays.sort(arr);
    
    dfs(0,0,0,0);
    bw.flush();
    bw.close();
  }
}