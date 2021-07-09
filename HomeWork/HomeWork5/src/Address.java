public class Address {
    String district, province;

    public Address(String district, String province) {
        this.district = district;
        this.province = province;
    }
    @Override
    public String toString() {
        return district + ", " + province;
    }
}
