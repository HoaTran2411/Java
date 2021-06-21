public class App {
    public static void main(String[] args) {
        //viết chương trình giới thiệu bản thân (tên: string, tuổi:int, địa chỉ: string)
        String name = "Hoa Tran";
        int age = 26;
        String address = "Giap Bat, Hoang Mai, Ha Noi";
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        System.out.println("My address is " + address);


        //hoàn thiện bài calculator (thêm phương thức nhân 2 số)
        Calculator calcu = new Calculator();
        long result = calcu.multi();
        System.out.println("Result is : " + result);
    }
}
