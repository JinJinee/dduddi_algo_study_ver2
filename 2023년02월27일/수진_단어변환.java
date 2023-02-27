class Solution {
    static int result = Integer.MAX_VALUE;
    static boolean[] visited;
    public int solution(String begin, String target, String[] words) {
        
        visited = new boolean[words.length];
        DFS(begin, target, 0, words);
        
        int answer = 0;
        if(result != Integer.MAX_VALUE){
            answer = result;
        }
        return answer;
    }
    
    static void DFS(String str, String target, int cnt, String[] words){
        if(str.equals(target)){
            result = Math.min(result, cnt);
        }else{
            for(int i=0; i<words.length; i++){
                if(checkStr(str, words[i]) && !visited[i]){
                    visited[i] = true;
                    DFS(words[i], target, cnt+1, words);
                    visited[i] = false;
                }
            }
        }
    }
       
    static boolean checkStr(String str1, String str2){
        int cnt = 0;
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) == str2.charAt(i)){
                cnt++;
            }
        }
        
        if(str1.length()-1 == cnt){
            return true;
        }else{
            return false;
        }
    }
}
