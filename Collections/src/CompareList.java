import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CompareList {
    public static void main(String[] args){
        long start, end, timeEslapsed;
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        
        start = System.nanoTime();
        end = System.nanoTime();
        arrayList.add("Java");
        arrayList.add("HTML");
        arrayList.add("Python");

        timeEslapsed = end - start;
        System.out.println("Sử dụng arrayList: " + timeEslapsed);
        

        start = System.nanoTime();
        linkedList.add("Java");
        linkedList.add("HTML");
        linkedList.add("Python");

        timeEslapsed = end - start;
        System.out.println("Sử dụng linkedList: " + timeEslapsed);
        
    }
}
