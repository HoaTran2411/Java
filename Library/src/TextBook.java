public class TextBook extends Book implements IBorrow, IWareHouse {
    private long numberPages;             
    private String status;
    private long totalBooks;
    private long numberBorrow;
    private String location;

    public TextBook(long id, String name, String publisher, long numberPages, String status, long totalBooks,
            long numberBorrow, String location) {
        super(id, name, publisher);
        this.numberPages = numberPages;
        this.status = status;
        this.totalBooks = totalBooks;
        this.numberBorrow = numberBorrow;
        this.location = location;
    }

    public long getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(long numberPages) {
        this.numberPages = numberPages;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getTotalBooks() {
        return totalBooks;
    }

    public void setTotalBooks(long totalBooks) {
        this.totalBooks = totalBooks;
    }

    public long getNumberBorrow() {
        return numberBorrow;
    }

    public void setNumberBorrow(long numberBorrow) {
        this.numberBorrow = numberBorrow;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public long stock() {
        return (totalBooks - numberBorrow);
    }

    @Override
    public String toString() {
        return super.toString() + " - " + numberPages + " trang" + " - " + status + " - " + totalBooks + " - " + numberBorrow
                + " - " + getLocation() + " - " + stock() + " tồn kho";
    }

}
