import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Queue<Character> q = new LinkedList<>();
        for(int i=0; i<s.length(); i++){
            q.add(s.charAt(i));
        }
        
        int tmp = 0; 
        
        while(!q.isEmpty()){
            char c = q.poll();
            if(tmp <= 0 && c == ')'){
                answer = false;
                break;
            }else{
                if(c == '(') tmp++;
                else tmp--;
            }
        }
        
        if(tmp != 0) answer = false;
        
        return answer;
    }
}
