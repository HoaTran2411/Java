public class ClassGenerics<T> {
    // Generic array: có thể dùng chung các thuộc tính
    // truyền vào kiểu dữ liệu string hoặc int,... đều dùng dc, sẽ giống như là
    // contructor: tạo 1 cái dùng mọi nơi

    T[] array; // tức là tạo ra thuộc tính là 1 array có tên là array, kiểu dữ liệu là T: đại
               // diện cho mọi kiểu dữ liệu
    // phải khai báo ở trên class, trong dấu <>

    public ClassGenerics(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    // in ra array
    public void printArr() {
        for (T t : array) {
            System.out.println(t);
        }
    }

}
