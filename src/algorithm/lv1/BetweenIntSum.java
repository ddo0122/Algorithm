package algorithm.lv1;

public class BetweenIntSum {
    public static void main(String[] args) {
        System.out.println(solution(5,3));
    }

    public static int solution(int a, int b) {
        int answer = 0;

        for (int i = a > b ? b : a; i <= Math.max(a,b); i++) {
            answer += i;
        }

        return answer;
    }
}
