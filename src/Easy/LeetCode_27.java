package Easy;

/**
 * 项目名称：LeetCode
 * 包名：Easy
 * 作者：X-Z-Y
 * 时间：2018-7-14 22:35
 * 描述：给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 *       不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *       元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 */
public class LeetCode_27 {
    public LeetCode_27() {
        System.out.println(removeElement(new int[]{3,2,2,3},3));
    }

    private static int mine(int[] nums, int val){
        int temp = 0;
        int num = 0;
        for (int i = 0; i < nums.length - num; i++) {
            if(nums[i]!=val){
                temp ++;
                continue;
            }else{
                for (int j = i; j < nums.length - 1 - num; j++) {
                    int a = nums[j];
                    nums[j] = nums[j +1];
                    nums[j + 1] = a;
                }
                num ++;
                i--;
            }
        }
        return temp;
    }


    /**
     * 5ms用时。直接替换不考虑顺序
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                // reduce array size by one
                n--;
            } else {
                i++;
            }
        }
        return n;
    }
}
