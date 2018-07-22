package Easy;

/**
 * 项目名称：LeetCode
 * 包名：Easy
 * 作者：X-Z-Y
 * 时间：2018/7/20 11:37
 * 描述：报数序列是指一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 */
public class LeetCode_38 {
    public LeetCode_38() {
        System.out.println(countAndSay(3));
    }

    /**
     * 错误理解
     * @param n
     * @return
     */
    private static String mine(int n){
        if(n == 1){
            return "1";
        }
        String str = "1";
        while (n > 1){
            StringBuffer sb = new StringBuffer();
            String[] split = str.split("");
            int num = 1;
            for (int i = 0; i < split.length; i++) {
                if(i == split.length - 1){
                    sb.append(num+""+split[i]);
                }else{
                    if(split[i].equals(split[i + 1])){
                        num ++;
                        if(i == split.length - 1){
                            num ++;
                        }
                    }else{
                        sb.append(num+""+split[i]);
                        num = 1;
                    }
                }
            }
            n --;
            str = sb.toString();
        }
        return str;
    }


    /**
     * 用时2ms范例
     * @param n
     * @return
     */
    public String countAndSay(int n) {
        if(n==1)return "1";
        else {
            StringBuilder sb=new StringBuilder();
            String forward =countAndSay(n-1);
            char[] words=forward.toCharArray();
            int i=0;
            while(i<words.length) {
                int j=i;
                while(j<words.length&&words[i]==words[j])j++;
                sb.append(j-i).append(words[i]);
                i=j;
            }
            return sb.toString();
        }
    }
}
