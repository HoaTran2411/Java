public enum Category {
    FOOD("Thức ăn"), PHONE("Điện thoại"), BOOKS("Sách"), FASHION("Thời trang"), OTHERS("Khác");

    private String value;

    private Category(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
