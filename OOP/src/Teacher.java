public class Teacher extends Person {
    
    private Long salary;

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Teacher(Long salary) {
        this.salary = salary;
    }

    public Teacher(String name, int age, String address, Long salary) {
        super(name, age, address);
        this.salary = salary;
    }

    public Teacher() {
    }
    
}
