import java.util.Arrays;

public class _0007ReverseInteger {

    public static void main(String[] args) {
        _0007ReverseInteger reverseInteger = new _0007ReverseInteger();
        int x = 1563847412;
        int reversedX = reverseInteger.reverse(x);
        System.out.println(x + " => " + reversedX);
    }

    public int reverseBestOptimal(int x) {
        int reversedX = 0;
        while (x != 0) {
            int digit = x % 10;
            if (reversedX > Integer.MAX_VALUE / 10 || (reversedX == Integer.MAX_VALUE / 10 && digit > 7)) return 0;
            if (reversedX < Integer.MIN_VALUE / 10 || (reversedX == Integer.MIN_VALUE / 10 && digit < -8)) return 0;

            reversedX = reversedX * 10 + digit;
            x /= 10;
        }

        return reversedX;
    }

    public int reverse(int x) {
        if (x == Integer.MIN_VALUE) return 0;

        int reversedX = 0;
        int numberOfDigits = x == 0 ? 1 : (int) Math.log10(Math.abs(x)) + 1;
        System.out.printf("Number of digits in %s is %s\n", x, numberOfDigits);

        int multiplier = (int) Math.pow(10, numberOfDigits - 1);
        System.out.printf("The initial multiplier is %s\n", multiplier);
        while (x != 0) {
            int digit = x % 10;
            reversedX += digit * multiplier;
            if ((reversedX / multiplier) % 10 != digit) return 0;
            System.out.println(multiplier + " " + digit + " " + reversedX);

            multiplier /= 10;
            x /= 10;
    }

    public int reverseBruteForce(int x) {
        int reversedX = 0;
        char[] digits = String.valueOf(x).toCharArray();
        System.out.println(Arrays.toString(digits));

        int left = digits[0] == '-' ? 1 : 0, right = digits.length - 1;
        while (left < right) {
            char digit = digits[left];
            digits[left] = digits[right];
            digits[right] = digit;

            left += 1; right -= 1;
        }
        System.out.println(Arrays.toString(digits));

        int multiplier = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == '-') break;
            int temp = reversedX;
            reversedX += (digits[i] - '0') * multiplier;
            System.out.println(multiplier + " " + reversedX);
            if ((reversedX - temp) / multiplier != digits[i] - '0' || reversedX < 0) {
                reversedX = 0;
                break;
            }
            multiplier *= 10;
        }
        if (digits[0] == '-') reversedX *= -1;

        return reversedX;
    }
}
