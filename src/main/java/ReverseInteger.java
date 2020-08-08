class ReverseInteger {

    public int reverse(int x) {
        if (x < 0) {
            x = (-1) * (x);
            if (x % 10 != 0) {
                x = correctForZeroes(x);
            }
            return (-1 * reverseInt(x));
        } else {
            x = correctForZeroes(x);
            return reverseInt(x);
        }
    }

    public int correctForZeroes(int num) {
        while (num % 10 == 0) {
            num = num / 10;
        }
        return num;
    }

    public int reverseInt(int x) {
        int reverseNumber = 0;
        while (x != 0) {
            if (reverseNumber != 0) {
                reverseNumber = (reverseNumber * 10) + (x % 10);
            } else {
                reverseNumber = reverseNumber + (x % 10);
            }
            x = x / 10;
        }
        return reverseNumber;
    }

    public static void main(String args[]) {
        ReverseInteger r = new ReverseInteger();
        System.out.println("Reversed Number:- " + r.reverse(-123));
    }
}