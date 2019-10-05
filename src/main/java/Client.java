import java.util.*;

public class Client {
    private int playTime = 0;
    private int count = 0;
    private List<String> temp;
    private ArrayList<Car> carName = new ArrayList<>();
    String input = "";

    public Client() {
        playStart();
        result();
    }

    public void playStart() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,)기준으로 구분");
        input = scanner.nextLine();
        temp = Arrays.asList(input.split(","));

        for(int i = 0; i < temp.size(); i++){
            carName.add(new Car(temp.get(i)));
        }

        System.out.println("시도할 횟수는 몇 회 인가요?");
        playTime = scanner.nextInt();
        playResult(playTime);
    }

    public void playResult(int playTime){
        System.out.println("\n실행 결과 >>>>>\n");
        for(int i = 0; i < playTime; i++){
            drawResult();
        }
    }

    public void drawLine(int len) {
        String str = "-";
        for(int i = 0; i < len; i++){
            str += "-";
        }
        System.out.println(str);
    }

    public void drawResult(){
        for(int i = 0; i < carName.size(); i++){
            carName.get(i).sumPosition(moving());
            System.out.print(carName.get(i).getName() + " : ");
            drawLine(carName.get(i).getPosition());
        }
        System.out.println();
    }

    public int moving() {
        Random random = new Random();
        int move = random.nextInt(10);
        if (move >= 4){
            return 1;
        }
        return 0;
    }

    public void calCount(int i) {
        if(count < carName.get(i).getPosition()){
            count = carName.get(i).getPosition();
        }
    }

    public void setWinners(int i){
        if(count == carName.get(i).getPosition()){
            System.out.print(carName.get(i).getName() +  " ");
        }
    }

    public void result(){
        for(int i = 0; i < carName.size(); i++){
            calCount(i);
        }
        for(int i = 0; i < temp.size(); i++){
            setWinners(i);
        }
        System.out.println("가 최종 우승하였습니다.");
    }
}