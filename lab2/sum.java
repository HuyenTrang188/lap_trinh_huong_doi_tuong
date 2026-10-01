public class sum {
    public sum(){

    }

    public int sumOfDigits(int n){
        int sum = 0;
        while(n!= 0){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }

    public static void main(String [] args){
        sum s = new sum();
        System.out.println(s.sumOfDigits(0));
        System.out.println(s.sumOfDigits(123));
        System.out.println(s.sumOfDigits(4567));
    }

}
