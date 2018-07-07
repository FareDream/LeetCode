package Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 项目名称：LeetCode
 * 包名：Easy
 * 作者：X-Z-Y
 * 时间：2018-6-27 22:34
 * 描述：给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 *       你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 */
public class LeetCode_1 {
    public LeetCode_1(){
        int[] ints = twoSum_3(new int[]{2, 7, 11, 15}, 9);
        for (int i = 0; i < ints.length ; i++) {
            System.out.print(ints[i]);
        }
    }

    private static int[] twoSum_1(int[] nums, int target) {
        for(int i = 0; i < nums.length - 1; i ++){
            for (int j = i + 1; j < nums.length ; j++) {
                if(nums[i] + nums[j] == target){
                    return new int[] {nums[i], nums[j]};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    /**
     * 两遍hash表方法
     * @param nums
     * @param target
     * @return
     */
    private static int[] twoSum_2(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }

        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            if(map.containsKey(result) && map.get(result) != i){
                return new int[] {i, map.get(result)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * 一遍哈希表
     * @param nums
     * @param target
     * @return
     */
    private static int[] twoSum_3(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            if(map.containsKey(result)){
                return new int[] {i, map.get(result)};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
