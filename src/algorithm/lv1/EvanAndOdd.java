package algorithm.lv1;

public class EvanAndOdd {
    public static void main(String[] args) {
        int n = 7;

        System.out.println(solution(n));
    }

    public static String solution(int n) {
        String answer = "";

        return answer = n % 2 == 0 ? "even" : "odd";
    }
}
