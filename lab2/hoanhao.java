public class hoanhao {
    public hoanhao(){

    }

    public int reverse(int n) {

        int r = 0;

        while (n != 0) {

            int digit = n % 10;
            n = n / 10;

            if (r > Integer.MAX_VALUE / 10 ||
                (r == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (r < Integer.MIN_VALUE / 10 ||
                (r == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            r = r * 10 + digit;
        }

        return r;
    }

    public boolean isPalindrome(int n) {
        if (n < 0) {
            return false;
        }

        int reversed = reverse(n);
        return n == reversed;
    }

    public static void main(String[] args) {
        hoanhao h = new hoanhao();

        System.out.println(h.isPalindrome(121));
        System.out.println(h.isPalindrome(-121));
        System.out.println(h.isPalindrome(10));
        System.out.println(h.isPalindrome(12321));
        System.out.println(h.isPalindrome(123321));
        System.out.println(h.isPalindrome(123421));
    }

    
    
}
