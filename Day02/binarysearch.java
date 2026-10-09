package sorting;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 17, 21, 29, 35, 41, 50};
        int target = 41;
        boolean found = false;
        int size = arr.length;
        int low = 0;
        int high = size-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                found = true;
                break;
            }
            else if(arr[mid] > target){
                high = mid - 1;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
        }
        if(found){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        }

    }
