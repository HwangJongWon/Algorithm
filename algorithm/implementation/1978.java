import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    int[] arr = new int[n];
    int result=0;
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0;i<n;i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    
    for(int i=0;i<n;i++){
      boolean check = true;
      
      if(arr[i]==1)continue;
      else{
        for(int j=2;j<=Math.sqrt(arr[i]);j++){
          if(arr[i]%j==0){
            check = false;
            break;
          }
        }
        if(check==true) result++;
      }
    }
    
    System.out.println(result);
  }
}