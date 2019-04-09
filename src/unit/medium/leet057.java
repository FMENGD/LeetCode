package unit.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class leet057 {
    public class MyComparator implements Comparator<Interval>{
        @Override
        public int compare(Interval a, Interval b) {
            return a.start - b.start;
        }
    }
    public List<Interval> insert(List<Interval> list, Interval newInterval){
        List<Interval> ans = new ArrayList<Interval>();
        int count = list.size();
        Collections.sort(list,new MyComparator());
        int start = newInterval.start;
        int end = newInterval.end;
        for(int i = 0; i < count; i++){
            Interval inter = list.get(i);
            if(inter.end < start){
                ans.add(new Interval(inter.start,inter.end));
            }
            else if(inter.start > end){
                ans.add(new Interval(start,end));
                start = inter.start;
                end = inter.end;
            }
            else {
                start = Math.min(start,inter.start);
                end = Math.max(end,inter.end);
            }
        }
        ans.add(new Interval(start,end));
        return ans;
    }
}
