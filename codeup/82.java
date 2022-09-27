import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int a = Integer.parseInt(br.readLine(),16);

    for(int i=0; i<16;i++){
      System.out.printf("%X*%X=%X\n",a,i,a*i);


      
      
    }
    
    






    

    
  }
}