public class EBook extends Book implements IDownload {
    private long volume;
    private long numberDownload;
    private long priceAnEBook;

    public EBook(long id, String name, String publisher, long volume, long numberDownload, long priceAnEBook) {
        super(id, name, publisher);
        this.volume = volume;
        this.numberDownload = numberDownload;
        this.priceAnEBook = priceAnEBook;
    }

    public long getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }

    public long getNumberDownload() {
        return numberDownload;
    }

    public void setNumberDownload(long numberDownload) {
        this.numberDownload = numberDownload;
    }

    public long getPriceAnEBook() {
        return priceAnEBook;
    }

    public void setPriceAnEBook(long priceAnEBook) {
        this.priceAnEBook = priceAnEBook;
    }

    @Override
    public long totalMoney() {
        return priceAnEBook * numberDownload;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + volume + "KB" + " - " + numberDownload + " - " + priceAnEBook + " VND" + " - " + totalMoney() + " VND";
    }

}
