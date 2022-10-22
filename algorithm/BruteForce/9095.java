import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());
    int arr[] = {1,2,3};
    int d[] = new int[11];
    int n;

    
    for(int j=0;j<t;j++){
      n = Integer.parseInt(br.readLine());
      d[1]=1;
      d[2]=2;
      d[3]=4;
      for(int i=4;i<=n;i++){
        d[i] = d[i-1]+d[i-2]+d[i-3];
      }
      System.out.println(d[n]);
      Arrays.fill(d,0);
    }
    
    
  }
}