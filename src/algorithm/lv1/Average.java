package algorithm.lv1;

public class Average {
    public static void main(String[] args) {
        int arr[] = {5,5};

        System.out.println(solution(arr));
    }

    public static double solution(int[] arr) {
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        return (double) sum / arr.length;
    }
}
