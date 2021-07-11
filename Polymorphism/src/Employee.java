public abstract class Employee {
    protected int id;
    protected String name;
    protected int age;
    protected long basicSalary, salary;
    
    public Employee(int id, String name, int age, long basicSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(long basicSalary) {
        this.basicSalary = basicSalary;
    }

    //tạo phương thức abstract calculatorSalary
    public abstract void calculatorSalary();

    //tạo phương thức toString
    @Override
    public String toString() {
        return id + " - " + name + " - " + age + " - " + basicSalary;
    }




}
