public class fibonacci {


    public long fib(long n) {

        if (n < 0) {
            return -1;
        }

        if (n > 100) {
            return -1;
        }

        long f0 = 0;
        long f1 = 1;
        long fn = 0;

        switch ((int)n) {

            case 0:
                return 0;

            case 1:
                return 1;

            default:
                for (long i = 2; i <= n; i++) {

                    // Kiểm tra tràn số
                    if (Long.MAX_VALUE - f1 < f0) {
                        return Long.MAX_VALUE;
                    }

                    fn = f0 + f1;
                    f0 = f1;
                    f1 = fn;
                }

                return fn;
        }
    }

    public static void main(String[] args) {

        fibonacci f = new fibonacci();

        System.out.println(f.fib(0));
        System.out.println(f.fib(1));
        System.out.println(f.fib(10));
        System.out.println(f.fib(-1));
        System.out.println(f.fib(92));
        System.out.println(f.fib(93));
    }
}