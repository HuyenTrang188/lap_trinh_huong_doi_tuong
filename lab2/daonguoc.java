public class daonguoc {

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

    public static void main(String[] args) {

        daonguoc d = new daonguoc();

        System.out.println(d.reverse(12));              
        System.out.println(d.reverse(123));             
        System.out.println(d.reverse(1234));            
        System.out.println(d.reverse(-1234));           
        System.out.println(d.reverse(0));               
        System.out.println(d.reverse(Integer.MIN_VALUE));
        System.out.println(d.reverse(Integer.MAX_VALUE));
    }
}