import java.util.List;
import java.util.Vector;

public class DemoVector {
    List<String> names = new Vector<String>();
    Vector<String> languages = new Vector<String>();

    public void add(){
        names.add("Mai");
        names.add("Trang");
        names.add(1, "Ngat");
    }

    public void set(){
        names.set(1, "hoho");
    }

    public void delete(){
        names.remove(1);
    }
    
}
