import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // String[] languages = new String[3];
        // languages[0] = "Java";
        // languages[1] = "Ruby";
        // languages[2] = "Python";

        // ClassGeneric<String> generic = new ClassGeneric<String>(languages);
        // System.out.println("Phần tử ở vị trí cuối cùng: ");
        // System.out.println(generic.getLast());
        // generic.print(languages);
        // System.out.println();

        // Integer[] number = new Integer[3];
        // number[0] = 5;
        // number[1] = 9;
        // number[2] = 3;

        // ClassGeneric<Integer> generic2 = new ClassGeneric<Integer>(number);
        // System.out.println("Phần tử ở vị trí cuối cùng: ");
        // System.out.println(generic2.getLast());
        // generic2.print(number);


        Scanner sc = new Scanner(System.in);

        //danh sách kiểu string:
        // ArrayList<String> names = new ArrayList<String>();
        // ArrayListGeneric<String> demo = new ArrayListGeneric<String>(names);
        // for (int i = 0; i < 5; i++){
        //     System.out.printf("Thêm phần tử thứ %d: ", (i+1));
        //     String name = sc.nextLine();
        //     demo.add(name);
        // }

        // System.out.println("Danh sách: ");
        // demo.print(names);
        
        
        //danh sách kiểu integer:
        // ArrayList<Integer> numbers = new ArrayList<Integer>();
        // ArrayListGeneric<Integer> demo1 = new ArrayListGeneric<Integer>(numbers);
        // for (int i = 0; i < 3; i++){
        //     System.out.printf("Thêm phần tử thứ %d: ", (i+1));
        //     int number = Integer.parseInt(sc.nextLine());
        //     demo1.add(number);
        // }

        // System.out.println("Danh sách: ");
        // demo1.print(numbers);


        // //danh sách kiểu double:
        // ArrayList<Double> doubles = new ArrayList<Double>();
        // ArrayListGeneric<Double> demoDouble = new ArrayListGeneric<Double>(doubles);
        // for (int i = 0; i < 4; i++){
        //     System.out.printf("Thêm phần tử thứ %d: ", (i+1));
        //     double number = Double.parseDouble(sc.nextLine());
        //     demoDouble.add(number);
        // }
        // System.out.println("Danh sách kiểu double: ");
        // demoDouble.print(doubles);

        // //sửa phần tử:
        // System.out.println("Nhập vào vị trí phần tử muốn xóa: ");
        // int index = Integer.parseInt(sc.nextLine());
        // System.out.println("Nhập vào phần tử mới: ");
        // double element = Double.parseDouble(sc.nextLine());
        // demoDouble.edit(index-1, element);
        // System.out.println("Danh sách kiểu double mới: ");
        // demoDouble.print(doubles);

        DemoWildCard demo = new DemoWildCard();
        System.out.println("Danh sách tên: ");
        demo.creatListNames();
        System.out.println("Danh sách số: ");
        demo.creatListNumbers();

        //không thể áp dụng wildCard trong toán tử new được:
        //ArrayList<? extends Number> list = new ArrayList<? extends Number>();
        //như ví dụ trên sẽ báo lỗi

        //phân biệt từ khóa super và extends
        //(List<? super Integer> List)
    }
}
