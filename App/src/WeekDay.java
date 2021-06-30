
public class WeekDay {

    //khởi tạo contructor khi khai báo biến enum theo dạng tên phần tử- value (tên phần tử phải viết in hoa - quy tắc)
    public enum WeekDay1{
        MONDAY("Thứ Hai"),
        TUESDAY("Thứ Ba"),
        WEDDAY("Thứ Tư"),
        SUNDAY("Chủ Nhật");
    
        String value;
    
        //constructor(hàm tạo): là phương thức sử dụng để tạo đối tượng
        private WeekDay1(String value){
            this.value = value;
        }

        public String getValue(){
            return value;
        }
        //enum luôn có phạm vi truy cập là private: chỉ dùng trong class này thôi
    }
    public static void main(String args[]) {
        for (WeekDay1 s : WeekDay1.values()) {
            System.out.println(s.value);
        }

        WeekDay1 sunday = WeekDay1.MONDAY;
        System.out.println(sunday.value);

        //Lấy value của MONDAY
        Day day = Day.TUESDAY;
        System.out.println(day.getValue());
    }
    
    
}

