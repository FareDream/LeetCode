package Easy;

/**
 * 项目名称：LeetCode
 * 包名：Easy
 * 作者：X-Z-Y
 * 时间：2018-7-11 21:46
 * 描述：将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class LeetCode_21 {
    public LeetCode_21(){

    }

    private static ListNode mine(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){
            return null;
        }
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode newListNode;
        if(l1.val > l2.val){
            newListNode = l2;
            newListNode.next = mine(l1, l2.next);
        }else{
            newListNode = l1;
            newListNode.next = mine(l1.next,l2);
        }
        return newListNode;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
