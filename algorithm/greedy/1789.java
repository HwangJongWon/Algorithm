import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    long S = Long.parseLong(br.readLine());

    int arr[] = {};
    long sum=0;
    long count=0;
    int i=1;
    while(true){
      
      sum+=i;
      i++;
      count++;
      if(sum>S){
        count-=1;
        break;
      }
    }
    System.out.println(count);
  }
}