public class Triangle extends Shape implements ITriangle{
    int a, b, c;
    
    
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double height() {
        double p = (double)((a+b+c)/2);
        double h = 2 * (Math.sqrt(p * (p-a) * (p-b)* (p-c)) / a);
        //System.out.printf("Chiều cao của tam giác là: %.2f\n",h);
        return h;
    }

    @Override
    public void perimeter() {
        System.out.printf("Chu vi tam giác là %d\n", (a+b+c));
        
    }

    @Override
    public void area() {
        System.out.printf("Diện tích tam giác là: %.2f\n", (height() * a));
        
    }
    
}
