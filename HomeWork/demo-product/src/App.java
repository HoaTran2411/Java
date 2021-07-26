import java.util.Scanner;

public class App {
    String id;
    Repository repository = new Repository();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        App app = new App();
        while(true){
            app.chooseMainMenu();
            app.chooseSecondMenu();
        }
    }

    public void chooseMainMenu() {
        System.out.println("\n------------------------Menu chính--------------------------");
        Menu.mainMenu();
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose) {
            case 0:
                System.exit(choose);
                break;
            case 1:
                System.out.println("DANH SÁCH SẢN PHẨM");
                repository.show();
                break;
            case 2:
                System.out.println("Các sản phẩm có giá trên 10000: ");
                repository.filterProductByPrice();
                break;
            case 3:
                repository.countProductByAmountSale();
                break;
            case 4:
                repository.getProductByCategory();
                break;
            case 5:
                repository.sortProductByAmountSale();
                System.out.println("Sản phẩm sau khi sắp xếp: ");
                repository.show();
                break;
            case 6:
                System.out.println("Sản phẩm bán được nhiều nhất là: ");
                repository.getProductMaxAmountSale();
                break;
            case 7:
                repository.sortProductByName();
                System.out.println("Sản phẩm sau khi sắp xếp: ");
                repository.show();
                break;
        }
    }

    public void chooseSecondMenu() {
        System.out.println("\n---------------------Menu phụ------------------------");
        Menu.secondMenu();
        int choose2 = Integer.parseInt(sc.nextLine());
        switch (choose2) {
            case 0:
                chooseMainMenu();
                break;
            case 1:
                System.out.println("Nhập vào mã sản phẩm sản phẩm cần sửa: ");
                id = sc.nextLine();
                repository.editProductById(id);
                break;
            case 2:
                System.out.println("Nhập vào mã sản phẩm sản phẩm cần xóa: ");
                id = sc.nextLine();
                repository.deleteProductById(id);
                break;
        }
    }
}
