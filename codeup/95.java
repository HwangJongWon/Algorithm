import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<n;i++){
      arr[i]=sc.nextInt();
    }
    int min=100;
    for(int i=0;i<n;i++){
      if(arr[i]<min){
        min=arr[i];
      }
    }
    System.out.println(min);
  }
}