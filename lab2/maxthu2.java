public class maxthu2 {
    public maxthu2() {
    }

    public int secondLargest(int[] arr){
        int max = -1;
        int secondMax = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args){
        maxthu2 m = new maxthu2();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 8};
        System.out.println(m.secondLargest(arr));
    }
}
