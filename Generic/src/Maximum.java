public class Maximum {
    public <T extends Comparable<T>> T findMax(T a, T b){
        //comparable là 1 interface, chỉ có duy nhất 1 phương thức là so sánh
        T max = a;
        if(b.compareTo(max) > 0){
            max = b;
        }

        return max;

    }
    public static void main(String[] args){
        Maximum demo = new Maximum();
        System.out.println("Giá trị lớn nhất trong 2 số 4 và 7 là: " + demo.findMax(4,7));
        System.out.println("Giá trị lớn nhất trong 2 số 5.7 và 4.9 là: " + demo.findMax(5.7, 4.9));
        System.out.println("Giá trị lớn nhất trong 2 chuỗi 'Java và 'HTML' là: " + demo.findMax("Java", "HTML"));
    
    }
}
