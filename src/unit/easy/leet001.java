package unit.easy;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class leet001 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = {2,7,5,9};
        int target=9;
        int[] b = twoSum(nums,target);
        for(int i =0;i<b.length;i++) {
            System.out.println(b[i]);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] a= new int[2];
        int k=0;
        for(int i = 0; i<nums.length;i++){
            map.put(nums[i],i);
        }
        Iterator<Integer> iterator = map.keySet().iterator();

        //while(iterator.hasNext()){
        //	System.out.println(iterator.next());
        //}

        for(int i = 0; i<nums.length;i++){
            int nextval = target - nums[i];

            if(map.containsKey(nextval) && map.get(nextval)!=i){
                a[0]=i;
                a[1]=map.get(nextval);
                // System.out.println(a[1]);
                return a;
            }
        }
        return a;
    }

}
