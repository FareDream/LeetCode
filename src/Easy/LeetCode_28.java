package Easy;

/**
 * 项目名称：LeetCode
 * 包名：Easy
 * 作者：X-Z-Y
 * 时间：2018-7-14 23:46
 * 描述：实现 strStr() 函数。
 *       给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。
 *       如果不存在，则返回  -1。
 */
public class LeetCode_28 {
    public LeetCode_28() {
        System.out.println(mine("aaaaa","bba"));
    }

    private static int mine(String haystack, String needle){
        if(needle.equals("") || haystack.equals(needle)){
            return 0;
        }
        if(haystack.equals("") || haystack.length() < needle.length()){
            return -1;
        }
        String[] haystacks = haystack.split("");
        String[] needles = needle.split("");
        for (int i = 0; i < haystacks.length - needle.length()  + 1; i++) {
            int temp = 0;
            int tempI = i;
            while (temp < needles.length && haystacks[tempI].equals(needles[temp])){
                tempI ++;
                temp++;
            }
            if(temp == needles.length){
                return i;
            }
            temp = 0;
            if(i == haystacks.length - needles.length){
                return -1;
            }
        }
        return 0;
    }
}
