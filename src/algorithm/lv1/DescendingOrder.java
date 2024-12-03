package algorithm.lv1;

public class DescendingOrder {

    public static void main(String[] args) {
        System.out.println(solution(583274));
    }

    public static long solution(long n) {
        long answer = 0;
        long i = 10;
        int count = 0;

        while (true) {
            if(n % i == n) {
                break;
            } else {
                i *= 10;
                count++;
            }
        }

        int[] arr = new int[count + 1];

        i = 10;

        for(int j = 0; j < arr.length; j++) {
            arr[j] = (int) (n % i);
            n /= i;
        }

        for(int j = 0; j < arr.length; j++) {
            int temp = 0;
            for(int k = j + 1; k < arr.length; k++) {
                if(arr[k] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }
            }
        }


        i = 1;

        for(int j = arr.length - 1; j >= 0; j--) {
            answer += arr[j] * i;
            i *= 10;
        }

        return answer;
    }
}
