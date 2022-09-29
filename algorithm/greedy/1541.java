import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer subst = new StringTokenizer(br.readLine(), "-");
    int sum=Integer.MAX_VALUE;
    while(subst.hasMoreTokens()){
      int temp=0;
      StringTokenizer addst = new StringTokenizer(subst.nextToken(), "+");

      while(addst.hasMoreTokens()){
        temp+=Integer.parseInt(addst.nextToken());
      }
      if(sum==Integer.MAX_VALUE){
        sum=temp;
      }
      else{
        sum-=temp;
      }
      
    }
    System.out.println(sum);
  }
}