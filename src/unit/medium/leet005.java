package unit.medium;

public class leet005 {
    public static void main(String args[]){
        String s = "abacab";
        String sub = longestPalindrome(s);
        System.out.println(sub);
    }
    /*
    * 复杂度为O(n^3)  速度极慢
    * 比较方法：暴力法
    * 将字符串从头开始取，将每一种子字符串的情况都包含在里面
    * 子字符串分别为   长度为s.length()  然后依次减少*/
    public static String longestPalindrome(String s) {
        if(s.length() <= 1)
            return s;
        for(int i = s.length(); i > 0; i --){
            for(int j = 0; j <= s.length() - i; j++){
                String sub = s.substring(j,j+i);
                int count = 0;
                for(int k = 0; k < sub.length()/2; k++){
                    if(sub.charAt(k) == sub.charAt(sub.length() - k - 1))
                        count++;
                }
                if(count == sub.length()/2){
                    return sub;
                }
            }

        }
        return "";
    }
    /*
    * 第二种方法  复杂度O(n^2)
    * 分为两种情况  字符串长度为奇数，字符串长度为偶数*/
    public static String LongestPalindrom(String s2){
        return s2;
    }
}
