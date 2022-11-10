import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
    StringTokenizer st = new StringTokenizer(br.readLine());
    int h = Integer.parseInt(st.nextToken());
    int w = Integer.parseInt(st.nextToken());

    int height[] = new int[w];
    st = new StringTokenizer(br.readLine());
    
    for(int i=0;i<w;i++){
      height[i] = Integer.parseInt(st.nextToken());
    }
    int sum=0;
    for(int i=1;i<w-1;i++){
      int current = height[i];
      int left_Max = current;
      int right_Max = current;
      int current_Max = current;
      for(int l=i-1;l>=0;l--){
        left_Max = Math.max(left_Max, height[l]);
      }
      for(int r=i+1;r<w;r++){
        right_Max = Math.max(right_Max, height[r]);
      }
      current_Max = Math.min(left_Max, right_Max);
      if(height[i]>current_Max)continue;
      sum+=current_Max-height[i];
    }
    System.out.println(sum);
    
  }
}