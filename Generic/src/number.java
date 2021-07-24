public class number <T extends Number>{
    T number;

    public number(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }
    

    //các phương thức: chỉ giới hạn vs number
    //các kiểu khác string,... k dùng được cho class này
    //vì T extends "NUMBER"
    
}
