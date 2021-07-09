public class Student extends Teacher{
    //gọi thuộc tính
    double theoryPoint, practicePoint;

    //tạo contructor 
    public Student(String name, int age, String address, long salary, double theoryPoint, double practicePoint) {
        super(name, age, address, salary);
        this.theoryPoint = theoryPoint;
        this.practicePoint = practicePoint;
    }

    public Student() {
    }

    //tạo getter và setter
    public double getTheoryPoint() {
        return theoryPoint;
    }

    public void setTheoryPoint(double theoryPoint) {
        this.theoryPoint = theoryPoint;
    }

    public double getPracticePoint() {
        return practicePoint;
    }

    public void setPracticePoint(double practicePoint) {
        this.practicePoint = practicePoint;
    }

    //gọi phương thức: 
    @Override
    public String toString() {
        return super.toString() + "-" + theoryPoint + "-" + practicePoint;
    }

    
    

    

    

}
