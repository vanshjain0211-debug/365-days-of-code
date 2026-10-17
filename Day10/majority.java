class Result {
  static int getMajorityElement(int[] nums) {
    int candidate = nums[0];
    int count = 0;

    for (int i = 0; i < nums.length; i++) {
        if(count==0){
            candidate = nums[i];
        }
        if(candidate == nums[i]){
            count++;
        }
        else{
            count--;
        }
    }
    count = 0;
    for (int i = 0; i < nums.length; i++) {
        if(nums[i] == candidate){
            count++;
        }
    }
    if(count > nums.length/2){
        return candidate;
    }
    return -1;
  }
}
public class majority {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(Result.getMajorityElement(nums));
    }
}
