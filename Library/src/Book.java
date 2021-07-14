public abstract class Book {
    private long id;
    private String name, publisher;

    public Book(long id, String name, String publisher) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + publisher;
    }

}
