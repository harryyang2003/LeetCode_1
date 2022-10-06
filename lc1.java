public class lc1 {
    private int[] nums = new int[100];
    private int target;

    public int[] twoSum(int[] nums, int target) {
        int[] twoSum = new int[2];
        for (int i=0;i<nums.length;i++){
            for (int j=i;j<nums.length;i++){
                if(nums[i]+nums[j]==target) {twoSum[0]=i;twoSum[1]=j;return twoSum;}
            }
        }
        return twoSum;
    }
}
