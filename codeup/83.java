import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int a = Integer.parseInt(br.readLine());

    for(int i=1;i<=a;i++){
      
      if(i%3==0){
        System.out.printf("X ");
      }
      else{
        System.out.printf("%d ",i);
      }
    }
    
    






    

    
  }
}