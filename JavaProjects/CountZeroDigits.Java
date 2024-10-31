public class CountZeroDigits {
    public static void main(String[] args) {
        System.out.println("zeroDigits(5030045) returned: " + zeroDigits(5030045));
        System.out.println("zeroDigits(11223344) returned: " + zeroDigits(11223344));
        System.out.println("zeroDigits(800003) returned: " + zeroDigits(800003));
        System.out.println("zeroDigits(0) returned: " + zeroDigits(0));
        System.out.println("zeroDigits(1008003040) returned: " + zeroDigits(1008003040));
    }

    public static int zeroDigits(int num) {
        int count = 0;

        if (num == 0) {
            return 1;
        }

        num = Math.abs(num);
        
        while (num > 0) {
            if (num % 10 == 0) {
                count++;
            }
            num /= 10;
        }

        return count;
    }
}
