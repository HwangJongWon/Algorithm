import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String st=sc.next();
    char[] arr = st.toCharArray();
    for(int i=0;i<arr.length;i++){
      System.out.print("["+arr[i]);
      for(int j=arr.length-1;j>i;j--){
        System.out.print(0);
      }
      System.out.println("]");
    }
    
    
  }
}