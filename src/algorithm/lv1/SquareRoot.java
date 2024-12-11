package algorithm.lv1;

public class SquareRoot {
    public static void main(String[] args) {
        long n = 121;
        System.out.println(solution(n));
    }

    public static long solution(long n) {
        long num = 0;

        for (long i = 1; i <= n; i++) {
            num = i;

            if (num * num == n) {
                num += 1;
                return num * num;
            }
        }
        return -1;
    }
}
