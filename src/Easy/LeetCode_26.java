package Easy;

/**
 * 项目名称：LeetCode
 * 包名：Easy
 * 作者：X-Z-Y
 * 时间：2018-7-11 22:01
 * 描述：给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *       不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成
 */
public class LeetCode_26 {
    public LeetCode_26() {
        System.out.println(mine(new int[]{1,1,1,2,2,3,3,4}));
    }

    /**
     * 题目中并没有要求要组成数组
     * @param nums
     * @return
     */
    private static int mine(int[] nums){
        int number = 0;
        int result = 0;
        for (int i = 0; i < nums.length - 1 - number; i++) {
            if(nums[i] == nums[i + 1]){
                for (int j = i; j < nums.length - number - 1; j++) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
                i --;
                number ++;
            }else{
                result ++;
            }
        }
        result ++;
        return result;
    }


    /**
     * 最完美的解决办法
     * @param nums
     * @return
     */
    private static int removeDuplicates(int[] nums){
        if(nums.length==0)return 0;
        int i=0;
        for(int j=1;j<nums.length;j++) {
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}
