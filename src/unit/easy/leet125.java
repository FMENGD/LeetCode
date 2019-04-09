package unit.easy;

public class leet125 {
    public static boolean isPalindrome(String s) {
        char at[] = s.toCharArray();
        int i = 0;
        int j = at.length - 1;

        while (i <= j) {
            if (!(Character.isLetter(at[i])|| Character.isDigit(at[i]))) {
                i++;
                continue;
            } else if (!(Character.isLetter(at[j])|| Character.isDigit(at[j]))) {
                j--;
                continue;
            }
            if (Character.toLowerCase(at[i]) != Character.toLowerCase(at[j])) {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
    public static void main(String args[]){
        String s = "A b c B:a";
        boolean flag = isPalindrome(s);
        System.out.println(flag);
    }
}
