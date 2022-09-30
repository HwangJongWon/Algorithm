import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;
class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    int A[] = new int[N];
    Integer B[] = new Integer[N];
    StringTokenizer Ast = new StringTokenizer(br.readLine(), " ");
    StringTokenizer Bst = new StringTokenizer(br.readLine(), " ");
    for(int i=0; i<N;i++){
      
      A[i] = Integer.parseInt(Ast.nextToken());
      
    }
    for(int i=0; i<N;i++){
      B[i] = Integer.parseInt(Bst.nextToken());
    }
    
    Arrays.sort(A);
    Arrays.sort(B, Collections.reverseOrder());
    int sum=0;
    for(int i=0;i<N;i++){
      sum+=(A[i]*B[i]);
    }
    System.out.println(sum);
  }
}