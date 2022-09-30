import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String S = br.readLine();
    StringTokenizer st1 = new StringTokenizer(S,"1");
    StringTokenizer st0 = new StringTokenizer(S,"0");
    String[] arr1 = {};
    String[] arr0 = {};
    int count1=0;
    int count0=0;
    while(st1.hasMoreTokens()){
      String temp = st1.nextToken();
      count1++;
    }

    while(st0.hasMoreTokens()){
      String temp = st0.nextToken();
      count0++;
    }
    int count;
    if(count1<=count0){
      count=count1;
    }
    else{
      count=count0;
    }
    System.out.println(count);
  }
}