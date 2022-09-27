import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int r = Integer.parseInt(br.readLine());
    int g = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    int count=0;
    for(int i=0;i<r;i++){
      for(int j=0;j<g;j++){
        for(int k=0;k<b;k++){
          System.out.printf("%d %d %d\n",i,j,k);
          count++;
        }
      }
    }
    
    System.out.println(count);
    
    
    






    

    
  }
}