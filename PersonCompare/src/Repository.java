import java.util.ArrayList;
import java.util.List;

public class Repository {
    List<Person> list;
    public Repository(){
        list = new ArrayList<Person>();
        list.add(new Person(1, "Hoa", 26, "Hưng Yên"));
        list.add(new Person(1, "Mai", 26, "Hưng Yên"));
        list.add(new Person(1, "Hoa", 26, "Hưng Yên"));
        list.add(new Person(1, "Hoa", 26, "Hưng Yên"));
        list.add(new Person(1, "Hoa", 26, "Hưng Yên"));
        list.add(new Person(1, "Hoa", 26, "Hưng Yên"));
    }
}
