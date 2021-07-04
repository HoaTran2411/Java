import java.time.LocalDate;
import java.util.Random;

public class Lottery {
    LocalDate date;
    int number;
    
    Random rd = new Random();
    public Lottery(){
        this.date = LocalDate.now();
        this.number = rd.nextInt(100);
    }
    @Override
    public String toString() {
        return date + " : " + number;
    }
}
