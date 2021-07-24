import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
    HashSet<String> countries = new HashSet<String>();
    public void add(){
        countries.add("Japan");
        countries.add("China");
        countries.add("Viet Nam");
        countries.add("Thai Lan");
        countries.add("Viet Nam");
    }
    //set loại bỏ phần tử trùng lặp, phía trên 1 phần tử việt nam sẽ bị loại bỏ

    public void print(){
        for (String string : countries) {
            System.out.println(string);
        }
    }

    public static void main(String[] args) {
        SetDemo set = new SetDemo();
        set.add();
        set.print();  
        //hashset k sửa dc phần tử
        set.countries.remove("China");
        System.out.println("Danh sách sau khi xóa: ");
        set.print();

        System.out.println("iterotor: ");
        Iterator itr = set.countries.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        //linkedHashset
        
    }
    
}
