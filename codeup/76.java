import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    char a = 'a';
    char b = br.readLine().charAt(0);

    do{
      System.out.println(a);
      a++;
    }while(a<b+1);
    
    






    

    
  }
}