import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());

    if(a==1){
      System.out.println(0);
    }
    else{
      System.out.println(1);
    }
    
    
  }
}