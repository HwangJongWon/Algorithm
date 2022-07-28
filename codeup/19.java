import java.util.Scanner;


class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String a[]=sc.next().split("\\.");
    sc.close();

    int year=Integer.parseInt(a[0]);
    int month=Integer.parseInt(a[1]);
    int il=Integer.parseInt(a[2]);
    System.out.printf("%04d"+"."+"%02d"+"."+"%02d",year, month, il);
    
  }
}