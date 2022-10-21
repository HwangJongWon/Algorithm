import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    int arr[]={500,100,50,10,5,1};

    int money = 1000-N;
    int count=0;
    for(int i=0;i<6;i++){
      count+=(money/arr[i]);
      money=money%arr[i];
    }

    System.out.println(count);
  }
}