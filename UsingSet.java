import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UsingSet {
    public static void main(String[] args) {
        Set<Integer> studentID = new LinkedHashSet<>();
        
        studentID.add(101);
        studentID.add(102);
        studentID.add(103);
        studentID.add(104);
        studentID.add(105);
        
        System.out.println("Set: " + studentID);
        
        studentID.remove(104);
        
        System.out.println("After removing 104: " + studentID);
        
        List<Integer> idList = new ArrayList<>(studentID);
        System.out.println("The ID at index 3 is " + idList.get(3));
    }
}