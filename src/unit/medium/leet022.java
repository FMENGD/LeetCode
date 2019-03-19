package unit.medium;

import java.util.ArrayList;
import java.util.List;

public class leet022 {
    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        dfs(ans,"",n,n);
        return ans;
    }
    public static void dfs(List<String> list, String st, int left, int right){
        if(right < left) return ;
        if(right == 0 && left == 0){
            list.add(st);
            System.out.println(list);
        }
        if(left>0)
            dfs(list,st+"(",left-1,right);
        if(right>0)
            dfs(list,st+")",left,right-1);
    }
    public static void main(String args[]){
        List<String> s = generateParenthesis(3);
        System.out.println(s);

    }
}
