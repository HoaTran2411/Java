public class Teacher extends Person {
    //gọi ra các thuộc Tính
    private long salary; //private để đảm bảo tính đóng gói

    //tạo contructor 
    public Teacher(String name, int age, String address, long salary) {
        super(name, age, address); //super: thừa hưởng các thuộc tính của cha
        this.salary = salary;
    }

    
    public Teacher() {
    }


    //tạo getter và setter
    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    //in ra thông tin teacher bao gồm cả phần person + lương teacher
    @Override
    public String toString() {
        return super.toString() + "-" + salary;   //gọi cha ra dùng super.phương thức
    }

    //truy cập phương thức của lớp cha
    public void show() {
        System.out.println("in thông tin từ lớp con teacher: ");
        super.show();
    }


     
    

    
    
}
