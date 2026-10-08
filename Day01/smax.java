public class smax {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 5, 8, 2, 9};
        int max;
        int smax;
        if(arr[1] > arr[0]){
            max = arr[1];
            smax = arr[0];
        }
        else{
            max = arr[0];
            smax = arr[1];
        }
        for (int i = 2; i < arr.length; i++) {
            if(arr[i] > max){
                smax = max;
                max = arr[i];
            }
            else if(arr[i] > smax && arr[i] != max){
                smax = arr[i];
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Second Maximum: " + smax);
    }
}
