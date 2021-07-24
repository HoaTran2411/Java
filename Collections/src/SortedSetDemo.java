import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("Java");
        sortedSet.add("JS");
        sortedSet.add("PHP");
        sortedSet.add("HTML");
        sortedSet.add("PHP");
        sortedSet.add("PHP");

        //sortedSet k chứa phần tử trùng lặp và phần tử null
        System.out.println("Danh sách ban đầu: ");
        System.out.println(sortedSet);

        System.out.println("Phần tử đầu tiên: " + sortedSet.first());
        System.out.println("Phần tử cuối cùng: " + sortedSet.last());
    }

    
}
