import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int arr[] = new int[23];
    int num;
    for(int i=0;i<n;i++){
      num=sc.nextInt();
      arr[num]++;
    }
    for(int i=1;i<arr.length;i++){
      System.out.printf("%d ", arr[i]);
    }
  }
}