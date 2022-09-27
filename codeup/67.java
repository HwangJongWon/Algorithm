import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    

    if(a<0){
      System.out.println("minus");
      if(a%2==0){
        System.out.println("even");
      }
      else{
        System.out.println("odd");
      }
    }
    else{
      System.out.println("plus");
      if(a%2==0){
        System.out.println("even");
      }
      else{
        System.out.println("odd");
      }
    }

    
  }
}