public class Project extends Book implements IWareHouse {
    private long numberPages;
    private String status;
    private int yearOfProtections;
    private String location;

    public Project(long id, String name, String publisher, long numberPages, String status, int yearOfProtections,
            String location) {
        super(id, name, publisher);
        this.numberPages = numberPages;
        this.status = status;
        this.yearOfProtections = yearOfProtections;
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

    public int getYearOfProtections() {
        return yearOfProtections;
    }

    public void setYearOfProtections(int yearOfProtections) {
        this.yearOfProtections = yearOfProtections;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + numberPages + " - " + status + " - " + yearOfProtections + " - " + getLocation();
    }

}
