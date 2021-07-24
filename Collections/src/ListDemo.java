import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    List<String> names = new LinkedList<String>();
    public void add(){
        names.add("Mai");
        names.add("Nga");
        names.add("Trung");
        names.add("Hà");
        names.add(2,"Trang");
    }

    public void set(){
        names.set(0, "hehe");
    }

    public void delete(){
        names.remove(0);
        //names.clear();
    }

    public void print(){
        for (String string : names) {
            System.out.println(string);
        }
    }
}
