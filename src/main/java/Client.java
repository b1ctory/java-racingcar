import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,)기준으로 구분");
        String carName = scanner.nextLine();

        System.out.println("시도할 횟수는 몇 회 인가요?");
        int playTime = scanner.nextInt();

        CarManager cm = new CarManager(carName, playTime);

        cm.putCarName();
        cm.playResult(playTime);
        cm.result();
    }
}
