package bai2_3;

public class NumberWrapper {
     private int value;
    
    public NumberWrapper(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static void swap(NumberWrapper a, NumberWrapper b) {
        NumberWrapper temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        NumberWrapper num1 = new NumberWrapper(5);
        NumberWrapper num2 = new NumberWrapper(10);

        NumberWrapper.swap(num1, num2);

        System.out.println("sau khi swap num1 = " + num1.getValue() + ", num2 = " + num2.getValue());
    }

}
