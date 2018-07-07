package Easy;

/**
 * 项目名称：LeetCode
 * 包名：Easy
 * 作者：X-Z-Y
 * 时间：2018-6-30 20:35
 * 描述：给定一个 32 位有符号整数，将整数中的数字进行反转。
 */
public class LeetCode_7 {
    public LeetCode_7(){
        System.out.println(leetCode(-123));
    }

    private static int mine(int x){
        StringBuffer sb = new StringBuffer();
        String str = null;
        if(x < 0){
            str = -x + "";
        }else {
            str = "" + x;
        }
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0 ; i--) {
            sb.append(chars[i]);
        }
        String s = sb.toString();
        try {
            if(x < 0){
                return -Integer.valueOf(s);
            }else{
                return Integer.valueOf(s);
            }
        }catch (Exception e){
            return 0;
        }
    }

    /**
     * 如果temp = rev * 10 + pop;导致溢出，则一定有rev>=IntMax/10;
     * 如果rev > IntMax/10, 那么temp = temp = rev * 10 + pop 一定会溢出;
     * 如果rev == IntMax/10, 那么当pop > 7 时会溢出;
     * @param x
     * @return
     */
    private static int leetCode(int x){
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
