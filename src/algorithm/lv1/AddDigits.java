package algorithm.lv1;

public class AddDigits {

    public static void main(String[] args) {
        int n = 254;

        System.out.println(solution(n));
    }

    public static int solution(int num) {
        int sum = 0;

        while (true) {
            sum += num % 10;
            num = num / 10;

            if (num == 0) break;
        }

        return sum;
    }

}
