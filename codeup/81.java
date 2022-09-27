import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    int m = Integer.parseInt(br.readLine());
    for(int i=1;i<=n;i++){
      for(int j=1;j<=m;j++){
        System.out.printf("%d %d\n",i,j);
      }
    }
    
    






    

    
  }
}