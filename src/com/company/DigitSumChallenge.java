public class DigitSumChallenge {
    public static int sumDigits(int num) {

        if (num < 0) {
            return -1;
        } else {
            int temp = num, sum = 0;

            while (temp > 0) {
                sum += (temp % 10);
                temp /= 10;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(15119));
    }
}
