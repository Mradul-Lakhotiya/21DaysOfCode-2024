public class Q2 {

    public static int findLen(int num) {
        if (num == 0) {
            return 0;
        }
        // System.out.println(num);
        return 1 + (int)findLen(num / 10);
    }

    public static int findSum(int num) {
        int len = findLen(num);

        if (len <= 1) {
            return 0;
        }
        System.out.println(num);
        return num / (int)(Math.pow(10, len - 1)) + findSum(num % (int)Math.pow(10, len - 1));
    }

    public static void main(String[] args) {
        // System.out.println(findLen(123));
        System.out.println(findSum(123));
    }
}
