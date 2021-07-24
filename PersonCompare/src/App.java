public class App {
    public static void main(String[] args) throws Exception {
        Repository repository = new Repository();
        repository.show();
        Collection.sort(repository.list);
        
        System.out.println("Danh sách sau khi sắp xếp dựa theo comparable: ");
        repository.show();
        System.out.println("Danh sách sau khi sắp xếp dựa theo comparator: ");
        Collection.sort(repository.list, new Comparable<Person>());
        
    }
}
