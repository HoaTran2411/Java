import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ReadFile {

    //sách giáo khoa
    public void getDataTextBook() {
        List<TextBook> list;
        try {
            FileReader reader = new FileReader("src/TextBook.json");

            //chuyển từ JSON text sang object
            Type objectType = new TypeToken<List<TextBook>>(){}.getType();
            list = new Gson().fromJson(reader, objectType);

            for (TextBook textBook: list){
                System.out.println(textBook);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //đồ án
    public void getDataProject() {
        List<Project> list;
        try {
            FileReader reader = new FileReader("src/Project.json");

            //chuyển từ JSON text sang object
            Type objectType = new TypeToken<List<Project>>(){}.getType();
            list = new Gson().fromJson(reader, objectType);

            for (Project project: list){
                System.out.println(project);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //tài liệu điện tử
    public void getDataEBook() {
        List<EBook> list;
        try {
            FileReader reader = new FileReader("src/EBook.json");

            //chuyển từ JSON text sang object
            Type objectType = new TypeToken<List<EBook>>(){}.getType();
            list = new Gson().fromJson(reader, objectType);

            for (EBook eBook: list){
                System.out.println(eBook);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}