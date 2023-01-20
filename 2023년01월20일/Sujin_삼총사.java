class Solution {
    static int answer = 0;
    static int n = 0;
    
    public int solution(int[] number) {
        
        n = number.length;
        DFS(0, 0, number, 0);
        
        return answer;
    }
    
    static void DFS(int L, int sum, int[] arr, int cnt){
        if(cnt > 3) return;
        if(L == n){
            if(sum == 0 && cnt == 3){
                answer++;
            }
            
        }else{
            DFS(L+1, sum+arr[L], arr, cnt+1);
            DFS(L+1, sum, arr, cnt);
        }
    }
}
