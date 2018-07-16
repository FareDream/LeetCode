package Easy;

/**
 * 项目名称：LeetCode
 * 包名：Easy
 * 作者：X-Z-Y
 * 时间：2018-7-16 21:43
 * 描述：给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *       你可以假设数组中无重复元素。
 */
public class LeetCode_35 {
    public LeetCode_35() {
        System.out.println(mine(new int[]{1},1));
    }

    private static int mine(int[] nums, int target){
        if(target <= nums[0]){
            return 0;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == target){
                return i;
            }
            if(nums[i + 1] == target || (nums[i] < target && nums[i + 1] > target)){
                return i + 1;
            }
        }
        return nums.length;
    }


    /**
     * 二分法
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {
        int finish=nums.length-1,start=0;
        int mid;
        while(finish-start>1){
            mid=(finish+start)/2;
            if(target>nums[mid]){
                start=mid;
            }else{
                finish=mid;
            }
        }
        return target>nums[start]?(target>nums[finish]?finish+1:finish):start;
    }
}
