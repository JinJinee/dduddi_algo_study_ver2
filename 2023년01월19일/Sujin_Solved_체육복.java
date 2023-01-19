class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] students = new int[n+1];
        
        for(int i : lost){
            students[i] -= 1;
        }
        
        for(int i : reserve){
            students[i] += 1;
        }
        
        for(int i=1; i<n; i++){
            if(students[i] == 0) continue;
            if(students[i] + students[i+1] == 0){
                students[i] = 0;
                students[i+1] = 0;
            }
        }
        
        int answer = 0;
        
        for(int i=1; i<=n; i++){
            if(students[i] >= 0){
                answer++;
            }
        }
        
        return answer;
    }
}
