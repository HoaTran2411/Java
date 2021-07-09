public class Hoa {
    private int age;
    private String name;
    private Address address;

    //tạo contructor
    public Hoa() {
    }

    public Hoa(int age, String name, Address address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    //tạo getter, setter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    //in ra thông tin
   public void display(){
       System.out.println(name + " - " + age + " - ");
       System.out.println(address.district + ", " + address.city + ", "
       +address.country);
   }
  
    


    
    

}
