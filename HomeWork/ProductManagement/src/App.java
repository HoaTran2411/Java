import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        long id;
        Scanner sc = new Scanner(System.in);
        ProductRepository repository = new ProductRepository();
        repository.listProduct();
        while (true) {
            try {
                while (true) {
                    Menu.chooseMenu();
                    int choose = Integer.parseInt(sc.nextLine());
                    switch (choose) {
                        case 1:
                            System.out.println("\nDanh sách toàn bộ sản phẩm: ");
                            repository.printProduct();
                            break;
                        case 2:
                            repository.addProduct();
                            System.out.println("\nDanh sách sản phẩm sau khi đã thêm vào: ");
                            repository.printProduct();
                            break;
                        case 3:
                            id = repository.checkNumber("mã sản phẩm");
                            repository.editProductById(id);
                            break;
                        case 4:
                            id = repository.checkNumber("mã sản phẩm");
                            repository.deleteProductById(id);
                            break;
                        case 5:
                            System.out.println("\nSố lượng bán được của từng sản phẩm: ");
                            repository.getIdAndQuantitySold();
                            break;
                        case 6:
                            System.out.println("\nSố lượng sản phẩm theo từng danh mục: ");
                            repository.getQuantityOfCategory();
                            break;
                        case 7:
                            System.exit(choose);
                            break;
                        default:
                            throw new ArithmeticException();
                    }
                    break;
                }

            } catch (ArithmeticException ex1) {
                System.out.println("Lựa chọn của bạn không tồn tại, vui lòng nhập lại!");
                continue;
            } catch (NumberFormatException ex2) {
                System.out.println("lựa chọn phải là số từ 1 đến 7, vui lòng nhập lại!");
                continue;
            }
        }

    }
}
