import java.util.*;

public class CarManager {
    private int playTime = 0;
    private int count = 0;
    private List<String> temp;
    private List<Car> carNames = new ArrayList<>();
    String input = "";

    public CarManager(String nameList, int playTime) {
        this.input = nameList;
        this.playTime = playTime;
    }

    public void putCarName(){
        String str = "";
        temp = Arrays.asList(input.split(","));
        for(int i = 0; i < temp.size(); i++){
            str = limitName(temp.get(i));
            carNames.add(new Car(str));
        }
    }

    public String limitName(String name){
        if(name.length() > 5){
            return name.substring(0,5);
        }
        return name;
    }

    private void drawRacing(){
        for(int i = 0; i < carNames.size(); i++){
            carNames.get(i).movePosition();
            System.out.print(carNames.get(i).getName() + " : ");
            carNames.get(i).printMove();
        }
        System.out.println();
    }

    public void playResult(int playTime){
        System.out.println("\n실행 결과 >>>>>\n");
        for(int i = 0; i < playTime; i++){
            drawRacing();
        }
    }

    private void winCount() {
        for(int i = 0; i < carNames.size(); i++) {
            if (count < carNames.get(i).getPosition()) {
                count = carNames.get(i).getPosition();
            }
        }
    }

    private void pickWinners(){
        for(int i=0; i < carNames.size(); i++) {
            if (count == carNames.get(i).getPosition()) {
                System.out.print(carNames.get(i).getName() + " ");
            }
        }
    }

    public void result(){
        winCount();
        pickWinners();
        System.out.println("가 최종 우승하였습니다.");
    }
}