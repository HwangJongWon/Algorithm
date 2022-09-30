import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;
class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    Integer Narr[] = new Integer[N];
    for(int i=0;i<N;i++){
      Narr[i] = Integer.parseInt(br.readLine());
    }
    int max_weight=0;
    Arrays.sort(Narr,Collections.reverseOrder());
    for(int i=0;i<N;i++){
     
      if(max_weight < Narr[i]*(i+1)){
        max_weight = Narr[i]*(i+1);
      }
    }
    
  

    System.out.println(max_weight);
    
  }
}