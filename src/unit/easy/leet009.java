package unit.easy;
public class leet009{
    public boolean isPalin(int x) {
        String s = String.valueOf(x);
        int len = s.length();
        for(int i = 0; i<len;i++) {
            if(s.charAt(i)!= s.charAt(len-i-1)) {
                return false;
            }

        }
        return true;
    }
    public boolean isP(int x) {
        if(x<0) return false;
        int temp = x;
        int reverse = 0;

        while(temp!=0) {
            reverse = reverse*10+temp%10;
            temp=temp/10;
        }

        return (reverse-x==0)?true:false;
    }

}
