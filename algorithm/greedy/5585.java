import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    int money = 1000-N;
    int count=0;
    for(;;){
      if(money>=500){
        count+=(money/500);
        
        money=money%500;
        
        if(money==0)break;
      }
      else if(money>=100){
        count+=(money/100);
        money=money%100;
        
        if(money==0)break;
      }
      else if(money>=50){
        count+=(money/50);
        money=money%50;
        
        if(money==0)break;
      }
      else if(money>=10){
        count+=(money/10);
        money=money%10;
        if(money==0)break;
      }
      else if(money>=5){
        count+=(money/5);
        money=money%5;
        if(money==0)break;
      }
      else if(money>=1){
        count+=(money/1);
        money=money%1;
        if(money==0)break;
      }
      else{
        break;
      }
    }
    System.out.println(count);
  }
}