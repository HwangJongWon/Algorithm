import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int d[] = new int[100];
    int n = Integer.parseInt(br.readLine());
    int arr[] = new int[n];
    
    st = new StringTokenizer(br.readLine());
    for(int i=0;i<n;i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }

    d[0] = arr[0];
    d[1] = Math.max(arr[0], arr[1]);
    
    for(int i=2; i<n;i++){
      d[i] = Math.max(arr[i-1], arr[i-2]+arr[i]);
    }
    System.out.println(d[n-1]);
  }
}