import java.util.Scanner;

public class Library {
    //bước 1: khai báo thuộc tính
    //bước 2: tạo contructor 
    //bước 3: tạo getter và setter
    //bước 4: tạo phương thức: toString,...

    String bookCode;
    String bookName;
    String producer;
    int yearPublished;
    int numberBooks;
    String location;

    public Library() {
    }

    public Library(String bookCode, String bookName, String producer, int yearPublished, int numberBooks,
            String location) {
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.producer = producer;
        this.yearPublished = yearPublished;
        this.numberBooks = numberBooks;
        this.location = location;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getNumberBooks() {
        return numberBooks;
    }

    public void setNumberBooks(int numberBooks) {
        this.numberBooks = numberBooks;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sách: ");
        bookCode = sc.nextLine();
        System.out.println("Nhập tên sách: ");
        bookName = sc.nextLine();
        System.out.println("Nhập nhà xuất bản: ");
        producer = sc.nextLine();
        System.out.println("Nhập năm xuất bản: ");
        yearPublished = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số lượng: ");
        numberBooks = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vị trí: ");
        location = sc.nextLine();
    }

    @Override
    public String toString() {
        return  bookCode + " - " + bookName + " - " + producer + " - " + 
        yearPublished + " - " + numberBooks + " - " + location;
    }




}
