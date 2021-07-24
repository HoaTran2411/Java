import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Phán", 20, "Java", 8.5));
        students.add(new Student(2, "Trang", 27, "HTML", 7.5));
        students.add(new Student(3, "Vân", 23, "SQL", 9.5));
        students.add(new Student(4, "Nga", 26, "Java", 8.0));
        students.add(new Student(5, "Huy", 20, "Python", 10));
        students.add(new Student(6, "Hảo", 30, "Python", 10));
        students.add(new Student(7, "Hà", 27, "Python", 10));

        for (Student student : students) {
            System.out.println(student);
        }

        //sử dụng map để lấy ra dữ liệu theo mong muốn:
        Map<Integer, String> s = new HashMap<>();
        for (Student student : students) {
            s.put(student.getId(), student.getName() + " - " + student.getPoint());
        }

        for(Map.Entry<Integer, String> entry : s.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        //lấy ra mỗi lớp là bao nhiêu học sinh:
        Map<String, Integer> countStudent = new HashMap<>(); //map lấy ra string lớp - integer: sau sẽ để chứa số học sinh trong 1 lớp
        //tức là ý tưởng map sẽ ra cặp key - value là tên lớp - số học sinh trong lớp đó
        for (Student student : students) {
            if(!countStudent.containsKey(student.getClassRoom())){  //nếu mà countStudent mà không chứa lớp học này thì thêm mới lớp học
                //kèm value count = 1;
                countStudent.put(student.getClassRoom(), 1);
            } else {
                countStudent.put(student.getClassRoom(), countStudent.get(student.getClassRoom()) + 1);
                //ngược lại nếu mà đã có lớp học này rồi thì sẽ thêm vào key - value mới:
                //key là tên lớp học và value = count cũ + 1 : vì key trong map là duy nhất nên nó sẽ thay thế cặp key-value cũ
            }

        }

        for(Map.Entry<String, Integer> entry : countStudent.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
