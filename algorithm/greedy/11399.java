import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    

    int n = Integer.parseInt(br.readLine());
    int[] parr = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine()," ");
    for(int i=0;i<n;i++){
      parr[i]=Integer.parseInt(st.nextToken());
    }

    for(int i=0;i<n-1;i++){
      int idx = i;
      for(int j=i+1;j<n;j++){
        if(parr[j]<parr[idx]) idx = j;
        
      }
      int temp = parr[i];
      parr[i] = parr[idx];
      parr[idx] = temp;
    }
    
    
    int sum=0;
    for(int i=0;i<n;i++){
      for(int j=0;j<=i;j++){
        sum+=parr[j];
      }
    }
    System.out.println(sum);

    
  }
}
