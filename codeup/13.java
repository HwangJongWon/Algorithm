import java.util.Scanner;

class Main{
  public static void main(String[] args){
    int a,b;
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    
    sc.close();

    System.out.printf("%d %d", a,b);
  }
}