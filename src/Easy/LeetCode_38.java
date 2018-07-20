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
        System.out.println(mine(2));
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
        String[] split = str.split("");
        StringBuffer sb = new StringBuffer();
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
        return mine(n -1 );
    }
}
