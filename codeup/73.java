import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int a = 1;
    while(a!=0){
      a = Integer.parseInt(st.nextToken());
      if(a==0) break;
      System.out.println(a);
    }
    






    

    
  }
}