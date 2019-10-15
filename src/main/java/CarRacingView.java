import java.util.Scanner;

public class CarRacingView {
    private final Scanner scanner = new Scanner(System.in);
    private  String car = "";
    private int playTime = 0;

    public CarRacingView(){
        input();
        run();
    }

    private void input(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,)기준으로 구분");
        car = scanner.nextLine();

        System.out.println("시도할 횟수는 몇 회 인가요?");
        playTime = scanner.nextInt();
    }

    private void run(){
        CarRacingController cm = new CarRacingController(car);
        String moveLine = "";
        cm.putCarName();

        System.out.println("\n실행 결과 >>>>>\n");
        for(int i = 0; i < playTime; i++){
            moveLine += cm.drawRacing() + "\n";
        }
        System.out.println(moveLine);
        System.out.print(cm.result() + "가 최종 우승하였습니다.");
    }


}
