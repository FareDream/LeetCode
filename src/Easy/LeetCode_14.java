package Easy;

/**
 * 项目名称：LeetCode
 * 包名：Easy
 * 作者：X-Z-Y
 * 时间：2018-7-7 22:23
 * 描述：编写一个函数来查找字符串数组中的最长公共前缀。
 *       如果不存在公共前缀，返回空字符串 ""。
 */
public class LeetCode_14 {
    public LeetCode_14(){
        System.out.println(bestCode(new String[] {"dog","dog"}));
    }

    private static String mine(String[] strs){
        String str = "";
        String temp = "";
        int j = 1;
        try{
            for (int i = 0; i < strs.length; i++) {
                if(temp.equals("")){
                    temp = strs[i].substring(0,j);
                }else{
                    if(!temp.equals(strs[i].substring(0, j))){
                        break;
                    }
                }
                if(i == strs.length - 1){
                    str = temp;
                    temp = "";
                    j ++;
                    i = -1;
                }
            }
            return str;
        }catch (StringIndexOutOfBoundsException e){
            return str;
        }
    }


    /**
     * 最好的方式
     * @param strs
     * @return
     */
    private static String bestCode(String[] strs){
        if(strs.length == 0)
        {
            return "";
        }else if(strs.length == 1)
        {
            return strs[0];
        }

        String pre = strs[0];
        int i = 0;
        //int len = strs.length;
        while(i< strs.length){
            while (strs[i].indexOf(pre) != 0){
                //indexOf：返回指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1
                //pre不是strs[i]的前缀，就缩小pre的范围
                pre = pre.substring(0,pre.length()-1);  //注意这个位置
            }
            i++;
        }
        return pre;
    }


    /**
     * 以下为时间5ms的代码
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        return find(strs, findMinLengthText(strs));
    }

    private static String find(String[] strs, String prefix) {
        if(strs == null || prefix == null || prefix.length() == 0){
            return "";
        }
        boolean result = true;
        for (String s : strs) {
            if (!s.startsWith(prefix)) {
                result = false;
            }
        }
        if (result) {
            return prefix;
        } else {
            return find(strs, prefix.substring(0, prefix.length() - 1));
        }
    }

    private static String findMinLengthText(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int min = Integer.MAX_VALUE;
        String result = null;
        for (String s : strs) {
            if (s == null) {
                continue;
            }
            int length = s.length();
            if (min > length) {
                min = length;
                result = s;
            }
        }
        return result;
    }

    private static boolean isCommonPrefix(String str, String prefix) {
        if (str == null || str.length() == 0 || prefix == null || prefix.length() == 0) {
            return false;
        }
        return str.startsWith(prefix);
    }




}
