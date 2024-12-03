package algorithm.lv1;

public class ReverseInt {
    public static void main(String[] args) {
        int[] answer = solution(12345);

        for (int i : answer) {
            System.out.println(i);
        }
    }

    public static int[] solution(long n) {
        int count = 0;
        long i = 10;

        while (true) {
            if(n % i == n) {
                break;
            } else {
                i *= 10;
                count++;
            }
        }

        int[] answer = new int[count + 1];

        i = 10;

        for(int j = 0; j < count + 1; j++) {
            answer[j] = (int) (n % i);
            n /= i;
        }

        return answer;
    }
}
