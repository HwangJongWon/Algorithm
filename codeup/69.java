import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char a = br.readLine().charAt(0);
    switch(a){
      case 'A':
        System.out.println("best!!");
        break;
      case 'B':
        System.out.println("good!!");
        break;
      case 'C':
        System.out.println("run!!");
        break;
      case 'D':
        System.out.println("slowly");
        break;
      default:
        System.out.println("what?");
      
    }






    

    
  }
}