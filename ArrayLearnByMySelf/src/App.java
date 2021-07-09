import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //String array[] = { "java", "PHp", "js", "Python" };
        // for (int i = 0; i < array.length; i++) {
        //     System.out.println(array[i]);
        // }
        
        // nhập array từ bàn phím:
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Nhập kích thước của mảng (gồm bao nhiêu phần tử): ");
        // int lengthArr = Integer.parseInt(sc.nextLine());
        // System.out.println("Nhập vào từng phần tử của mảng: ");
        // String[] array = new String[lengthArr];
        // for (int i = 0; i < lengthArr; i++) {
        //     String value = sc.nextLine();
        //     array[i] = value;
        // }
        // printArray(array);

        //BÀI TOÁN SẮP XẾP ARRAY TĂNG DẦN VÀ GIẢM DẦN
        int array2[] = {11,7,5,4,3,10,10};
        //ý tưởng: dùng vòng lặp for, lặp qua từng phần tử trong array
        //sắp xếp theo tăng dần
        //so sánh lần lượt 1 phần tử trong array vs các phần tử còn lại, nếu mà nó nhỏ hơn giữ nguyên (vì có index bé hơn), 
        //còn nếu nó lớn hơn thì đổi chỗ --> sẽ dùng 2 vòng lặp, muốn đổi vị trí, dùng 1 biến temp để đổi:
        //tức là ban đầu cho temp đấy bằng array[i], nếu mà array[i]> array[j] thì temp sẽ đổi thành array[j]
        // for (int i = 0; i < array2.length; i++){
        //     for (int j = i+1; j < array2.length; j++){
        //         if(array2[j] < array2[i]){
        //             int temp = array2[j];
        //             array2[j] = array2[i];
        //             array2[i] = temp;
        //         }
        //     }
        // }
        // printArray2(array2);


        //nhập, in thông tin nhiều người cùng 1 lúc
        //khởi tạo mảng vs kiểu dữ liệu reference
        Person[] arrPerson = new Person[3];  //arr này gồm 3 phần tử
        //khi lúc này Person trở thành kiểu dữ liệu reference, dạng object
        
        //Person person1 = new Person("Hoa", 20, "HN"); //tạo contructor bên Person, gọi thẳng là ra
        //tạo đối tượng, không dùng contructor: 
        // person1.name = "Hoa";
        // person1.age = 20;
        // person1.address = "HN";

        //Person person2 = new Person("Mai",25, "Hưng Yên");
        //tạo đối tượng, không dùng contructor:
        // person2.name = "Mai";
        // person2.age = 30;
        // person2.address = "Hà Nam";

        // arrPerson[0] = person1;
        // arrPerson[1] = person2;
        // arrPerson[2] = new Person("Đức", 25, "Bắc Ninh");  //gọi thẳng trong đây cũng dc

        //dữ liệu nhập từ bàn phím:
        // for(int i = 0; i < arrPerson.length; i++){
        //     Person person = new Person();
        //     person.input();
        //     arrPerson[i] = person;
        // }

        

        // for (int i = 0; i < arrPerson.length; i++){
        //     System.out.println(arrPerson[i]);
        // }

        





    }




    //TẠO FUNCTION/METHOD RIÊNG CHO VIỆC IN RA ARRAY
    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Phần tử thứ %d của mảng bằng %s %n", i ,array[i]);
        }
    }

    public static void printArray2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Phần tử thứ %d của mảng bằng %s %n", i ,array[i]);
        }
    }

}
