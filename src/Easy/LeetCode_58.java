package Easy;

/**
 * 项目名称：LeetCode
 * 包名：Easy
 * 作者：X-Z-Y
 * 时间：2018/8/12 14:34
 * 描述：给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 *       如果不存在最后一个单词，请返回 0 。
 */
public class LeetCode_58 {
    public LeetCode_58() {
        System.out.println(mine(" "));
    }

    private static int mine(String s){
        if(s.trim().equals("")){
            return 0;
        }
        String[] arrayS = s.split(" ");
        char[] chars = arrayS[arrayS.length - 1].toCharArray();
        return chars.length;
    }
}
