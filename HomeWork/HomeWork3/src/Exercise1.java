public class Exercise1 {
    // Câu 1: Cho chuỗi "Hello every one", thực hiện:
    // Ký tự e xuất hiện bao nhiêu lần và có index là bao nhiêu
    public void countCharacters() {
        String str = "Hello every one";
        int countE = 0;
        System.out.print("Ký tự 'e' có index bằng: ");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                countE++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Ký tự 'e' xuất hiện: " + countE + " lần");
    }
}