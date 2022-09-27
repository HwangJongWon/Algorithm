import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int a = Integer.parseInt(br.readLine());
    int d = Integer.parseInt(br.readLine());
    int n = Integer.parseInt(br.readLine());
    int sum=a;
    for(int i=1;i<n;i++){
      sum+=d;
    }
    System.out.println(sum);
    
    
    






    

    
  }
}