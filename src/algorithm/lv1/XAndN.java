package algorithm.lv1;

public class XAndN {

    public static void main(String[] args) {
        System.out.println(solution(2, 5));
    }

    public static long[] solution(long x, int n) {
        long[] answer = new long[n];
        long y = x;

        for (int i = 0; i < n; i++) {
            answer[i] = y;
            y += x;
        }
        return answer;

    }
}
