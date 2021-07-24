import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        long id;
        Scanner sc = new Scanner(System.in);
        ProductRepository repository = new ProductRepository();
        repository.listProduct();
        Menu.chooseMenu();
        while (true) {
            try {
                int choose = Integer.parseInt(sc.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Danh sách toàn bộ sản phẩm: ");
                        repository.printProduct();
                        break;
                    case 2:
                        repository.addProduct();
                        System.out.println("Danh sách sản phẩm sau khi đã thêm vào: ");
                        repository.printProduct();
                        break;
                    case 3:
                        id = repository.checkNumber("mã sản phẩm");
                        repository.findProductById(id);
                        repository.editProductById(id);
                        break;
                    case 4:
                        id = repository.checkNumber("mã sản phẩm");
                        repository.findProductById(id);
                        repository.deleteProductById(id);
                        break;
                    case 5:
                        System.out.println("Số lượng bán được của từng sản phẩm: ");
                        repository.getIdAndQuantitySold();
                        break;
                    case 6:
                        System.out.println("Số lượng sản phẩm theo từng danh mục: ");
                        repository.getQuantityOfCategory();
                        break;
                    default:
                        throw new ArithmeticException();
                }
                break;
            } catch (ArithmeticException ex1) {
                System.out.println("Lựa chọn của bạn không tồn tại, vui lòng nhập lại!");
                continue;
            } catch (NumberFormatException ex2) {
                System.out.println("lựa chọn phải là số từ 1 đến 6, vui lòng nhập lại!");
                continue;
            }
        }

    }
}
