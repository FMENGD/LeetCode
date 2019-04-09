package unit.medium;

import java.util.*;

public class leet056 {

    public static class MyComparator implements Comparator<Interval> {
        @Override
        public int compare(Interval a, Interval b) {
            return a.start - b.start;
        }
    }
    public static List<Interval> merge(List<Interval> intervals) {
        List<Interval> ans = new ArrayList<Interval>();
        int count = intervals.size();
        if(count<=1) return intervals;
        Collections.sort(intervals, new MyComparator());
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        for(int i = 1;i < count; i++){
            Interval inter = intervals.get(i);
            if(inter.start > end){
                ans.add(new Interval(start,end));
                start = inter.start;
                end = inter.end;
            }
            else{
                end = Math.max(end,inter.end);
            }

        }
        ans.add(new Interval(start,end));
        return ans;
    }
    public static void main(String args[]){
        Interval in1 = new Interval(1,2);
        Interval in2 = new Interval(2,6);
        Interval in3 = new Interval(8,10);
        Interval in4 = new Interval(12,15);
        List<Interval> ins = new ArrayList<Interval>();
        ins.add(in1);
        ins.add(in2);
        ins.add(in3);
        ins.add(in4);
        List<Interval> ans = merge(ins);
        for(int i = 0;i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }

}
