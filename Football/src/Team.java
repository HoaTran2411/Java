import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Team {
    ArrayList<Player> allPlayers = new ArrayList<>();
    ArrayList<Player> selectedTeam;
    Random general = new Random();

    // Random rd = new Random();
    // int number = rd.nextInt();  // trả về 1 số nguyên bất kỳ
    // int number1 = rd.nextInt(int n);    // trả về 1 số nguyên nằm trong phạm vi [0...n-1]

    // tạo các biến về số lượng cầu thủ từng vị trí:
    int gateKeeperSize = 0;
    int defenderSize = 0;
    int midFieldSize = 0;
    int forwaderSize = 0;

    public void setAllPlayers() {
        allPlayers.add(new Player(1, "Marc-André ter Stegen", Position.GK));
        allPlayers.add(new Player(2, "Sergiño Dest", Position.DF));
        allPlayers.add(new Player(3, "Gerard Piqué", Position.DF));
        allPlayers.add(new Player(4, "Ronald Araújo", Position.DF));
        allPlayers.add(new Player(5, "Sergio Busquets", Position.MF));
        allPlayers.add(new Player(6, "Antoine Griezmann", Position.FW));
        allPlayers.add(new Player(7, "Miralem Pjanić", Position.MF));
        allPlayers.add(new Player(8, "Martin Braithwaite", Position.FW));
        allPlayers.add(new Player(9, "Lionel Messi", Position.FW));
        allPlayers.add(new Player(10, "Ousmane Dembélé", Position.FW));
        allPlayers.add(new Player(11, "Riqui Puig", Position.MF));
        allPlayers.add(new Player(12, "Neto", Position.GK));
        allPlayers.add(new Player(13, "Clément Lenglet", Position.DF));
        allPlayers.add(new Player(14, "Pedri", Position.MF));
        allPlayers.add(new Player(15, "Francisco Trincão", Position.FW));
        allPlayers.add(new Player(16, "Jordi Alba", Position.DF));
        allPlayers.add(new Player(17, "Matheus Fernandes", Position.MF));
        allPlayers.add(new Player(18, "Sergi Roberto", Position.DF));
        allPlayers.add(new Player(19, "Frenkie de Jong", Position.MF));
        allPlayers.add(new Player(20, "Ansu Fati", Position.FW));
        allPlayers.add(new Player(21, "Samuel Umtiti", Position.DF));
        allPlayers.add(new Player(22, "Junior Firpo", Position.DF));
    }

    public void getAllPlayers() {
        setAllPlayers();
        System.out.println("Danh sách toàn bộ cầu thủ: ");
        for (Player player : allPlayers) {
            System.out.println(player);
        }
    }

    // Tiến hành lựa chọn 11 cầu thủ ngẫu nhiên theo các mô hình
    // 1GK - 4DF - 4MF - 2FW
    // 1GK - 4DF - 3MF - 3FW
    // 1GK - 3DF - 5MF - 2FW

    public void chooseTeamPlayers() {
        selectedTeam = new ArrayList<Player>();
        ListChoose.chooseTeam();
        System.out.println("Nhập lựa chọn của bạn: ");
        Scanner sc = new Scanner(System.in);
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose) {
            case 1:
                findGateKepper(1);
                findDefenders(4);
                findMidFielders(4);
                findforWaders(2);
                printTeamPlayers();
                break;
            case 2:
                findGateKepper(1);
                findDefenders(4);
                findMidFielders(3);
                findforWaders(3);
                printTeamPlayers();
                break;
            case 3:
                findGateKepper(1);
                findDefenders(3);
                findMidFielders(5);
                findforWaders(2);
                printTeamPlayers();
                break;
            default:
                System.out.println("Lựa chọn của bạn không tồn tại!");
                break;

        }

    }

    public void printTeamPlayers() {
        System.out.println("Danh sách 11 cầu thủ: ");
        for (Player player : selectedTeam) {
            System.out.println(player);
        }
    }


    public void findGateKepper(int a) {
        while (gateKeeperSize < a) { // Vì GK chỉ có 1 người nên vòng lặp sẽ dừng lại khi tìm được 1 người
            int rdGateKeeper = general.nextInt(22); // tìm cầu thủ ngẫu nhiên
            // Nếu cầu thủ ở vị trí ngẫu nhiên có vị trí là GK thì thêm vào danh sach
            if (allPlayers.get(rdGateKeeper).getPosition().equals(Position.GK)) {
                selectedTeam.add(allPlayers.get(rdGateKeeper));
                gateKeeperSize++;
            }
        }
    }

    public void findDefenders(int a) {
        while (defenderSize < a) {
            int rdDefender = general.nextInt(22);
            if (allPlayers.get(rdDefender).getPosition().equals(Position.DF)
                    && !selectedTeam.contains(allPlayers.get(rdDefender))) {
                selectedTeam.add(allPlayers.get(rdDefender));
                defenderSize++;
            }
        }
    }

    public void findMidFielders(int a) {
        while (midFieldSize < a) {
            int rdMidFielder = general.nextInt(22);
            if (allPlayers.get(rdMidFielder).getPosition().equals(Position.MF)
                    && !selectedTeam.contains(allPlayers.get(rdMidFielder))) {
                selectedTeam.add(allPlayers.get(rdMidFielder));
                midFieldSize++;
            }
        }
    }

    public void findforWaders(int a) {
        while (forwaderSize < a) {
            int rdForWader = general.nextInt(22);
            if (allPlayers.get(rdForWader).getPosition().equals(Position.FW)
                    && !selectedTeam.contains(allPlayers.get(rdForWader))) {
                selectedTeam.add(allPlayers.get(rdForWader));
                forwaderSize++;
            }
        }
    }

}
