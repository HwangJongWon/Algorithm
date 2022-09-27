import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    int c = Integer.parseInt(br.readLine());

    if(a%2==0){
      System.out.println("even");
    }
    else{
      System.out.println("odd");
    }

    if(b%2==0){
      System.out.println("even");
    }
    else{
      System.out.println("odd");
    }

    if(c%2==0){
      System.out.println("even");
    }
    else{
      System.out.println("odd");
    }
    
  }
}