import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Repository {
    List<Product> listProducts = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Category category;

    public Repository() {
        listProducts.add(new Product("01", "Bánh Doraemon 3 vị", Category.FOOD, 100, 3500, 57));
        listProducts.add(new Product("02", "Xúc xích sườn non", Category.FOOD, 150, 3500, 12));
        listProducts.add(new Product("03", "Thanh cua", Category.FOOD, 100, 5000, 85));
        listProducts.add(new Product("04", "Bánh khoai môn", Category.FOOD, 200, 42000, 78));
        listProducts.add(new Product("05", "Thìa ăn cơm inox mạ vàng", Category.HOUSEWARE, 50, 8000, 4));
        listProducts.add(new Product("06", "Bát đựng gia vị", Category.HOUSEWARE, 65, 4000, 44));
        listProducts.add(
                new Product("07", "Nước Hoa Hồng Soothing Facial Toner Simple", Category.COSMETICS, 140, 92000, 88));
        listProducts.add(new Product("08", "Combo gội xả HAIRBURST", Category.COSMETICS, 100, 639000, 7));
        listProducts.add(new Product("09", "Tinh chất dưỡng ẩm sâu Klairs Rich Moist Soothing Serum",
                Category.COSMETICS, 50, 249000, 24));
        listProducts.add(new Product("10", "Kem dưỡng thể Paula’s Choice RESIST WEIGHTLESS BODY TREATMENT",
                Category.COSMETICS, 80, 715000, 63));
        listProducts.add(new Product("11", "Ao thun TSUN", Category.FASHION, 250, 320000, 146));
        listProducts.add(new Product("12", "Váy hoa xếp ly", Category.FASHION, 450, 450000, 146));

    }

    // 1 - Xem thông tin sản phẩm
    public void show() {
        listProducts.forEach(product -> System.out.println(product));
    }

    // 2 - In danh sách sản phẩm có giá trên 10.000
    public void filterProductByPrice() {
        listProducts.stream().filter(product -> product.getPrice() > 10000)
                .forEach(product -> System.out.println(product));
    }

    // 3 - Đếm số sản phẩm có số lượng bán từ 50 trở lên
    public void countProductByAmountSale() {
        long count = listProducts.stream().filter(product -> product.getAmountSale() >= 50).count();
        System.out.println("Số lượng sản phẩm bán được từ 50 trở lên là: " + count);
    }

    // 4 - Liệt kê sản phẩm dựa theo loại sản phẩm
    public void getProductByCategory() {
        while (true) {
            try {
                Menu.chooseCategory();
                int choose = Integer.parseInt(sc.nextLine());
                switch (choose) {
                    case 1:
                        getProductByEachCatogory("Thực phẩm", Category.FOOD);
                        break;
                    case 2:
                        getProductByEachCatogory("Đồ gia dụng", Category.HOUSEWARE);
                        break;
                    case 3:
                        getProductByEachCatogory("Mỹ phẩm", Category.COSMETICS);
                        break;
                    case 4:
                        getProductByEachCatogory("Thời trang", Category.FASHION);
                        break;
                    default:
                        throw new ArithmeticException();
                }
                break;
            }
            catch (ArithmeticException ex1) {
                System.out.println("Lựa chọn của bạn không tồn tại, vui lòng nhập lại!");
                continue;
            } catch (NumberFormatException ex2) {
                System.out.println("lựa chọn phải là số từ 1 đến 4, vui lòng nhập lại!");
                continue;
            }
        }
    }

    public void getProductByEachCatogory(String infor, Category category) {
        System.out.println("Danh sách " + infor + ": ");
        listProducts.stream().filter(product -> product.getCategory().equals(category))
                .forEach(product -> System.out.println(product));
    }

    // 5 - Sắp xếp sản phẩm theo số lượng bán được:
    public void sortProductByAmountSale() {
        listProducts.sort((o1, o2) -> ((o1.getAmountSale() > o2.getAmountSale()) ? 1 : -1));
    }

    // 6 - Đưa ra sản phẩm bán được nhiều nhất
    public void getProductMaxAmountSale() {
        sortProductByAmountSale();
        long maxAmountSale = listProducts.get(listProducts.size() - 1).getAmountSale();
        listProducts.stream().filter(product -> (product.getAmountSale() == maxAmountSale))
                .forEach(product -> System.out.println(product));
    }

    // 7 - Sắp xếp sản phẩm theo tên
    public void sortProductByName() {
        listProducts.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
    }

    // ---------------xử lý phần secondMenu------------

    // sửa sản phẩm:
    public void editProductById(String id) {
        long count = listProducts.stream().filter(product -> (product.getId().equalsIgnoreCase(id))).count();
        if (count == 0) {
            System.out.println("Không tồn tại sản phẩm này!");
        } else {
            System.out.println("Sản phẩm cần sửa: ");
            listProducts.stream().filter(product -> (product.getId().equalsIgnoreCase(id)))
                    .forEach(product -> System.out.println(product));
            for (int i = 0; i < listProducts.size(); i++) {
                if (listProducts.get(i).getId().equalsIgnoreCase(id)) {
                    System.out.println("Update thông tin sản phẩm có mã sản phẩm là " + id + ": ");
                    System.out.println("Nhập tên mới sản phẩm: ");
                    String name = sc.nextLine();
                    chooseCategory();
                    long amount = checkNumber("số lượng");
                    long price = checkNumber("giá bán");
                    long amountSale = checkNumber("số lượng bán");
                    listProducts.set(i, new Product(id, name, category, amount, price, amountSale));
                    System.out.println("\nDanh sách sản phẩm sau khi update: ");
                    show();
                }
            }
        }
    }

    // xóa sản phẩm theo id:
    public void deleteProductById(String id) {
        long count = listProducts.stream().filter(product -> (product.getId().equalsIgnoreCase(id))).count();
        if (count == 0) {
            System.out.println("Không tồn tại sản phẩm này!");
        } else {
            System.out.println("Sản phẩm cần xóa: ");
            listProducts.stream().filter(product -> (product.getId().equalsIgnoreCase(id)))
                    .forEach(product -> System.out.println(product));
            listProducts.removeIf(product -> (product.getId().equalsIgnoreCase(id)));
            System.out.println("\nDanh sách sản phẩm sau khi update: ");
            show();
        }
    }

    // exception với number:
    public long checkNumber(String request) {
        long number = 0;
        while (true) {
            try {
                System.out.println("Nhập " + request + ": ");
                number = Long.parseLong(sc.nextLine());
                if (number < 0) {
                    throw new ArithmeticException();
                }
                break;
            } catch (ArithmeticException ex1) {
                System.out.println(request + " không được nhỏ hơn 0!");
                continue;
            } catch (NumberFormatException ex2) {
                System.out.println(request + " phải là 1 số!");
                continue;
            }
        }
        return number;
    }

    // chọn danh mục sản phẩm
    public void chooseCategory() {
        while (true) {
            try {
                Menu.chooseCategory();
                int choose = Integer.parseInt(sc.nextLine());
                switch (choose) {
                    case 1:
                        category = Category.FOOD;
                        break;
                    case 2:
                        category = Category.HOUSEWARE;
                        break;
                    case 3:
                        category = Category.COSMETICS;
                        break;
                    case 4:
                        category = Category.FASHION;
                        break;
                    default:
                        throw new ArithmeticException();
                }
                break;
            } catch (ArithmeticException ex1) {
                System.out.println("Lựa chọn của bạn không tồn tại, vui lòng nhập lại!");
                continue;
            } catch (NumberFormatException ex2) {
                System.out.println("lựa chọn phải là số từ 1 đến 4, vui lòng nhập lại!");
                continue;
            }
        }
    }

}
