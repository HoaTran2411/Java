public class Circle extends Shape implements ICircle {
    double r;
    
    public Circle(double r) {
        this.r = r;
    }

    @Override
    public void radius() {
        System.out.printf("Đường kính hình tròn bằng %.2f\n", r);
    }

    @Override
    public void perimeter() {
        System.out.printf("Chu vi hình tròn bằng %.2f\n", 2 * r * Math.PI);
        
    }

    @Override
    public void area() {
        System.out.printf("Diện tích hình tròn bằng: %.2f\n", (r * r * Math.PI));
        
    }
    
}
