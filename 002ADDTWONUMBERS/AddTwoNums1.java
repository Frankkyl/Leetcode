/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
import java.util.*; 
public class AddTwoNums1 {
//first and wrong solution
//**the parameter and return are "ListNode", not the LinkedList, so method get(), size() are not avaliable**//
//this also missing the corner case l1+l2>=10;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        LinkedList lt=new LinkedList();
        for(int i=0;i<Math.max(l1.size(),l2.size());i++))){
            if(i<=Math.min(l1.size(),l2.size())){
               lt.add(l1.get(i)+l2.get(i)); 
            }else{
                if(Math.max(l1.size(),l2.size()==l1.size())){
                    lt.add(0+l2.get(i));
                }else
                    lt.add(l1.get(i)+0);
                }
            }
        }
        for(int i=0;i<lt.size();i++){
           System.out.println(lt.get(i) + "->"); 
        }
        
    }
}
