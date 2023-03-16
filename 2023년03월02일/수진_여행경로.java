import java.util.*;
class Solution {
    static int[] visited;
    static ArrayList<String> list;
    
    public String[] solution(String[][] tickets) {
        
        visited = new int[tickets.length];
        list = new ArrayList<String>();
        
        DFS(0, "ICN", "ICN", tickets);
    
        Collections.sort(list);
        String[] answer = list.get(0).split(" ");
        
        return answer;
    }
    
    
    static void DFS(int depth, String start, String way, String[][] tickets){
        if(depth == tickets.length){
            list.add(way);
        }else{
            for(int i=0; i<tickets.length; i++){
                if(start.equals(tickets[i][0]) && visited[i] == 0){
                    visited[i] = 1;
                    DFS(depth+1, tickets[i][1], way + " " + tickets[i][1], tickets);
                    visited[i] = 0;
                }
            }
        }
    }
}
