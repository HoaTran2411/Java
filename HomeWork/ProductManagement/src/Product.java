import java.text.DecimalFormat;

public class Product {
    private long id;
    private String name;
    private Category category;
    private long quantity;
    private long price;
    private long quantitySold;

    public Product(long id, String name, Category category, long quantity, long price, long quantitySold) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
        this.quantitySold = quantitySold;
    }

    public Product() {
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(long quantitySold) {
        this.quantitySold = quantitySold;
    }

    public String formatNumber(long number) {
        DecimalFormat df = new DecimalFormat("###,###,##0.00");
        return df.format(number);
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + category.getValue() + " - " + quantity + " - " + formatNumber(price) + " - "
                + quantitySold;
    }

}
