import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main{
  public static void main(String[] args)throws IOException{
    Scanner sc = new Scanner(System.in);
    String[] ft;
    ft=sc.next().split("\\.");
    System.out.printf("%s\n%s",ft[0],ft[1]);
  }
}