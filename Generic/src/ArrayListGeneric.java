import java.util.ArrayList;

public class ArrayListGeneric<T> {
    ArrayList<T> arrayList = new ArrayList<T>();

    public ArrayListGeneric(ArrayList<T> arrayList) {
        this.arrayList = arrayList;
    }

    public ArrayList<T> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<T> arrayList) {
        this.arrayList = arrayList;
    }
    
    //thêm phần tử:
    public void add(T value){
        arrayList.add(value);
    }

    //sửa phần tử
    public void edit(int index, T element){
        arrayList.set(index, element);
    }

    //xóa phần tử
    public void delete(T element){
        arrayList.remove(element);
    }

    //in ra arraylist
    public void print(ArrayList<T> list){
        for (T t : list) {
            System.out.println(t);
        }
    }

}
