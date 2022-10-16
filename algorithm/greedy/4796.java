import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.OutputStreamWriter;
class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int L,P,V;
    int num=0;
    int count=0;
    while(true){
      L=Integer.parseInt(st.nextToken());
      P=Integer.parseInt(st.nextToken());
      V=Integer.parseInt(st.nextToken());
      if(L==0&&P==0&&V==0) break;
      num++;
      
      count=(V/P)*L + Math.min((V%P), L);
      st = new StringTokenizer(br.readLine());
      bw.write("Case "+ num+": "+ count+"\n");
    }
    bw.flush();
    bw.close();
    

    
  }
}