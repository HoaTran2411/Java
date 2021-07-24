import java.util.HashMap;
import java.util.Map;

public class MapExp {
    public static void main(String[] args) {
        Map<String, String> persons = new HashMap<>();
        persons.put("0145688","Mai");
        persons.put("0133899","Nga");
        persons.put("0789455","Huy");
        persons.put("0254666","Ngát");
        System.out.println(persons);

        //in theo cách mình mong muốn dùng Map.entry
        for (Map.Entry<String, String> entry : persons.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        persons.remove("0145688");
        System.out.println("Danh sách sau khi xóa: ");
        System.out.println(persons);

        persons.put("0789455","Mai");;
        System.out.println("Danh sách sau khi sửa: ");
        System.out.println(persons);


    }
}
