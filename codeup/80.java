import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int a = Integer.parseInt(br.readLine());
    int sum=0;
    int i=0;
    for(;;){
      i++;
      sum+=i;
      if(sum>=a) break;
      
    

      
      
    }
    System.out.println(i);
    
    






    

    
  }
}