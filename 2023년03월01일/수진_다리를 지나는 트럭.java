import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
    
        Queue<Integer> trucks = new LinkedList<>();
        Queue<Integer> bridge = new LinkedList<>();
        
        for(int i=0; i<truck_weights.length; i++){
            trucks.add(truck_weights[i]);
        }

        for(int i=0; i<bridge_length; i++){
            bridge.add(0);
        }
                
        int total = 0; 
        int answer = 0;
        
        while(true){
            
            total -= bridge.poll();
            
            if(!trucks.isEmpty() && total+trucks.peek() <= weight){
                total += trucks.peek();
                bridge.add(trucks.poll());
            }else{
                bridge.add(0);
            }
            
            answer++;
            if(total == 0) break;
        }

        return answer;
    }
}
