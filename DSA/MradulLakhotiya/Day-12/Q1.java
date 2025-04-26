import java.util.HashMap;

public class Q1 {

    public static HashMap<Integer, Integer> memo = new HashMap<>();

    static {
        memo.put(0, 0);
        memo.put(1, 1);
    }

    public static int solution(int n) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        else {
            int num = solution(n - 1) + solution(n - 2);
            memo.put(n, num);
            return solution(n - 1) + solution(n - 2);
        }
    }

    public static void main(String[] args) {
        int input = 15;
        int res = solution(input);
        System.out.println(res);
    }
}