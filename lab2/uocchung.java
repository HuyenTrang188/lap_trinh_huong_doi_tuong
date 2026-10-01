public class uocchung {
    public uocchung() {
    }

    public int gcd(int a, int b){

        a = Math.abs(a);
        b = Math.abs(b);

        while(b != 0){
            int temp = a%b;
            a = b;
            b = temp;
        }

        return a;
    }

    public static void main(String[] args){
        uocchung uc = new uocchung();
        System.out.println(uc.gcd(12, 8));
        System.out.println(uc.gcd(1,1));
        System.out.println(uc.gcd(0, 5));
        System.out.println(uc.gcd(-12, 8));
        System.out.println(uc.gcd(12, -8));
    }
}
