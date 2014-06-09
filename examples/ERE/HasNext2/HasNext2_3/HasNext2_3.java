import java.util.*;

public class HasNext2_3 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(1);
        v.add(2);
        v.add(3);
        
        Iterator i = v.iterator();
        int sum = 0;
        
        // Regardless of the number of "hasNext" events,
        // "next" "next" should be matched.
        i.hasNext();
        i.hasNext();
        sum += (Integer)i.next();
        sum += (Integer)i.next();
        sum += (Integer)i.next();
        i.hasNext();
        i.hasNext();
        
        System.out.println("sum: " + sum);
    }
}
