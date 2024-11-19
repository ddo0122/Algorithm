package algorithm.lv0;

public class Compare {
    public static void main(String[] args) {
        int num1 = 10, num2 = 10;
        System.out.println(soultion(num1, num2));
    }

    static int soultion (int num1, int num2){
        if (num1 != num2){
            return -1;
        }

        return 1;
    }
}
