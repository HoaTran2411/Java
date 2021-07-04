public enum WeekDay {
    MONDAY("Thứ hai"), 
    TUESDAY("Thứ ba"),
    WEDDAY("Thứ tư"), 
    THURSDAY("Thứ năm"),
    FRIDAY("Thứ sáu"),
    SATURDAY("Thứ bảy"),
    SUNDAY("Chủ Nhật");

    String value;

    //constructor (hàm tạo) là phương thức sử dụng để khởi tạo đối tượng
    private WeekDay(String value) {
        this.value = value;
    }

    //để gọi ra dùng (dùng phương thức)
    public String getValue() {
        return value;
    }
}
