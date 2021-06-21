public class Calculator {
    int num1 = 10;
    int num2 = 5;
    public int add() {
        int s = num1 + num2;
        return s;
    }
    public int subNum(){
        int a = num1 - num2;
        return a;
    }

    public float div(){
        return (float)num2/num1;
        //do num1 và num2 kiểu int, nếu k ép kiểu float cho Th này thì kết quả sẽ trả về 0, kiểu int
        
    }
}
