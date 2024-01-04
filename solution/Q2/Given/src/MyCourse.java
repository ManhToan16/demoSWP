

 
import java.util.*;

public class MyCourse implements ICourse { 

     
    @Override
    public void f1(List<Course> a, int st) {
        if(st == 1){
            Collections.sort(a, new Comparator<Course>(){
                @Override
                public int compare(Course o1, Course o2) {
                     return o1.getName().compareTo(o2.getName());
                }
                
            });
        }else{
            Collections.sort(a, new Comparator<Course>(){
                @Override
                public int compare(Course o1, Course o2) {
                    return o2.getName().compareToIgnoreCase(o1.getName());
                }
            });
        }
    }
    

    @Override
    public int f2(List<Course> a, double fee) {
        int count = 0;
        for (Course o : a) {
            if(o.getFee() >= fee){
                count++;
            }
        }
        return count;
    }
     
}
