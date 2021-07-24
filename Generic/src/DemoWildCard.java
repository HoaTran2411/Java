import java.util.ArrayList;
import java.util.List;

public class DemoWildCard {
    List<String> names;
    List<Integer> numbers;

    public void creatListNames(){
        names = new ArrayList<String>();
        names.add("Hùng");
        names.add("Mạnh");
        names.add("Mai");
        names.add("Linh");
        print(names);
    }

    public void creatListNumbers(){
        numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(6);
        numbers.add(0);
        print(numbers);
    }

    // public void add(List<?> list, T element){ //muốn dùng T element phải thêm T vào class
    //     //list.add(element); //k thêm vào dc, bị lỗi
    //     list.add(null);
    // }

    //dùng "?" không thêm được phần tử bình thường, chỉ thêm dc phần tử null
    //vì vậy cái này chỉ dùng để in thôi
    public void print(List<?> list){
        for (Object object : list) {
            System.out.println(object);
        }
    }


}
