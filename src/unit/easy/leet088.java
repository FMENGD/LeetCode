package unit.easy;

public class leet088 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        m = m - 1;
        n = n - 1;
        int i = m + n + 1;
        while(m >= 0 || n >= 0){
            if(m < 0){
                nums1[i--] = nums2[n--];
            } else if(n < 0) {
                nums1[i--] = nums1[m--];
            } else {
                nums1[i--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
            }
        }
    }
    public static void main(String args[]){
        int[] a = {1,3,5};
        int[] b = {2,4,6};
        int m = 100000;
        int n = 67;
        merge(a,m,b,n);
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);

        }
    }
}
