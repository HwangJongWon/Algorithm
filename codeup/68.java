import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    if(a>=90&&a<=100){
      System.out.println('A');
    }
    else if(a>=70&&a<=89){
      System.out.println('B');
    }
    else if(a>=40&&a<=69){
      System.out.println('C');
    }
    else{
      System.out.println('D');
    }

    
  }
}