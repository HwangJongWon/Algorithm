import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int N = Integer.parseInt(br.readLine());
    long dorolength[] = new long[N-1];
    long liter[] = new long[N];
    StringTokenizer dorost = new StringTokenizer(br.readLine(), " ");
    for(int i=0; i<N-1;i++){
      dorolength[i] = Long.parseLong(dorost.nextToken());
      
    }
    StringTokenizer literst = new StringTokenizer(br.readLine(), " ");
    for(int i=0;i<N;i++){
      liter[i] = Long.parseLong(literst.nextToken());
    }
    long sum=0;
    long min=liter[0];
    for(int i=0;i<N-1;i++){
      if(liter[i]<min){
        min=liter[i];
      }
      sum+=(min*dorolength[i]);
    }
    
    System.out.println(sum);
  }
}