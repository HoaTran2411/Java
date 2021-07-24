import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ProductRepository {
    Category category;
    int count = 0;
    Boolean isCheckExist = true;
    Product productById = new Product();
    List<Product> productList = new ArrayList<Product>();
    Scanner sc = new Scanner(System.in);
    Category food = Category.FOOD;
    Category phone = Category.PHONE;
    Category books = Category.BOOKS;
    Category fashion = Category.FASHION;
    Category other = Category.OTHERS;

    // xem sản phẩm
    public void listProduct() {
        productList.add(new Product(1, "Cơm rang dưa bò", food, 300, 40000, 200));
        productList.add(new Product(2, "Iphone 10", phone, 10000, 15000000, 200));
        productList.add(new Product(3, "Nếu còn có ngày mai", books, 200000, 125000, 50000));
        productList.add(new Product(4, "Không gia đình", books, 500000, 175000, 400000));
        productList.add(new Product(5, "Samsung galaxy s20", phone, 7000, 16000000, 3000));
        productList.add(new Product(6, "Váy xẻ tà nữ", fashion, 50000, 350000, 10000));
        productList.add(new Product(7, "Áo phông", fashion, 100000, 150000, 70000));
        productList.add(new Product(8, "Sách tiếng việt lớp 1", books, 100000, 90000, 90000));
        productList.add(new Product(9, "Quần bò nữ", fashion, 25000, 300000, 20000));
        productList.add(new Product(10, "Huawei y9", phone, 170000, 4500000, 150000));
        productList.add(new Product(11, "Bún bò Huế", food, 1000, 45000, 850));
        productList.add(new Product(12, "Cơm rang hải sản", food, 12000, 60000, 11000));
        productList.add(new Product(13, "Canh kim chi", food, 10000, 30000, 9000));
        productList.add(new Product(14, "bún cá", food, 1000, 30000, 900));
        productList.add(new Product(14, "Son ACE", other, 200, 450000, 50));
    }

    // in danh sách sản phẩm:
    public void printProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    // thêm mới sản phẩm
    public void addProduct() {
        System.out.println("Nhập vào thông tin sản phẩm mới: ");
        long id = getIdDifference();
        System.out.println("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        chooseCategory();
        long quantity = checkNumber("số lượng");
        long price = checkNumber("giá bán");
        long quantitySold = checkNumber("số lượng bán");
        productList.add(new Product(id, name, category, quantity, price, quantitySold));
    }

    // tìm index của sản phẩm theo ID:
    public int findIndexProductById(long id) {
        int index = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productById = productList.get(i);
                index = i;
                count++;
            }
        }
        return index;
    }

    // Tìm sản phẩm theo mã sản phẩm:
    public void findProductById(long id) {
        findIndexProductById(id);
        if (count == 0) {
            System.out.println("Không tồn tại sản phẩm này!");
            isCheckExist = false;
        } else {
            System.out.println("Sản phẩm có mã sản phẩm là " + id + ": ");
            System.out.println(productById);
        }
    }

    // sửa sản phẩm:
    public void editProductById(long id) {
        if (isCheckExist) {
            System.out.println("Update thông tin sản phẩm có mã sản phẩm là " + id + ": ");
            System.out.println("Nhập tên sản phẩm: ");
            String name = sc.nextLine();
            chooseCategory();
            long quantity = checkNumber("số lượng");
            long price = checkNumber("giá bán");
            long quantitySold = checkNumber("số lượng bán");
            productList.set(findIndexProductById(id), new Product(id, name, category, quantity, price, quantitySold));
            System.out.println("Danh sách sản phẩm sau khi update: ");
            printProduct();
        }
    }

    // xóa sản phẩm theo id:
    public void deleteProductById(long id) {
        if (isCheckExist) {
            productList.remove(findIndexProductById(id));
            System.out.println("Danh sách sản phẩm sau khi update: ");
            printProduct();
        }
    }

    // Xem sản phẩm và số lượng bán được (Sử dụng Map)
    public void getIdAndQuantitySold() {
        Map<Long, String> list = new HashMap<>();
        for (Product product : productList) {
            list.put(product.getId(), product.getName() + " - " + "Số lượng bán được: " + product.getQuantitySold());
        }

        for (Map.Entry<Long, String> entry : list.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Liệt kê loại sản phẩm và số lượng sản phẩm thuộc loại đó
    public void getQuantityOfCategory() {
        Map<Category, Long> list = new HashMap<>();
        for (Product product : productList) {
            if (!list.containsKey(product.getCategory())) {
                list.put(product.getCategory(), product.getQuantity());
            } else {
                list.put(product.getCategory(), list.get(product.getCategory()) + product.getQuantity());
            }
        }
        for (Map.Entry<Category, Long> entry : list.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " sản phẩm");
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

    // exception với id (không được trùng lặp nhau)
    public long getIdDifference() {
        long id = 0;
        while (true) {
            try {
                System.out.println("Nhập mã sản phẩm: ");
                id = Long.parseLong(sc.nextLine());
                if (id < 0) {
                    throw new ArithmeticException();
                }
                for (int i = 0; i < productList.size(); i++) {
                    if (productList.get(i).getId() == id) {
                        throw new Exception();
                    }
                }
                break;
            } catch (ArithmeticException ex1) {
                System.out.println("Mã sản phẩm là 1 số không được nhỏ hơn 0!");
                continue;
            } catch (NumberFormatException ex2) {
                System.out.println("Mã sản phẩm phải là 1 số!");
                continue;
            } catch (Exception ex3) {
                System.out.println("Mã sản phẩm đã tồn tại trong hệ thống, vui lòng chọn lại mã khác!");
                continue;
            }
        }
        return id;
    }

    // chọn danh mục sản phẩm:
    public void chooseCategory() {
        Menu.chooseCategory();
        while (true) {
            try {
                int choose = Integer.parseInt(sc.nextLine());

                switch (choose) {
                    case 1:
                        category = food;
                        break;
                    case 2:
                        category = phone;
                        break;
                    case 3:
                        category = books;
                        break;
                    case 4:
                        category = fashion;
                        break;
                    case 5:
                        category = other;
                        break;
                    default:
                        throw new ArithmeticException();
                }
                break;
            } catch (ArithmeticException ex1) {
                System.out.println("Lựa chọn của bạn không tồn tại, vui lòng nhập lại!");
                continue;
            } catch (NumberFormatException ex2) {
                System.out.println("lựa chọn phải là số từ 1 đến 5, vui lòng nhập lại!");
                continue;
            }
        }
    }
}
