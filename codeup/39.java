import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long num1 = sc.nextLong();
    long num2 = sc.nextLong();
    long sum = num1 + num2;
    System.out.printf("%d", sum);
  }
}