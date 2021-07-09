import java.util.Scanner;

public class SchoolBook extends Library {
    //số trang, tình trạng, số lượng mượn
    int numberPages;
    String status;
    int numberBorrow;
    public SchoolBook(String bookCode, String bookName, String producer, int yearPublished, int numberBooks,
            String location, int numberPages, String status, int numberBorrow) {
        super(bookCode, bookName, producer, yearPublished, numberBooks, location);
        this.numberPages = numberPages;
        this.status = status;
        this.numberBorrow = numberBorrow;
    }
    public SchoolBook() {
    }
    public int getNumberPages() {
        return numberPages;
    }
    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getNumberBorrow() {
        return numberBorrow;
    }
    public void setNumberBorrow(int numberBorrow) {
        this.numberBorrow = numberBorrow;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhập số trang: ");
        numberPages = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tình trạng: ");
        status = sc.nextLine();
        System.out.println("Nhập số lượng mượn: ");
        numberBorrow = Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return super.toString() + " - " + numberPages + " - " + 
        status + " - " + numberBorrow;
    }

    
    
}
