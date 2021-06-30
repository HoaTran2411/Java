public class Person {
    int age = 25;
    public void getAge(){
        System.out.println(age);
    }

    public void inCreaseAge(){
        System.out.println(age+10);
    }

    public static void introduceMyself(String name, int age, String address){
        System.out.println("Tôi tên là: "+ name);
        System.out.println("Năm nay tôi: " + age + "tuổi");
        System.out.println("Địa chỉ của tôi là: " + address);
    }
}