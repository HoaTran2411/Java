public class App {
    public static void main(String[] args) throws Exception {

        ReadFile readFile = new ReadFile();

        System.out.println("---------------------------------------------Sách giáo khoa---------------------------------------------");
        readFile.getDataTextBook();
        System.out.println();

        System.out.println("---------------------------------------------Đồ án---------------------------------------------");
        readFile.getDataProject();
        System.out.println();

        System.out.println("---------------------------------------------Tài liệu điện tử---------------------------------------------");
        readFile.getDataEBook();
        System.out.println();

    }
}
