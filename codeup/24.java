import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);  
    String st = sc.next();
    for(int i=0; i<st.length();i++){
      System.out.println("\'"+ st.charAt(i) + "\'");
    }
  }
}