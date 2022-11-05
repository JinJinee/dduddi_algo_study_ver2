package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 최소 힙
public class BOJ_1927_S {
   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
         
      int n = Integer.parseInt(br.readLine());
      
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      while(n-- > 0) {
         int x = Integer.parseInt(br.readLine());

         if(x == 0){
            if(pq.isEmpty()){
                sb.append(0).append("\n");
            }else{
                sb.append(pq.poll()).append("\n");
            }
         }else{
            pq.add(x);
         }
      }
      System.out.println(sb);
   }
}