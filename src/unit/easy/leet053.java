package unit.easy;

public class leet053 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,5};
        int[] nums2 = {1};
        int[] nums3 = {-2,1};
        int[] nums4 = {-2,1,4,-5};
        System.out.println(maxSubArray(nums));
        System.out.println(maxSubArray(nums2));
        System.out.println(maxSubArray(nums3));
        System.out.println(maxSubArray(nums4));

    }
    public static int maxSubArray(int[] nums) {
        if(nums.length==0 || nums==null) {
            return 0;

        }
        int temp = nums[0];
        int max = temp;
        for(int i = 1; i< nums.length; i++) {
            temp = Math.max(temp+nums[i], nums[i]);
            max = Math.max(temp, max);
        }
        return max;
    }


}
