package test;

/**
 * Created by kysft on 6/7/17.
 */
import java.util.*;
public class Test {
    /**
     * @param
     */
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String lgtPrefix=strs[0];
        for(int i=0;i<strs.length;i++){
            while(strs[i].indexOf(lgtPrefix)!=0){
                //int test=strs[i].indexOf(lgtPrefix);only for check purpose.
                lgtPrefix=lgtPrefix.substring(0,lgtPrefix.length()-1);
                if(lgtPrefix.isEmpty()){
                    return "";
                }
            }
        }
        return lgtPrefix;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] test=new String[4];
        test[0]="leets";
        test[1]="leetcode";
        test[2]="leet";
        test[3]="leeds";
        Test t=new Test();
        System.out.println(t.longestCommonPrefix(test));
    }
}
