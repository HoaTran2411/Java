public class App {
    //biến toàn cục, khai báo ngoài phương thức main:
    public static int max = 500;
    public static void main(String[] args) {
        //int number = 10;
        int number;
        number = 10;
        long lNum = 100L;
        //viết thêm đuôi "l" khi khai báo kiểu long, để máy hiểu là kiểu long chứ k phải int
        System.out.println(lNum);
        System.out.println(number);
        float fNum = 5.5f;
        //nên có chữ "f" khi khai báo kiểu float
        double dNum = 10.66;
        System.out.println(fNum);
        System.out.println(dNum);

        //kiểu ký tự
        //giá trị mặc định cho 1 biến kiểu char là null
        char ch = 'a';
        char ch1 = 65;
        System.out.println(ch + "-" + ch1);

        //kiểu boolean
        //giá trị mặc định của boolean là false
        boolean isCheck = true;
        System.out.println(isCheck);
        System.out.println(max);

        //phải tạo phương thức riêng introduceMyself trong hàm main để code dc thực thi
        // App person = new App(); //tạo đối tượng mới, tên biến 'person' là tùy chọn
        // person.introduceMyself();

        //cách 2: nếu k muốn tạo đối tượng, gọi luôn
        introduceMyself();

        //gọi person
        Person person = new Person();//tạo đối tượng person
        person.getAge(); //gọi tới phương thức getAge

        //cú pháp Gọi:
        //cú pháp tạo đối tượng:
        //<tên class> <tên biến tham chiếu> = new <tên class>

        //gọi inCreaseAge
        Person p = new Person();
        p.inCreaseAge();

        //kiểu trả về là void: là k trả về gì cả

        //gọi calculator
        Calculator calcu = new Calculator();
        //cách 1 in thẳng: System.out.println(calcu.add());
        //cách 2 đặt biến xong in ra: 
        int sum = calcu.add();
        System.out.println(sum);

        System.out.println(calcu.subNum());
        System.out.println(calcu.div());

        //tạo string
        String str  = "hoa trần";
        System.out.println(str.length());

        //so sánh chuỗi: quan tâm cả chữ hoa chữ thường và không
        String str1 = "hoa tran";
        String str2 = "HOA TRan";
        System.out.println(str1.equals(str2));
        System.out.println(str2.equalsIgnoreCase(str1));

        //các phương thức của string 
        String name = "Trần Thị Thu Hoa";
        System.out.println(name.charAt(0));
        int i = name.indexOf('h',8);
        System.out.println(i);
        String newName = name.replace(' ','-');
        System.out.println("Tên sau khi update: "+ newName);
        

        //gọi đối tượng có tham số truyền vào:
        Person.introduceMyself("Hoa",25,"Hưng Yên");
    }

    //tạo phương thức khác main
    public static void introduceMyself(){
        System.out.println("My name is Hoet");
    }
}


//kiểu reference: kiểu string, array,... chữ đầu sẽ viết in hoa
//có 2 cách để tạo: kiểu String literal và từ khóa new
//String s = "xin chào các bạn"; --> phải để trong dấu nháy kép
//kiểu char: để trong dấu nháy đơn

//nên dùng cách String literal như ở trên bởi vì hiệu năng


