public class App {
    public static void main(String[] args) throws Exception {
        Triangle triangle = new Triangle(5,4,6);
        System.out.printf("Chiều cao của tam giác là %.2f\n", triangle.height());
        triangle.perimeter();
        triangle.area();

        Circle circle = new Circle(5.23);
        circle.radius();
        circle.perimeter();
        circle.area();
        


    }
}
