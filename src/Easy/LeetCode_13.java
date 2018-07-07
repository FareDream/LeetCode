package Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 项目名称：LeetCode
 * 包名：Easy
 * 作者：X-Z-Y
 * 时间：2018-7-7 16:45
 * 描述：给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 */
public class LeetCode_13 {
    public LeetCode_13(){
        System.out.println(mine("D"));
    }


    private static int mine(String s){
        Map<String, Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        int number = 0;
        int temp = 0;
        String[] chars = s.split("");
        if(chars.length==1){
            return map.get(chars[0]);
        }
        for (int i = 0; i < chars.length - 1; i++) {
            temp = map.get(chars[i]);
            number += temp;
            if(temp < map.get(chars[i+1])){
                number -= (temp * 2);
                if(i == chars.length-2){
                    number += map.get(chars[i + 1]);
                }
                continue;
            }
            if(i == chars.length-2){
                number += map.get(chars[i + 1]);
            }
        }
        return number;
    }
}
