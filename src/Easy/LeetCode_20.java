package Easy;

import java.util.Stack;

/**
 * 项目名称：LeetCode
 * 包名：Easy
 * 作者：X-Z-Y
 * 时间：2018-7-9 22:52
 * 描述：给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *       有效字符串需满足：
 *       左括号必须用相同类型的右括号闭合。
 *       左括号必须以正确的顺序闭合。
 *       注意空字符串可被认为是有效字符串。
 */
public class LeetCode_20 {
    public LeetCode_20(){
        System.out.println(mine("([)]"));
    }

    private boolean mine(String s){
        if(s.equals("")){
            return true;
        }
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        stack.push(chars[0]);
        if(chars[0] == '(' || chars[0] == '[' || chars[0] == '{'){
            for (int i = 1; i < chars.length; i++) {
                if(chars[i] == stack.peek() + 1 || chars[i] == stack.peek() + 2){
                    stack.pop();
                    if(i == chars.length - 1 ){
                        break;
                    }
                    if(stack.empty()){
                        i ++;
                        stack.push(chars[i]);
                    }
                }else{
                    stack.push(chars[i]);
                }
            }
            return stack.empty();
        }else{
            return false;
        }
    }

    /**
     * 5ms代码
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        if(s==null) {
            return false;
        }
        else {
            Stack<Character> stack=new Stack<>();
            int len = s.length();
            for(int i=0;i<len;i++) {
                char cr = s.charAt(i);
                if(cr=='('||cr=='{'||cr=='[') {
                    stack.push(cr);
                }
                else if(cr==')') {
                    if(!stack.empty()&&stack.peek()=='(')stack.pop();
                    else return false;
                }
                else if(cr=='}') {
                    if(!stack.empty()&&stack.peek()=='{')stack.pop();
                    else return false;
                }
                else if(cr==']') {
                    if(!stack.empty()&&stack.peek()=='[')stack.pop();
                    else return false;
                }
            }
            return stack.empty();
        }
    }
}
