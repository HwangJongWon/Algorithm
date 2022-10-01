import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.Arrays;
//30의 배수가 되기 위해서는 자리수에 "0"이 포함되어 있어야하고,
// 각 자리 수의 합이 3의 배수여한다.
class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // StringTokenizer st = new StringTokenizer(br.readLine(), "");
    String[] N = br.readLine().split("");
    int sum=0;
    boolean Zero = false;
    Arrays.sort(N);

    for(String i: N){
      sum+=Integer.parseInt(i);
      if(i.equals("0")){
        Zero = true;
      }
    }

    if(Zero && sum%3==0){
      for(int i = N.length-1; i>=0;i--){
        System.out.print(N[i]);
      }
    }
    else{
      System.out.println(-1);
    }
    
    
    
    
    

    
  }
}