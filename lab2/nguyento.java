public class nguyento {
    public nguyento(){

    }

    public boolean isPrime(int n){
        if(n < 2){
            return false;
        }

        if(n == 2){
            return true;
        }

        if(n % 2 == 0){
            return false;
        }

        for(int i = 3; i <=Math.sqrt(n);i+=2){
            if(n % i == 0){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args){
        nguyento nt = new nguyento();
        System.out.println(nt.isPrime(0));
        System.out.println(nt.isPrime(1));
        System.out.println(nt.isPrime(2));
        System.out.println(nt.isPrime(3));
        System.out.println(nt.isPrime(4));
        System.out.println(nt.isPrime(5));
        System.out.println(nt.isPrime(Integer.MAX_VALUE));
    }
}