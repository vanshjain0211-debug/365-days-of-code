public class longestSubarray {
    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 7;

        int left = 0;
        int sum = 0;
        int max = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            int len = right - left + 1;

            if (len > max) {
                max = len;
            }
        }

        System.out.println(max);
    }
}