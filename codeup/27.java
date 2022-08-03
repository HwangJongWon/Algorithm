import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] year = sc.next().split("\\.");

    for(int i=year.length-1;i>=0;i--){
      if(i==0){
        System.out.printf("%04d", Integer.parseInt(year[i]));
      }
      else{
        System.out.printf("%02d", Integer.parseInt(year[i]));
        System.out.printf("-");
      }
      
        
      
    }
  }
}