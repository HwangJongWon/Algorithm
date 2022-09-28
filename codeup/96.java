import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int arr[][] = new int[19][19];
    
    for(int i=0; i<n;i++){
      int x = Integer.parseInt(br.readLine());
      int y = Integer.parseInt(br.readLine());
      arr[x-1][y-1] = 1;
    }
    
    for(int i=0;i<19;i++){
      for(int j=0;j<19;j++){
        System.out.printf("%d ",arr[i][j]);
      }
      System.out.println();
    }
    
  }
}