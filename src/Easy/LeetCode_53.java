package Easy;

/**
 * 项目名称：LeetCode
 * 包名：Easy
 * 作者：X-Z-Y
 * 时间：2018/7/22 22:03
 * 描述：给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 */
public class LeetCode_53 {
    public LeetCode_53() {
        System.out.println(mine(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    public int mine(int[] nums){
        int maxSum = nums[0];
        int thisSum = 0;
        for (int j = 0; j < nums.length; j++) {
            thisSum += nums[j];
            if(thisSum > maxSum){
                maxSum = thisSum;
            }
            if(thisSum > 0) {

            }else if(thisSum < 0){
                thisSum = 0;
            }
        }
        return maxSum;
    }
}
