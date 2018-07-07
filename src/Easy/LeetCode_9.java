package Easy;

/**
 * 项目名称：LeetCode
 * 包名：Easy
 * 作者：X-Z-Y
 * 时间：2018-7-3 21:55
 * 描述：判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class LeetCode_9 {
    public LeetCode_9(){
        System.out.println(advanced(10));
    }

    private static boolean mine(int x){
        String str = x + "";
        char[] chars = str.toCharArray();
        if(chars.length % 2 == 0){
            for (int i = 0; i < chars.length / 2; i++) {
                if(chars[i] != chars[chars.length - i - 1]){
                    return false;
                }
            }
            return true;
        }else {
            for (int i = 0; i < (chars.length - 1) / 2; i++) {
                if(chars[i] != chars[chars.length - i - 1]){
                    return false;
                }
            }
            return true;
        }
    }

    /**
     * 不转换为字符串
     * @return
     */
    private static boolean advanced(int x){
        if (x < 0 || ( x % 10 == 0 && x !=0)) {
            return false;
        }else{
            int temp = 0;
            while(temp < x){
                int y = x % 10;
                x = x / 10;
                temp = temp * 10 + y;
            }
            if(temp == x || x == temp/10){
                return true;
            }else{
                return false;
            }
        }
    }
}
