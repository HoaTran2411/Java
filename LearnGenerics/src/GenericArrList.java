import java.util.ArrayList;

public class GenericArrList<T>{
    //tạo ra 1 arraylist
    ArrayList<T> list = new ArrayList<T>();

    public GenericArrList(ArrayList<T> list) {
        this.list = list;
    }

    public ArrayList<T> getList() {
        return list;
    }

    public void setList(ArrayList<T> list) {
        this.list = list;
    }
    
    //in arraylist
    public void printArrList(){
        for (T t : list){
            System.out.println(t);
        }
    }

    //thêm phần tử
    public void addEle(T ele){
        list.add(ele);
    }

    //xóa phần tử
    public void removeEle(int index){
        list.remove(index);
    }

    //thay thế phần tử
    public void setList(int index, T ele){
        list.set(index, ele);
    }
}
