package unit.medium;

public class leet008 {
    public static void main(String args[]) {
        String string = "928347829388478222";
        System.out.println(myAtoi(string));
    }

    public static int myAtoi(String str) {
        int sum = 0;
        int flag = 1;
        int index = 0;
        if(str.length() == 0)
            return 0;
        while(index < str.length() && str.charAt(index) == ' ')
            index ++;
        if(index == str.length())
            return 0;
        if(str.charAt(index) == '+' || str.charAt(index) == '-') {
            flag = str.charAt(index) == '+'? 1 : -1;
            index++;
        }
        while(index < str.length()) {
            int tmp = str.charAt(index) - '0';
            if(tmp < 0 || tmp > 9)
                break;
            if((Integer.MAX_VALUE - tmp)/10 < sum)
                return flag == 1? Integer.MAX_VALUE:Integer.MIN_VALUE;
            sum = sum * 10 + tmp;
            index++;
        }
        return sum*flag;

    }
}
