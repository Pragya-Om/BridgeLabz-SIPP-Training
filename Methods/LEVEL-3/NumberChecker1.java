public class NumberChecker1 {
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] extractDigits(int num) {
        String str = String.valueOf(num);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = Character.getNumericValue(str.charAt(i));
        }
        return digits;
    }

    public static boolean isDuck(int num) {
        int[] digits = extractDigits(num);
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrong(int num) {
        int[] digits = extractDigits(num);
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, digits.length);
        }
        return sum == num;
    }

    public static int[] findTwoLargest(int[] digits) {
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > max) {
                second = max;
                max = d;
            } else if (d > second && d != max) {
                second = d;
            }
        }
        return new int[]{max, second};
    }

    public static int[] findTwoSmallest(int[] digits) {
        int min = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < min) {
                second = min;
                min = d;
            } else if (d < second && d != min) {
                second = d;
            }
        }
        return new int[]{min, second};
    }

    public static void main(String[] args) {
        int num = 153;
        int[] digits = extractDigits(num);
        System.out.println("Duck? " + isDuck(num));
        System.out.println("Armstrong? " + isArmstrong(num));
    }
}
