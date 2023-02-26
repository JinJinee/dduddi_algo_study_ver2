class Solution {
    public int solution(int chicken) {
        int answer = 0;
        
        int tmp = 0;
        while(chicken >= 10){
            tmp = chicken / 10;
            chicken %= 10;
            chicken += tmp;
            answer += tmp;
        }
        
        return answer;
    }
}
