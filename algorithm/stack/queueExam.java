import java.util.*;

public class Main{
  public static void main(String[] args){
    Queue<Integer> q = new LinkedList<>();

    q.offer(5); //큐 삽입
    q.offer(2);
    q.offer(3);
    q.offer(7);
    q.poll(); //큐 꺼내기
    q.offer(1);
    q.offer(4);
    q.poll();
    while(!q.isEmpty()){
      System.out.print(q.poll()+" "); //큐 꺼내고 바로 출력가능  
    }
  }
}